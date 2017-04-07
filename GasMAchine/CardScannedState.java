public class CardScannedState implements State {
	  Machine machine;
	  
	  public CardScannedState(Machine machine) {
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
		  Inspect inspect = new Inspect();
		  if (inspect.verify(zipcode)) {
			  machine.setState(machine.cardVerificationState);
			  System.out.println("continue, help, cancel");
		  } else {
			  System.out.println("Invalid card.");
			  machine.setState(machine.initialState);
		  }
		  
	  }
}