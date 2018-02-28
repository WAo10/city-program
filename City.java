//import java.awt.event.MouseListener;
//import java.awt.event.MouseEvent;
import java.applet.Applet;
import java.awt.*;
 
public class City extends Applet{ //implements MouseListener {
   Graphics bufferGraphics;
   Image offscreen;
   StringBuffer strBuffer;
   private Building build1, build2, build3, build4, build5;
   public void init() {
      //addMouseListener(this);
      strBuffer = new StringBuffer();
      //addItem("initializing the applet ");
      build1 = new Building(400, 150, 50);
      build2 = new Building(250, 125, 300);
      build3 = new Building(500, 175, 500);
      build4 = new Building(100, 200, 750);
      build5 = new Building(300, 150, 1050);
      setSize(1360, 768);
      offscreen = createImage(1360, 768);
      bufferGraphics = offscreen.getGraphics();
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
      build1.draw(bufferGraphics);
      build2.draw(bufferGraphics);
      build3.draw(bufferGraphics);
      build4.draw(bufferGraphics);
      build5.draw(bufferGraphics);
      page.drawImage(offscreen, 0, 0, this);
      repaint();
   }

   public void update(Graphics page)
   {
       paint(page);
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