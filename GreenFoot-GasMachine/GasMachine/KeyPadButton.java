import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyPadButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyPadButton extends Actor
{
    /**
     * Act - do whatever the KeyPadButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            addKeyToDisplay();
            
            
        }
    }  
    
    public void addKeyToDisplay(){
        
    }
    
}
