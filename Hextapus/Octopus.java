import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The hero octopus that the user can manipulate.
 * 
 * @author Shivani Chidella 
 * @version Jan 2017
 */
public class Octopus extends Actor
{
    Game world;

    public int score = 0;

    SimpleTimer timer = new SimpleTimer();
    GreenfootImage image = getImage(); 
    
    GreenfootSound fish = new GreenfootSound("Fish.mp3");
    GreenfootSound diver = new GreenfootSound("Diver.mp3");
    
    /**
     * Constructor for objects of class Octopus.
     * 
     */
    public Octopus()
    {
        image.scale(85, 60);
        setImage(image);
    } 

    /**
     * Increases the score value by a specified increment
     *
     * @param amount is the increment
     */
    public void increaseScore(int amount) 
    {
        score += amount;
    }

    /**
     * Act - do whatever the Octopus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY();
        
        // Conditional to move right
        if (Greenfoot.isKeyDown("right"))
        {
            move (3);
        }

        // Conditional to move left
        if (Greenfoot.isKeyDown("left"))
        {
            move (-3);
        } 

        // Conditional to move up
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation (x + 0, y - 3);
        }

        // Conditional to move down
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation (x + 0, y + 3);
        }

        // Conditional to increase score by 1 if fish is eaten 
        if (isTouching(Fish.class))
        {
            fish.play();
            removeTouching(Fish.class);
            increaseScore(1);
        }

        // Conditional to increase score by 2 if diver is eaten 
        if (isTouching(Diver.class))
        {
            diver.play();
            removeTouching(Diver.class);
            increaseScore(2);
        }

        // Conditional to increase score by 1 if fish2 is eaten 
        if (isTouching(Fish2.class))
        {
            fish.play();
            removeTouching(Fish2.class);
            increaseScore(1);
        }

        // Conditional to end game if Shark objects touch octopus.
        if (isTouching(Shark.class) || isTouching(FlipShark.class))
        {
            getImage().setTransparency(150);
            removeTouching(Shark.class);
            removeTouching(FlipShark.class);
            
            world = (Game) getWorld();
            world.gameOver();
        }
        
        // Conditional to fire ink balls from bottom of octopus
        if (timer.millisElapsed() > 100 && Greenfoot.isKeyDown("space"))
        {
            InkBall ball = new InkBall();
            world = (Game) getWorld();
            world.addObject (ball, x - 1, y + 27);
            timer.mark();
        }
    }
}

