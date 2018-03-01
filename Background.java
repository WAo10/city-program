import java.awt.*;  
   
  
public class Background{ 
  public void Background() {}  
    
  public void draw(Graphics g) {  
    g.drawRect(0, 600, 1360, 100);  
    g.fillRect(0, 600, 1360, 100);
    
 
    boolean check = true;
    int xShift = 20;
    int[] x = {xShift, xShift, xShift+50, xShift+50};
    int[] y = {600, 600, 610, 610};
    while(check==true)
    {
        g.setColor(Color.yellow);
        g.drawPolygon(x, y, 4);
        g.fillPolygon(x, y, 4);
        
        xShift+=70;
        if (xShift>=768)
        {
            check=false;
        }
    } 

      
  }  
}