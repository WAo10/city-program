import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.applet.Applet;
import java.awt.*;
 
public class City extends Applet implements MouseListener{
   Graphics bufferGraphics, bufferGraphics2;
   Image offscreen, offscreen2;
   StringBuffer strBuffer;
   private Building build1, build2, build3, build4, build5;
   private Background back;
   private Sky sky;
   private Car car, car2;
   private boolean check = false;
   private FieryDeath death;
   
   public void init() {
      addMouseListener(this);
      strBuffer = new StringBuffer();
      //addItem("initializing the applet ");
      build1 = new Building(400, 150, 50);
      build2 = new Building(250, 125, 300);
      build3 = new Building(500, 175, 500);
      build4 = new Building(100, 200, 750);
      build5 = new Building(300, 150, 1050);
      
      death = new FieryDeath();
      
      sky = new Sky();
      
      back = new Background();
      
      car = new Car(625, 5, Color.blue);
      car2 = new Car(610, 1, Color.green);
      
      Thread t1 = new Thread(sky);
      t1.start();
      
      Thread t2 = new Thread(build1);
      t2.start();
      
     Thread t3 = new Thread(build2);
      t3.start();
      
     Thread t4 = new Thread(build3);
      t4.start();
      
      Thread t5 = new Thread(build4);
      t5.start();
    
     Thread t6 = new Thread(build5);
      t6.start();
    
      Thread t7 = new Thread(back);
      t7.start();
      
      Thread t8 = new Thread(car);
      t8.start();
      
      Thread t9 = new Thread(car2);
      t9.start();
      
      Thread t10 = new Thread(death);
      t10.start();
      
      setSize(1340, 650);
      offscreen = createImage(1350, 730);
      
      bufferGraphics = offscreen.getGraphics();
     
   }

  
   /*
   public void stop() {
      addItem("\nstopping the applet ");
   }

   public void destroy() {
      addItem("\nunloading the applet");
   }
  
*/
   
  
   public void paint(Graphics page) {
      start();
      
      back.draw(bufferGraphics);
      
      sky.draw(bufferGraphics);
      
      build1.draw(bufferGraphics);
      build2.draw(bufferGraphics);
      build3.draw(bufferGraphics);
      build4.draw(bufferGraphics);
      build5.draw(bufferGraphics);
      
      car.draw(bufferGraphics);
      car2.draw(bufferGraphics);
      
      page.drawImage(offscreen, 0, 0, this);
      
      //if (check==true)
      //{
          death.draw(bufferGraphics);
        //}
      
      /*
      try
      {
          Thread.sleep(1);
        } catch(InterruptedException e){}
      */
      
        update(page);
   }
   
   public void update(Graphics page)
   {
       try{
           Thread.sleep(17);
    } catch (InterruptedException e){}
    paint(page);
   }
   public void mouseEntered(MouseEvent event) {
   }
   public void mouseExited(MouseEvent event) {
   }
   public void mousePressed(MouseEvent event) {
       check = true;
   }
   public void mouseReleased(MouseEvent event) {
   }
   public void mouseClicked(MouseEvent event) {
   }
   
}
