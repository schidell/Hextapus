import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Fish2 objects that the octopus can eat.
 * 
 * @author Shivani Chidella 
 * @version Jan 2017
 */
public class Fish2 extends Actor
{
    Game world; 
    
    /**
     * Constructor for objects of class Fish2.
     * 
     */
    public Fish2()
    {
       GreenfootImage image = getImage();  
       image.scale(25, 20);
       setImage(image); 
    }
    
    /**
     * Act - do whatever the Fish2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move (-5);
        
        // Conditional to erase Fish2 objects at the edge of screen
        if (isAtEdge())
        {
            world = (Game) getWorld();
            world.removeObject (this);
        }
    }       
}
