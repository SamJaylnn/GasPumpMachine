public class ReceiptPrintingState implements State {
	  Machine machine;
	  
	  public ReceiptPrintingState(Machine machine) {
		  this.machine = machine;
	  }
	  
	  public void insertCard() {
		  
	  }
	  
	  public void removeCard() {
		  
	  }
	  
	  public void next() {
		  
	  }
	  
	  public void confirm() {
		  
	  }
	  
	  public void reject() {
		  
	  }
	  
	  public void help() {
		  
	  }
	  
	  public void cancel() {
		  
	  }
	  
	  public void keypad(String zipcode) {
			//may be a class, discuss this later
	  }
	  
	  public void finishPrinting() {
		  System.out.println("Take your receipt. Thank you and welcome to our station next time!");
		  machine.setState(machine.initialState);
	  }
}