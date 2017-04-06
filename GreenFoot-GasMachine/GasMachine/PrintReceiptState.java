import greenfoot.*;  

/**
 * PrintReceiptState is to print the receipt if:
 * Car Wash option is "Yes" or
 * Car Wash option is "No" and Print Receipt option is "Yes".
 *
 */

public class PrintReceiptState extends State 
{
    
    final private String thankyouMsg = "Thank you!";
    private String costMsg = "Your total cost is: ";  //needs to append the cost in the end
    Message message = new Message();

    int cost = 0;

    /**
     * Constructor 
     * 
     * @param cost   total cost on the receipt
     */
    public PrintReceiptState(int cost) 
    {
        this.cost = cost;
        costMsg += cost;
    }

    /**
     * Print out the receipt. 
     * 
     */
    public void print() 
    {
        setMessage(costMsg);                // on canvas
        System.out.println(costMsg);        // in cmd
        
        //The machine prints out a message “Thank You” after printing the receipt or after a timeout of 30 seconds.
        Greenfoot.delay(30);
        
        setMessage(thankyouMsg);            // on canvas
        System.out.println(thankyouMsg);    // in cmd
    }
    
    public void setMessage(String msg) {
        MouseInfo mouseinfo = Greenfoot.getMouseInfo();
        int mouseX = mouseinfo.getX();
        int mouseY = mouseinfo.getY();
        
        World world = getWorld();
        if(message.getWorld() != null) {
            world.removeObject(message);
        }
        
        world.addObject(message, mouseX, mouseY);
        message.setText(msg);
    }
}