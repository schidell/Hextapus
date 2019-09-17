import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Diver objects that the octopus can eat.
 * 
 * @author Shivani Chidella 
 * @version Jan 2017
 */
public class Diver extends Actor
{
    Game world; 
    
    /**
     * Constructor for objects of class Diver.
     * 
     */
    public Diver()
    {
       GreenfootImage image = getImage();  
       image.scale(75, 30);
       setImage(image); 
    }
    
    /**
     * Act - do whatever the Diver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move (5);
        
        // Conditional to erase Diver objects at the edge of screen
        if (isAtEdge())
        {
            world = (Game) getWorld();
            world.removeObject (this);
        }
    }    
}
