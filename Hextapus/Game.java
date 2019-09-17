import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * The world in which gameplay occurs.
 * 
 * @author Shivani Chidella 
 * @version Jan 2017
 */
public class Game extends World
{
    Octopus octopus;
    Fish fish; 
    Diver diver; 
    Fish2 fish2;
    
    Spawner spawner;
    Spawner2 spawner2;
    
    Label theScore;
    Label ouch; 
    
    GreenfootSound dead = new GreenfootSound("Dead.mp3");
    
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        // Creates the world with 750x415 cells with a cell size of 1x1 pixels.
        super(750, 415, 1); 
        
        // Calls the method prepare
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Adds the octopus hero, spawners and score label
        octopus = new Octopus();
        addObject(octopus, 375, 320);

        spawner = new Spawner();
        addObject(spawner, 720, 200);

        spawner2 = new Spawner2();
        addObject(spawner2, 10, 200);

        theScore = new Label(octopus.score, 50);
        addObject(theScore, 375, 100);
        theScore.setFillColor(Color.WHITE);
    }

    /**
     * Updates the visible score
     *
     */
    public void updateScoreLabel() 
    {
        theScore.setValue(octopus.score);
    }
    
    /**
     * Execute all events when octopus dies.
     * Specifically: add necessary objects and effects, and move to the end page.
     *
     */
    public void gameOver() {
        // Updates the game score
        End.finalScore = octopus.score;
        
        dead.play();
        octopusBlink();

        // Automatic direct to losing page after the game ends
        Greenfoot.setWorld(new End());
    }
    
    /**
     * Adds a blinking animation to the octopus hero to indicate death.
     * Also adds a moving label above the octopus.
     *
     */
    public void octopusBlink() {
        // Octopus coordinates
        int octopusX = octopus.getX();
        int octopusY = octopus.getY();

        // Label to indicate contact
        ouch = new Label("OUCH", 20);
        ouch.setLineColor(Color.PINK);
        addObject(ouch, octopusX, octopusY - 40);
        
        for (int i = 0; i < 10; i++)
        {
            Greenfoot.delay(20);
            if (i % 2 == 0)
            {
                ouch.setLocation (octopusX + 0, octopusY - 43);
                octopus.image.setTransparency(100);
            }
            else
            {
                ouch.setLocation (octopusX + 0, octopusY - 40);
                octopus.image.setTransparency(200);
            }
        }
    }
    
    /**
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        updateScoreLabel();
        
        int num1 = Greenfoot.getRandomNumber(50);
        int num2 = Greenfoot.getRandomNumber(500);
        int num3 = Greenfoot.getRandomNumber(100);
        
        int y = Greenfoot.getRandomNumber(100) + 200;
        
        // Conditional for a 1 in 50 chance to generate a new fish
        if (num1 == 1)
        {
            int x = 0;
            
            fish = new Fish();
            addObject (fish, x, y);
        }
        
        // Conditional for a 1 in 500 chance to generate a new diver
        if (num2 == 1)
        {
            int x = 0;
            
            diver = new Diver();
            addObject (diver, x, y);
        }
        
        // Conditional for a 1 in 100 chance to generate a new fish2
        if (num3 == 1)
        {
            int x = 750;
            
            fish2 = new Fish2();
            addObject (fish2, x, y);
        }
    }
}
