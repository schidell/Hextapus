import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A large shark image that floats upwards and downwards.
 * 
 * @author Shivani Chidella 
 * @version Jan 2017
 */
public class EvilShark extends Actor
{
    boolean shift = true;
    SimpleTimer timer = new SimpleTimer();
    
    /**
     * Act - do whatever the EvilShark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Conditional to move if 700 milliseconds pass
        if (timer.millisElapsed() > 700) 
        {
            shift = !shift;
            timer.mark();
        }
        
        // Conditional to move down and to the right
        if (shift)
        {
            setLocation(getX(), getY() + 1);
            move (1);
        }
        
        // Conditional to move up and to the left
        else 
        {
            setLocation(getX(), getY() - 1);
            move (-1);
        }
    }
    
    /**
     * Constructor for objects of class EvilShark.
     * 
     */
    public EvilShark()
    {
        GreenfootImage image = getImage();  
        image.scale(260, 180);
        setImage(image);
    }    
}
