import greenfoot.*;  

/**
 * PrintReceiptState is to print the receipt if:
 * Car Wash option is "Yes" or
 * Car Wash option is "No" and Print Receipt option is "Yes".
 *
 */

public class PrintReceiptState extends State 
{
	final private String costMsg = "Your total cost is: ";
	final private String thankyouMsg = "Thank you!";

	int cost = 0;

	/**
     * Constructor 
     * 
     * @param cost   total cost on the receipt
     */
	public PrintReceiptState(int cost) 
	{
		this.cost = cost;
	}

	/**
     * Print out the receipt. 
     * 
     */
	public void print() 
	{
		System.out.println(costMsg + cost);
		
		//The machine prints out a message “Thank You” after printing the receipt or after a timeout of 30 seconds.
		Greenfoot.delay(30);
		System.out.println(thankyouMsg);
	}
}