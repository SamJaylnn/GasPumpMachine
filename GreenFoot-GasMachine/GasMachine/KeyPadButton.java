import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyPadButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyPadButton extends Actor
{
    
    KeyPad keyPad=null;
    
    public KeyPadButton(KeyPad keyPad){
    this.keyPad=keyPad;


}
    
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
        keyPad.digitEntered(getValue());
    }
    
    
    public String getValue(){
        return null;
    }
}
