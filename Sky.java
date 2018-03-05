
import java.awt.*;
public class Sky implements Runnable
{

    private int blue = 255;
    private boolean rise = true;
    private int x, y;
    private int count = 1400%255;
    private int check = 0;
    /**
     * Constructor for objects of class Sky
     */
    public Sky()
    {}

    public void draw(Graphics g)
    {
        g.setColor(new Color(0, 0, blue));
        g.fillRect(0, 0, 1360, 475);
        g.setColor(Color.yellow);
        g.fillOval(x, 50, 15, 15);
    }
    
    public void run()
    {
        while(true)
        {
            check+=1;
            if(check==count)
            {
            x+=1;
        }
            if(x==1400)
            {
                x=0;
            }
            if (rise==true)
            {
                blue-=1;
            }
            else if (rise==false)
            {
                blue+=1;
            }
            if (blue==0)
            {
                rise=false;
            }
            else if (blue==255)
            {
                rise=true;
            }
            try
        {
            Thread.sleep(17);
        } catch(InterruptedException e){}
        }
        
    }
}
