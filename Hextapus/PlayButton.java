import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.awt.Color;
import java.awt.Font;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Graphics2D;
import java.awt.FontMetrics;
import java.awt.font.TextLayout;

/**
 * A PlayButton class to display a play button on screen
 * 
 * @author Amjad Altadmri  
 * @version Jan 2017
 */
public class PlayButton extends Actor
{
    private String value;
    private int fontSize;
    private Color lineColor = Color.WHITE;
    private Color fillColor = Color.PINK;
    
    private static final Color transparent = new Color(0,0,0,0);
   
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Conditional to take the user to the world in which gameplay occurs.
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Game());
        }
    }    
    
    /**
     * Create a new label, initialise it with the int value to be shown and the font size 
     */
    public PlayButton(int value, int fontSize)
    {
        this(Integer.toString(value), fontSize);
    }
    
    /**
     * Create a new label, initialise it with the needed text and the font size 
     */
    public PlayButton(String value, int fontSize)
    {
        this.value = value;
        this.fontSize = fontSize;
        updateImage();
    }

    /**
     * Sets the value  as text
     * 
     * @param value the text to be show
     */
    public void setValue(String value)
    {
        this.value = value;
        updateImage();
    }
    
    /**
     * Sets the value as integer
     * 
     * @param value the value to be show
     */
    public void setValue(int value)
    {
        this.value = Integer.toString(value);
        updateImage();
    }
    
    /**
     * Sets the line color of the text
     * 
     * @param lineColor the line color of the text
     */
    public void setLineColor(Color lineColor)
    {
        this.lineColor = lineColor;
        updateImage();
    }
    
    /**
     * Sets the fill color of the text
     * 
     * @param fillColor the fill color of the text
     */
    public void setFillColor(Color fillColor)
    {
        this.fillColor = fillColor;
        updateImage();
    }
    
    /**
     * Update the image on screen to show the current value.
     */
    private void updateImage()
    {
        setImage(new GreenfootImage(value, fontSize, fillColor, transparent, lineColor));
    }
}