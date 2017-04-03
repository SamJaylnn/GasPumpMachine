import greenfoot.*;  

/**
 * PrintReceiptState is to print the receipt if:
 * Car Wash option is "Yes" or
 * Car Wash option is "No" and Print Receipt option is "Yes".
 *
 */

public class PrintReceiptState extends State 
{
	final String costMsg = "Your total cost is: ";
	//The machine prints out a message “Thank You” after printing the receipt or after a timeout of 30 seconds.
	final String thankyouMsg = "Thank you!";

	int cost = 0;

	public PrintReceiptState(int cost) 
	{
		this.cost = cost;
	}

	public void print() 
	{
		System.out.println(costMsg + cost);
		System.out.println(thankyouMsg);
	}
}