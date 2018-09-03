//Its a parent gumball machine that accepts 2 quarters amounting 50 cents 
public class GumballMachineA extends GumballMachine {

	public GumballMachineA(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertAmount(int coin) {
		if (coin == 25) {
			amount += coin;
			if (this.amount >= 50) {
				System.out.println("You have successfully inserted "+coin);
				System.out.println("You can turn the cranck now ");
				this.is_cranckable = true;
			} else {
				System.out.println("You have successfully inserted "+coin);
				System.out.println("You need to insert one more quarter  to get a Gumball!");
			}
		} else {
			System.out.println("You can only insert a quarter here!");
		}

	}

}
