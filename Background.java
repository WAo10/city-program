import java.awt.*;  
import java.applet.*;  
   
  
public class Background extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"C:\\Users\\wtao\\Downloads\\Coarse_Dirt.png");  
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(picture, 30,30, this);  
  }  
      
  }  