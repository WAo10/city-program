
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
        g.fillOval(x, y, 50, 50);
    }
    
    public void run()
    {
        while(true)
        {
            y = ((int)(0.0001*Math.pow((x-700), 2)+50));
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
