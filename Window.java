
/**
 * William Ao
 */
import java.util.Random;
import java.awt.*;

public class Window
{
    private int[] state;
    private int wide, tall, pos, base;
    private Window windows[];
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
        int count = 0;
        boolean check = true;
        while (check)
        {
            page.drawRect(pos+hSpace, base+vSpace, 15, 15);
                hSpace+=25;
                count+=1;

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
        state = new int[count];
    }
   
    
}
