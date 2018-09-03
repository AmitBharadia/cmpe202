//Its a parent gumball machine that accepts one quarters 
public class GumballMachine {

	protected int num_gumballs;
	protected boolean is_cranckable;
	protected int amount;

	public GumballMachine(int size) {
		// initialise instance variables
		this.num_gumballs = size;
		this.is_cranckable = false;
		this.amount=0;
	}

	public void insertAmount(int coin) {
		if (coin == 25){
			amount+=coin;
			System.out.println("You can turn the cranck now ");
			this.is_cranckable = true;
		}else{
			System.out.println("You can only insert a quarter here!");
			this.is_cranckable = false;
		}
	}

	public void turnCrank() {
		if (this.is_cranckable) {
			if (this.num_gumballs > 0) {
				this.num_gumballs--;
				this.is_cranckable = false;
				this.amount=0;
				System.out.println("Thank You.  Gumball Ejected!");
			} else {
				System.out.println("No More Gumballs!  Sorry, can't return your quarter.");
			}
		} else {
			printValidMessage();
		}
	}

	public void printValidMessage(){
		System.out.println("Please insert a  quarter here!");
	}

	@Override
	public String toString() {
		return "GumballMachine [num_gumballs=" + num_gumballs + ", is_cranckable=" + is_cranckable + ", amount="
				+ amount + "]";
	}
	
	

}