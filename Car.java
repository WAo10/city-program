
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
        g.fillRect(xPos, 650, 45, 10);
        g.fillOval(xPos+15, 650, 5, 5);
        g.fillOval(xPos+30, 650, 5, 5);
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
            try{
            } catch (Exception e){}
        }
    }
}
