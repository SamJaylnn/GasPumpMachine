import greenfoot.*;  

/**
 * PrintReceiptState is to print the receipt if:
 * Car Wash option is "YES" or
 * Car Wash option is "NO" and Print Receipt option is "YES".
 *
 */

public class PrintReceiptState extends State 
{
    
    final private String thankyouMsg = "Thank you!";
    private String costMsg = "Your total cost is: ";  //needs to append the cost in the end

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
    
}