import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Arrays;

/**
 * The directed page after a game's end.
 * 
 * @author Shivani Chidella 
 * @version Jan 2017
 */
public class End extends World
{
    public static int finalScore;
    public static int highScore = 0;
    
    PlayButton play;
    InsButton instructions;
    
    Label title; 
    Label score; 
    Label theScore;
    Label labelHighScore;
    Label theHighScore;
    
    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
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
        getHighScore();
        
        // Adds a moving image of the evil shark
        EvilShark shark = new EvilShark();
        addObject(shark, 220, 210);
        
        // Adds all the labels
        title = new Label("You Were Eaten!", 80);
        addObject(title, 375, 80);
        title.setFillColor(Color.GRAY);
        title.setLineColor(Color.GRAY);
        
        score = new Label("SCORE : ", 25);
        addObject(score, 133, 334);
        score.setFillColor(Color.WHITE);
        score.setLineColor(Color.WHITE);
        
        theScore = new Label(finalScore, 30);
        addObject(theScore, 199, 334);
        theScore.setFillColor(Color.WHITE);
        
        labelHighScore = new Label("HIGH SCORE : ", 25);
        addObject(labelHighScore, 163, 370);
        labelHighScore.setFillColor(Color.WHITE);
        labelHighScore.setLineColor(Color.WHITE);
        
        theHighScore = new Label(highScore, 30);
        addObject(theHighScore, 260, 370);
        theHighScore.setFillColor(Color.WHITE);
        
        // Adds buttons
        play = new PlayButton("Play Again", 45);
        addObject(play, 500, 220);
        play.setFillColor(Color.PINK);
        play.setLineColor(Color.PINK);
        
        instructions = new InsButton("How to Play", 30);
        addObject(instructions, 495, 270);
        instructions.setFillColor(Color.WHITE);
    }
    
    /**
     * Determines the highest score of all games played in a single execution.
     * 
     */
    public void getHighScore()
    {
        if (finalScore >= highScore) 
        {
            highScore = finalScore;
        }
        else 
        {
            highScore = highScore;
        }
    }
}

