import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.applet.Applet;
import java.awt.Graphics;

public class City extends Applet implements MouseListener {
   StringBuffer strBuffer;
   private Building build1, build2, build3, build4, build5;
   public void init() {
      addMouseListener(this);
      strBuffer = new StringBuffer();
      addItem("initializing the applet ");
      Building build1 = new Building(250, 50, 50);
      setSize(1360, 768);
   }

   public void start() {
      addItem("\nstarting the applet ");
   }

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

   public void paint(Graphics g) {
      build1.draw(g);
   }


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
}