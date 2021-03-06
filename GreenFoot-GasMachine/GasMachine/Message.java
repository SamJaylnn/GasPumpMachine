import greenfoot.*;
/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor  
{
    private GreenfootImage image;
    //default text location x_coordinate: TO BE changed to receipt printer (the credit card reader) location
    private int textLoc_x = 5;     
    //default text location y_coordinate: TO BE changed to receipt printer (the credit card reader) location
    private int textLoc_y = 25;    

    /**
     * Constructor for objects of class Message
     */
    public Message()
    {
        image = new GreenfootImage(300, 5);
        setImage(image);
    }
    
    /**
     * Constructor for objects of class Message with text locations specified.
     * 
     * i.e., given the location of receipt printer (the credit card reader), the receipt would 
     * appear in the appropriate location.
     */
    public Message(int textLoc_x, int textLoc_y)
    {
        image = new GreenfootImage(300, 5);
        setImage(image);
        
        this.textLoc_x = textLoc_x;
        this.textLoc_y = textLoc_y;
    }

    /**
     * When the message object is clicked, it'll disappear.
     * 
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)) 
        {
            World world = getWorld();
            world.removeObject(this);
        }
    }
    
     /**
     * setText of the message
     * 
     * @param msg   The content of the message
     */
    public void setText(String msg)
    {
        image.clear();
        image.setColor(greenfoot.Color.YELLOW);
        image.fill();
        
        image.setColor(greenfoot.Color.BLACK);
        image.drawString(msg, textLoc_x, textLoc_y);
    }
}
