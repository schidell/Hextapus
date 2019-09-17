import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * The game instructions.
 * 
 * @author Shivani Chidella 
 * @version Jan 2017
 */
public class Instructions extends World
{
    PlayButton play;
    Octopus octopus; 
    
    Label label1;
    Label label2;
    Label label3;
    Label label4;
    Label label5;
    
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
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
        // Adds a moving image of the octopus
        Hextapus hextapus = new Hextapus();
        hextapus.image.scale(95, 65);
        addObject(hextapus, 100, 100);
        
        // Adds labels to explain the instructions
        label1 = new Label("You are Hextapus, a six-legged octopus.", 25);
        addObject(label1, 385, 100);
        label1.setFillColor(Color.WHITE);
        
        label2 = new Label("Move through the ocean using the arrow keys.", 25);
        addObject(label2, 420, 140);
        label2.setFillColor(Color.WHITE);
        
        label3 = new Label("Eat fish and divers for points.", 25);
        addObject(label3, 200, 200);
        label3.setFillColor(Color.WHITE);
        
        label4 = new Label("For extra points, shoot ink balls at sharks using the spacebar.", 25);
        addObject(label4, 375, 240);
        label4.setFillColor(Color.WHITE);
        
        label5 = new Label("If you are eaten by a shark, it's game over!", 25);
        addObject(label5, 270, 280);
        label5.setFillColor(Color.WHITE);
        
        // Adds a Play button
        play = new PlayButton("PLAY", 80);
        addObject(play, 375, 350);
        play.setFillColor(Color.PINK);
        play.setLineColor(Color.PINK);
    }
}
