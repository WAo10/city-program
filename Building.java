import java.awt.Graphics;
import java.util.Random;
public class Building implements Runnable
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
        page.drawRect(x, 1000, width, height);
        
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

