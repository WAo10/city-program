import java.awt.*;
import java.applet.Applet;
import java.util.Random;
public class Building //implements Runnable
{
   private int height, width, x;
   private int windowState[];
   private Random gen = new Random();
    public Building(int tall, int wide, int pos)
    {
        height = tall;
        width = wide;
        x = pos;
        windowState = new int[((wide*pos)%10)];
    }
     
    public void draw(Graphics page)
    {
        page.setColor(Color.black);
        page.drawRect(x, 100, width, height);
        page.drawLine(x, 100, x+50, 100-50);
        page.drawLine(x+width, 100, x+width+50, 100-50);
        page.drawLine(x+width, height+100, x+width+50, height+50);
        page.drawLine(x+width+50, 100-50, x+width+50, height+100-50);
        page.drawLine(x+50, 100-50, x+width+50, 100-50);
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

