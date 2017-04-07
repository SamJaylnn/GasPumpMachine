public class InsertCardState implements State {
	  Machine machine;
	  
	  public InsertCardState(Machine machine) {
		  this.machine = machine;
	  }
	  
	  public void insertCard() {
		  
	  }
	  
	  public void removeCard() {
		  machine.setState(machine.cardScannedState);
		  System.out.println("Please enter the zip code.");
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
}