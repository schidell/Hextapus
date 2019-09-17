import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The octopus's ink secretions that can kill sharks.
 * 
 * @author Shivani Chidella 
 * @version Jan 2017
 */
public class InkBall extends Actor
{
    Game world;
    GreenfootSound dropInk = new GreenfootSound("Drop.mp3");
     
    /**
     * Constructor for objects of class InkBall.
     * 
     */
    public InkBall()
    {
        GreenfootImage image = getImage();  
        image.scale(10, 10);
        setImage(image); 
    }

    /**
     * Act - do whatever the InkBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Moves down
        setLocation(getX() + 0, getY() + 3);
        
        // Conditionals to kill sharks
        if (isTouching(Shark.class) || isTouching(FlipShark.class))
        {
            dropInk.play();
            
            world = (Game) getWorld();
            world.octopus.increaseScore(5);
            
            removeTouching(Shark.class);
            removeTouching(FlipShark.class);
        }
        
        // Conditional to erase InkBall objects at the edge of screen
        if (isAtEdge())
        {
            world = (Game) getWorld();
            world.removeObject (this);
        }
    }    
}
