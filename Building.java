import java.awt.*;
import java.applet.Applet;
import java.util.Random;
public class Building //implements Runnable
{
   private int height, width, x;
   private int base;
   private int windowState[];

   private Random gen = new Random();
    public Building(int tall, int wide, int pos)
    {
        height = tall;
        width = wide;
        x = pos;
        base = 450+(150-height);
        windowState = new int[((wide*pos)/10)];
    }
     
    public void draw(Graphics page)
    {
        page.setColor(Color.black);
        page.drawRect(x, base, width, height);
        
        page.drawLine(x, base, x+50, base-50);
        page.drawLine(x+width, base, x+width+50, base-50);
        page.drawLine(x+width, height+base, x+width+50, base+height-50);
        
        page.drawLine(x+width+50, base-50, x+width+50, height+base-50);
        page.drawLine(x+50, base-50, x+width+50, base-50);
        
        int horiz_space = width%6;
        int vert_space = height%6;
        boolean check = true;
        while(check==true)
        {
            page.drawRect(x+horiz_space, base+vert_space, 15, 15);
            horiz_space+=30;
            if (horiz_space>width)
            {
                vert_space+=25;
                horiz_space=10;
            }
            else if (vert_space>height)
            {
                check = false;
            }
        }
    }
    
    public int getWindow()
    {
        return windowState.length; 
    }
    public void run()
    {
        while(true)
        for (int window: windowState)
        {
            if ((gen.nextInt(1)==1) && (window==1))
            {
                window=0;
            }
                else if (gen.nextInt(1)==1)
            {
                window=1;
            }
        }
    }
    
}

