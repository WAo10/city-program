
public class Building implements Runnable
{
   private int height, x;
    public Building(int tall, int pos)
    {
        height = tall;
        x = pos;
    }
    
    public void draw(Graphics page)
    {
        page.drawRect(x, 1000, 100, height);
    }

    

}
