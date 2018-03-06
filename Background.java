import java.awt.*;  
   
  
public class Background implements Runnable {
  public void Background() {}  
    
  public void draw(Graphics g) {  
    g.setColor(Color.black);
    g.drawRect(0, 600, 1360, 100);  
    g.fillRect(0, 600, 1360, 100);
    
    g.setColor(new Color(85, 51, 0));
    g.fillRect(0, 475, 1360, 125);
 
    g.setColor(new Color(0, 100, 0));
    g.fillRect(0, 475, 1360, 20);
    boolean check = true;
    int xShift = 20;
    int[] x = {xShift, xShift+50, xShift+50-2, xShift-2};
    int[] y = {620, 620, 625, 625};
   
    
    while(check==true)
    {
        g.setColor(Color.yellow);
        g.drawPolygon(x, y, 4);
        g.fillPolygon(x, y, 4);
        
        for (int i=0; i<x.length; i++)
        {
            x[i] +=90;
        }
        if (x[1]>=1360)
        {
            check=false;
        }
    } 

     
  }  
  
  public void run()
  {
    }
}