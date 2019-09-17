import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * The welcome screen.
 * 
 * @author Shivani Chidella 
 * @version Jan 2017
 */
public class Home extends World
{
    PlayButton play;
    InsButton instructions;
    Hextapus hextapus; 
    Label title; 
    
    public static GreenfootSound bgSound = new GreenfootSound("Background.mp3");

    /**
     * Constructor for objects of class Home.
     * 
     */
    public Home()
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
        bgSound.playLoop();

        // Adds an image of Hextapus
        hextapus = new Hextapus();
        addObject(hextapus, 250, 290);

        // Adds the title
        title = new Label("HEXTAPUS", 150);
        addObject(title, 375, 100);
        title.setFillColor(Color.ORANGE);
        title.setLineColor(Color.ORANGE);

        // Adds buttons
        play = new PlayButton("PLAY", 80);
        addObject(play, 500, 230);
        play.setFillColor(Color.PINK);
        play.setLineColor(Color.PINK);

        instructions = new InsButton("How to Play", 30);
        addObject(instructions, 495, 280);
        instructions.setFillColor(Color.WHITE);
        instructions.setLineColor(Color.WHITE);
    }
}
