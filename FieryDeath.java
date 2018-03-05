
import java.awt.*;
public class FieryDeath implements Runnable
{
    private int y = 0;
    private boolean death = false;
    
    public FieryDeath()
    {
    }

    public void draw(Graphics g)
    {
            g.setColor(Color.orange);
            g.fillOval(500, y, 100, 100);

            g.drawString("And the world was annihilated", 680, 360);
    }
    
    public void run()
    {
        while (true)
        {
            y+=1;
            if(y > 700)
            {
                death = true;
            }
        }
    }
}
