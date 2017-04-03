/**
 * PrintReceiptState is to print the receipt if:
 * Car Wash option is "Yes" or
 * Car Wash option is "No" and Print Receipt option is "Yes".
 *
 */

public class PrintReceiptState {
	final String costMsg = "Your total cost is: ";
	final String thankyouMsg = "Thank you!";

	int cost = 0;

	public PrintReceiptState(int cost) {
		this.cost = cost;
	}

	public void print() {
		System.out.println(costMsg + cost);
		System.out.println(thankyouMsg);
	}
}