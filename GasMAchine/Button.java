import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Button(String msg)
    {
        GreenfootImage image = getImage(); 
        image.scale( 30,30 ) ; 
        image.drawString(msg,10,20);
        
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
