import greenfoot.*;

public class State extends Actor 
{
	 Message message = new Message();
	 
	public void act() 
	{
	}
	
	public void setMessage(String msg) 
	{
        MouseInfo mouseinfo = Greenfoot.getMouseInfo();
        int mouseX = mouseinfo.getX();
        int mouseY = mouseinfo.getY();
        
        World world = getWorld();
        if(message.getWorld() != null) 
        {
            world.removeObject(message);
        }
        
        world.addObject(message, mouseX, mouseY);
        message.setText(msg);
    }
}
