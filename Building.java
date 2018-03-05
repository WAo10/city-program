import java.awt.*;
import java.applet.Applet;
import java.util.Random;
public class Building implements Runnable
{
   private int height, width, x;
   private int base;
   private Window windows;

   private Random gen = new Random();
    public Building(int tall, int wide, int pos)
    {
        height = tall;
        width = wide;
        x = pos;
        base = 450+(150-height);
        windows = new Window(width, height, x, base);
    }
     
    public void draw(Graphics page)
    {
        int[] points = {10, 50, 90, 50, 10};
        page.setColor(Color.black);
        page.drawRect(x, base, width, height);
        
        page.setColor(new Color(100, 100, 100));
        page.fillRect(x+1 ,base+1, width-1, height-1);
 
        int[] pointx1 = {x, x+width, x+width+50, x+50};
        int[] pointy1 = {base, base, base-50, base-50};
        page.fillPolygon(pointx1, pointy1, 4);
        
        int[] pointx2 = {x+width+1, x+width+50+1, x+width+50+1, x+width+1};
        int[] pointy2 = {base, base-50, height+base-50, height+base};
        page.fillPolygon(pointx2, pointy2, 4);
        
        page.setColor(Color.black);
        page.drawLine(x, base, x+50, base-50);
        page.drawLine(x+width, base, x+width+50, base-50);
        page.drawLine(x+width, height+base, x+width+50, base+height-50);
        
        page.drawLine(x+width+50, base-50, x+width+50, height+base-50);
        page.drawLine(x+50, base-50, x+width+50, base-50);
        
        windows.paint(page);
  
        
     
       }

    public int getPos()
    {
        return 0;
    }
    
    
    public void run()
    {
        while(true)
        {
        }
    }
    
    
}

