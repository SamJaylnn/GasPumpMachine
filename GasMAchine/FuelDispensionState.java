public class FuelDispensionState implements State {
	  Machine machine;
	  
	  public FuelDispensionState(Machine machine) {
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
	  
	  public void finishFueling() {
			if (machine.printReceipt) {
				  machine.setState(machine.receiptPrintingState);
				  System.out.println("Printing receipt");
			} else {
				  System.out.println("Thank you and welcome to our station next time!");
				  machine.setState(machine.initialState);
			}
	  }
}