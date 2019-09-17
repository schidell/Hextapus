import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Fish objects that the octopus can eat.
 * 
 * @author Shivani Chidella 
 * @version Jan 2017
 */
public class Fish extends Actor
{
    Game world; 
    
    int x;
    int y;
    
    /**
     * Constructor for objects of class Fish.
     * 
     */
    public Fish()
    {
       GreenfootImage image = getImage();  
       image.scale(25, 20);
       setImage(image); 
    }
    
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move (5);
        x = getX();
        y = getY();
        
        // Conditional to erase Fish objects at the edge of screen
        if (isAtEdge())
        {
            world = (Game) getWorld();
            world.removeObject (this);
        }
    }    
}
