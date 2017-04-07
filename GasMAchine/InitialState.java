public class InitialState implements State {
	  Machine machine;
	  
	  public InitialState(Machine machine) {
		  this.machine = machine;
	  }
	  
	  public void insertCard() {
		  machine.setState(machine.insertCardState);
		  System.out.println("Please remove the card repidly.");
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
}