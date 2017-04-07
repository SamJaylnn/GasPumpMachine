import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
   
    public Message(String msg)
    {
        GreenfootImage txtmsg = new GreenfootImage(msg, 20, greenfoot.Color.BLACK, greenfoot.Color.RED);
        
        setImage(txtmsg);
        
        
    }
    public void deleteme(Message msg)
    {
       
               getWorld().removeObject(msg);
    }
    
}
