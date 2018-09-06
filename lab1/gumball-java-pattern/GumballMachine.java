
public class GumballMachine {

	GumballMachineType gumballMachineType;
	State soldOutState;
	State notSufficentAmountState;
	State hasAmountState;
	State soldState;
	State state = soldOutState;
	int currentAmount = 0;
	int count = 0;

	public GumballMachine(int numberGumballs, GumballMachineType gumballMachineType) {
		soldOutState = new SoldOutState(this);
		notSufficentAmountState = new NotSufficientAmountState(this);
		hasAmountState = new HasAmountState(this);
		soldState = new SoldState(this);
		this.gumballMachineType=gumballMachineType;
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = notSufficentAmountState;
		}
	}

	public void insertAmount(int coin) {
		state.insertAmount(coin);
	}

	public void ejectAmount() {
		state.ejectAmount();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	int getCount() {
		return count;
	}

	void refill(int count) {
		this.count = count;
		state = notSufficentAmountState;
	}

	public State getState() {
		return state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNotSufficentAmountState() {
		return notSufficentAmountState;
	}

	public State getHasAmountState() {
		return hasAmountState;
	}

	public State getSoldState() {
		return soldState;
	}

	public GumballMachineType getGumballMachineType() {
		return gumballMachineType;
	}

	public void setGumballMachineType(GumballMachineType gumballMachineType) {
		this.gumballMachineType = gumballMachineType;
	}

	public int getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(int currentAmount) {
		this.currentAmount = currentAmount;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
