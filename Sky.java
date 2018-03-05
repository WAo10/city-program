
import java.awt.*;
public class Sky implements Runnable
{

    private int blue = 255;
    private boolean rise = true;
    /**
     * Constructor for objects of class Sky
     */
    public Sky()
    {}

    public void draw(Graphics g)
    {
        g.setColor(new Color(0, 0, blue));
        g.fillRect(0, 0, 1360, 475);
    }
    
    public void run()
    {
        while(true)
        {
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
            
            try{
            } catch(Exception e){}
        }
    }
}
