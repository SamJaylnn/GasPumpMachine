public class CardVerificationState implements State {
	  Machine machine;
	  
	  public CardVerificationState(Machine machine) {
		  this.machine = machine;
	  }
	  
	  public void insertCard() {
		  
	  }
	  
	  public void removeCard() {
		  
	  }
	  
	  public void next() {
		  machine.setState(machine.carWashOptionState);
		  System.out.println("Do you want to wash car? We will give you discount!");
	  }
	  
	  public void confirm() {
		  
	  }
	  
	  public void reject() {
		  
	  }
	  
	  public void help() {
		  System.out.println("Here is help info...");
	  }
	  
	  public void cancel() {
		  System.out.println("Thank you.");
		  machine.setState(machine.initialState);
	  }
	  
	  public void keypad(String zipcode) {
			//may be a class, discuss this later
	  }
}