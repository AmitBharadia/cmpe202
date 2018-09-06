

import java.util.Random;

public class HasAmountState implements State {
	GumballMachine gumballMachine;
 
	public HasAmountState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertAmount(int coin) {
		System.out.println("You can't insert more money");
	}
 
	public void ejectAmount() {
		System.out.println("Amount returned");
		gumballMachine.setState(gumballMachine.getNotSufficentAmountState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
