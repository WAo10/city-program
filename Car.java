
import java.awt.*;

public class Car implements Runnable
{
    private int xPos=0;
    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(xPos, 625, 45, 10);
        g.fillOval(xPos+5, 632, 8, 8);
        g.fillOval(xPos+30, 632, 8, 8);
    }
    
    public void run()
    {
        while(true)
        {
            xPos+=1;
            if(xPos>1500)
            {
                xPos=0;
            }
           
        }
    }
}
