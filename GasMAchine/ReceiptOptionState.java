public class ReceiptOptionState implements State {
	  Machine machine;
	  
	  public ReceiptOptionState(Machine machine) {
		  this.machine = machine;
	  }
	  
	  public void insertCard() {
		  
	  }
	  
	  public void removeCard() {
		  
	  }
	  
	  public void next() {
		  
	  }
	  
	  public void confirm() {
		  machine.setState(machine.fuelDispensionState);
		  machine.printReceipt = true; // we may need to assign this variable by another way
		  System.out.println("Select fuel type and refuel your car");
	  }
	  
	  public void reject() {
		  machine.setState(machine.fuelDispensionState);
		  machine.printReceipt = false; // we may need to assign this variable by another way
		  System.out.println("Select fuel type and refuel your car");		  
	  }
	  
	  public void help() {
		  
	  }
	  
	  public void cancel() {
		  
	  }
	  
	  public void keypad(String zipcode) {
			//may be a class, discuss this later
	  }
}