
import java.awt.*;
public class Sky implements Runnable
{

    private int blue = 0;
    private int x, y;
    private boolean day = true;
    private Color color = Color.yellow;
    
    /**
     * Constructor for objects of class Sky
     */
    public Sky()
    {}

    public void draw(Graphics g)
    {
        g.setColor(new Color(0, 0, blue));
        g.fillRect(0, 0, 1360, 475);
        g.setColor(color);
        g.fillOval(x, y, 15, 15);
    }
    
    public void run()
    {
        while(true)
        {
            y = (500-(int)(0.001*Math.pow((x-390), 2)+500));
            x+=1;
            if(x>1400)
            {
                x=0;
                if (day==true)
                {
                    day=false;
                }
                else
                {
                    day=true;
                }
            }
            if(day==true)
            {
                color = Color.yellow;
                if (x>1050 && blue>0)
                {
                        blue-=1;
                }
                else if (x>0 && blue<255)
                {
                        blue+=1;
                }
            }
            else
            {
                color = Color.white;
                if (x>1100 && blue<255)
                {
                        blue+=1;
                }
            }
            try
            {
            Thread.sleep(17);
            } catch(InterruptedException e){}
        }
        
    }
}
