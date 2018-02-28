import java.awt.*;
import java.applet.Applet;
import java.util.Random;
public class Building //implements Runnable
{
   private int height, width, x;
   private int base;
   private Window windows;

   private Random gen = new Random();
    public Building(int tall, int wide, int pos)
    {
        height = tall;
        width = wide;
        x = pos;
        base = 450+(150-height);
        windows = new Window(width, height, x, base);
    }
     
    public void draw(Graphics page)
    {
        int[] points = {10, 50, 90, 50, 10};
        page.setColor(Color.black);
        page.drawRect(x, base, width, height);
        
        page.drawLine(x, base, x+50, base-50);
        page.drawLine(x+width, base, x+width+50, base-50);
        page.drawLine(x+width, height+base, x+width+50, base+height-50);
        
        page.drawLine(x+width+50, base-50, x+width+50, height+base-50);
        page.drawLine(x+50, base-50, x+width+50, base-50);
        
        windows.paint(page);
       }

    public int getPos()
    {
        return 0;
    }
    
    /*
    public void run()
    {
        while(true)
        {
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
        }
    }
    */
    
}

