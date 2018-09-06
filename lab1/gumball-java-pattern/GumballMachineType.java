import java.util.Set;

public class GumballMachineType {
		
	 private Set<Integer> acceptableCoins;
	  
	 private int costOfGumball;
	 
	 
	public GumballMachineType() {
		super();
	}

	public GumballMachineType(Set<Integer> acceptableCoins, int costOfGumball) {
		super();
		this.acceptableCoins = acceptableCoins;
		this.costOfGumball = costOfGumball;
	}

	public Set<Integer> getAcceptableCoins() {
		return acceptableCoins;
	}

	public void setAcceptableCoins(Set<Integer> acceptableCoins) {
		this.acceptableCoins = acceptableCoins;
	}

	public int getCostOfGumball() {
		return costOfGumball;
	}

	public void setCostOfGumball(int costOfGumball) {
		this.costOfGumball = costOfGumball;
	}
	 
	 
	public boolean acceptsCoin(int coin){
		if(acceptableCoins.contains(coin)){
			return true;
		}
		return false;
	}
}
