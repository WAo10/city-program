//import java.awt.event.MouseListener;
//import java.awt.event.MouseEvent;
import java.applet.Applet;
import java.awt.*;
 
public class City extends Applet{ //implements MouseListener {
   StringBuffer strBuffer;
   private Building build1, build2, build3, build4, build5;
   public void init() {
      //addMouseListener(this);
      strBuffer = new StringBuffer();
      //addItem("initializing the applet ");
      build1 = new Building(400, 150, 50);
      build2 = new Building(250, 125, 300);
      build3 = new Building(500, 130, 600);
      build4 = new Building(100, 160, 800);
      build5 = new Building(300, 140, 1100);
      setSize(1360, 768);
   }

   
   //public void start() {
      //addItem("\nstarting the applet ");
   //}
   /*
   public void stop() {
      addItem("\nstopping the applet ");
   }

   public void destroy() {
      addItem("\nunloading the applet");
   }
  
   
   void addItem(String word) {
      System.out.println(word);
      strBuffer.append(word);
      repaint();
   }
*/
   
  
   public void paint(Graphics page) {
      start();
      build1.draw(page);
      build2.draw(page);
      build3.draw(page);
      build4.draw(page);
      build5.draw(page);
   }


   /*
   public void mouseEntered(MouseEvent event) {
   }
   public void mouseExited(MouseEvent event) {
   }
   public void mousePressed(MouseEvent event) {
   }
   public void mouseReleased(MouseEvent event) {
   }
   public void mouseClicked(MouseEvent event) {
      addItem("mouse clicked! ");
   }
   */
}