
import java.awt.*;
import java.util.Random;
public class FieryDeath implements Runnable
{
    private int y = 0;
    private boolean death = false;
    private int count = 0;
    private Random gen = new Random();
    
    
    public FieryDeath()
    {
    }

    public void draw(Graphics g)
        {
            if (death == false)
            {
                 g.setColor(Color.orange);
                 g.fillOval(500, y, 500, 500);
           }
           else if (death == true)
           {
               g.setColor(new Color(gen.nextInt(255), 0, 0));
               g.drawRect(0, 0, 1400, 800);
        }
    }
    
    public void run()
    {
        while (true)
        {
            if (count<=10000)
            {
                y+=1;
                count+=1;
            }
            else
            {
                count=0;
            }
            if(y > 700)
            {
                death = true;
            }
            try{
                Thread.sleep(17);
            } catch(InterruptedException e){}
        }
    }
}
