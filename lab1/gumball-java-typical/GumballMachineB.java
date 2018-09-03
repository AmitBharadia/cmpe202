//Its a parent gumball machine that accepts all types of currencies quarters 
public class GumballMachineB extends GumballMachine{

	public GumballMachineB(int size) {
		super(size);
	}
	@Override
	public void insertAmount(int coin) {
		if(coin==5 ||coin==10 || coin==25){
			amount+=coin;
			if(this.amount>=50){
				System.out.println("You have successfully inserted "+coin);
				System.out.println("You can turn the cranck now ");
				this.is_cranckable=true;
			}else{
				System.out.println("You have successfully inserted "+coin);
				System.out.println("You need to insert remaining money of "+ (50 - this.amount) + " to get a Gumball!");
			}
		}else {
			System.out.println("You can only insert a dime, nickel or quarter here!");
		}
		
	}
	
	@Override
	public void printValidMessage(){
		System.out.println("Please insert a  dime, nickel or quarter here!");
	}

}
