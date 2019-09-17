import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The enemy shark that kills the hero octopus.
 * 
 * @author Shivani Chidella 
 * @version Jan 2017
 */
public class Shark extends Actor
{
    Game world; 
    GreenfootImage image = getImage();  
    
    /**
     * Constructor for objects of class Shark.
     * 
     */
    public Shark()
    {
        image.scale(55, 40);
        image.mirrorVertically();
        image.mirrorHorizontally();
        setImage(image);
    }
    
    /**
     * Act - do whatever the Shark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move (5);
        
        // Conditional to erase Shark objects at the edge of screen
        if (isAtEdge())
        {
            world = (Game) getWorld();
            world.removeObject (this);
        }
    }       
}
