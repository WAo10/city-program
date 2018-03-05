
import java.awt.*;

public class Car implements Runnable
{
    private int xPos=0;
    private int yPo, speed;
    private Color col;
    /**
     * Constructor for objects of class Car
     */
    public Car(int yPos, int fast, Color color)
    {
        yPo = yPos;
        col = color;
        speed = fast;
    }

    public void draw(Graphics g)
    {
        g.setColor(col);
        g.fillRect(xPos, yPo, 45, 10);
        int[] x = {xPos+10, xPos+30, xPos+20, xPos+15};
        int[] y = {yPo, yPo, yPo-5, yPo-5};
        g.fillPolygon(x, y, 4);
        
        g.setColor(new Color(200, 200, 200));
        g.fillOval(xPos+5, yPo+7, 8, 8);
        g.fillOval(xPos+30, yPo+7, 8, 8);
    }
    
    public void run()
    {
        while(true)
        {
            xPos+=speed;
            if(xPos>1500)
            {
                xPos=0;
            }
            try{
                Thread.sleep(17);
            } catch(InterruptedException e){}
        }
    }
}
