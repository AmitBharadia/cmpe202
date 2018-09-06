

public class NotSufficientAmountState implements State {
    GumballMachine gumballMachine;
 
    public NotSufficientAmountState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertAmount(int coin) {
		System.out.println("You inserted coin "+coin);
		int currentAmount=gumballMachine.getCurrentAmount();
		int costOfAGumball=gumballMachine.getGumballMachineType().getCostOfGumball();
		if(gumballMachine.getGumballMachineType().acceptsCoin(coin)){
			if((currentAmount+coin)<costOfAGumball){
				System.out.println("You have to insert " +(costOfAGumball-currentAmount-coin)+" to get a gumball");
				gumballMachine.setCurrentAmount(currentAmount+coin);
			}else{
				gumballMachine.setCurrentAmount(currentAmount+coin);
				gumballMachine.setState(gumballMachine.getHasAmountState());
			}
		}else{
			System.out.println("You can only insert "+gumballMachine.getGumballMachineType().getAcceptableCoins());
		}
	}
 
	public void ejectAmount() {
		System.out.println("You haven't inserted sufficent amount");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's not suffficient amount");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
