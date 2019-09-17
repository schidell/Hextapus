import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A large octopus image that floats upwards and downwards (Hextapus).
 * 
 * @author Shivani Chidella 
 * @version Jan 2017
 */
public class Hextapus extends Actor
{
   boolean grow = true;
   SimpleTimer timer = new SimpleTimer();
    
   GreenfootImage image = getImage();  
   
   /**
     * Act - do whatever the Hextapus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Conditional to move down by 3 if 300 milliseconds passes
        if (timer.millisElapsed() > 500) 
        {
            grow = !grow;
            timer.mark();
        }
        
        // Conditional to move up by 3
        if (grow)
        {
            setLocation(getX(), getY() + 1);
        }
        
        // Conditional to move down by 3
        else 
        {
            setLocation(getX(), getY() - 1);
        }
    }
    
    /**
     * Constructor for objects of class Hextapus.
     * 
     */
   public Hextapus()
    {
        image.scale(260, 180);
        setImage(image);
    } 
}    

