 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A spawner to generate FlipShark objects pointing to an Octopus object.
 * 
 * @author Shivani Chidella 
 * @version Jan 2017
 */
public class Spawner2 extends Actor
{
    Game world; 
    
    /**
     * Constructor for objects of class Spawner2.
     * 
     */
    public Spawner2()
    {
       GreenfootImage image = getImage();  
       image.scale(5, 5);
       setImage(image); 
       image.setTransparency(0);
    }
    
    /**
     * Act - do whatever the Spawner2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int num = Greenfoot.getRandomNumber(300);
    
        // Conditional for a 1 in 300 chance to generate a new FlipShark object
        if (num == 1)
        {
            world = (Game) getWorld();
            FlipShark flipshark = new FlipShark();
            
            int x = getX();
            int y = getY();
            world.addObject(flipshark, x, y);
            
            // Octopus' coordinates
            int octopusX = world.octopus.getX();
            int octopusY = world.octopus.getY();
        
            // Navigate towards the octopus
            flipshark.turnTowards(octopusX, octopusY);
        }    
    }
}
