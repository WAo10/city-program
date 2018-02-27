import java.awt.*;
import java.applet.Applet;
import java.util.Random;
public class Building //implements Runnable
{
   private int height, width, x;
   private int base;
   private Window windows[];

   private Random gen = new Random();
    public Building(int tall, int wide, int pos)
    {
        height = tall;
        width = wide;
        x = pos;
        base = 450+(150-height);
        windows = new Window[((wide*pos)/10)];
    }
     
    public void draw(Graphics page)
    {
        int[] points = {10, 50, 90, 50, 10};
        page.drawPolygon(points, points, 5);
        page.setColor(Color.black);
        page.drawRect(x, base, width, height);
        
        page.drawLine(x, base, x+50, base-50);
        page.drawLine(x+width, base, x+width+50, base-50);
        page.drawLine(x+width, height+base, x+width+50, base+height-50);
        
        page.drawLine(x+width+50, base-50, x+width+50, height+base-50);
        page.drawLine(x+50, base-50, x+width+50, base-50);
        
        int horiz_space = width%6+5;
        int vert_space = height%6;
        boolean check = true;
        while(check==true)
        {
            page.drawRect(x+horiz_space, base+vert_space, 15, 15);
            horiz_space+=30;
            if (horiz_space>width)
            {
                vert_space+=25;
                horiz_space=width%6+5;
            }
            else if (vert_space>height)
            {
                check = false;
            }
        }
    }
    
    public int getPos()
    {
        return 0;
    }
    
    /*
    public void run()
    {
        while(true)
        for (Window window: windows)
        {
            if ((gen.nextInt(1)==1) && (window.getState()==1))
            {
                window.changeState();
            }
                else if (gen.nextInt(1)==1)
            {
                window.changeState();
            }
        }
    }*/
    
}

