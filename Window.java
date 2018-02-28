
/**
 * William Ao
 */
import java.awt.*;
import java.util.Random;
public class Window
{
    private int wide, tall, pos, base;
    private Random gen = new Random();
    /**
     * Constructor for objects of class Window
     */
    public Window(int width, int height, int x, int top)
    {
        wide = width;
        tall = height;
        pos = x;
        base = top;
    }

    
    public void paint(Graphics page)
    {
        int hSpace = 5;
        int vSpace = 5;
        boolean check = true;
        while (check)
        {
                page.fillRect(pos+hSpace, base+vSpace, 15, 15);
                if (gen.nextInt(3)==2)
                {
                    page.setColor(Color.yellow);
                    page.fillRect(pos+hSpace, base+vSpace, 15, 15);
                    page.setColor(Color.black);
                    try
                    {
                         Thread.sleep(17);
                    } catch(InterruptedException e){}
                
                }
                else if (gen.nextInt(10) == 1)
                {
                    page.setColor(Color.black);
                    page.fillRect(pos+hSpace, base+vSpace, 15, 15);
                }
                hSpace+=25;
                if (hSpace+15>=wide)
                {
                    hSpace = 5;
                    vSpace += 25;
                }
                if (vSpace>=tall)
                {
                    check=false;
                }
        }
    }
   

}
