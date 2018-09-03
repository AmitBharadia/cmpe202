
public class Main {

	public static void main(String[] args) {

		// Basic Gumball machine that accepts only amount 25 in denomination of
		// quarter
		GumballMachine gumballMachine = new GumballMachine(1);

		System.out.println(gumballMachine);

		gumballMachine.insertAmount(25);
		gumballMachine.turnCrank();

		// System.out.println(gumballMachine);

		gumballMachine.insertAmount(25);
		gumballMachine.turnCrank();
		gumballMachine.insertAmount(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		System.out.println("*****************************************************");
		// Gumball machine that accepts only amount 25 in denomination of
		// quarter
		GumballMachine gumballMachineA = new GumballMachineA(2);

		System.out.println(gumballMachineA);

		gumballMachineA.insertAmount(25);
		gumballMachineA.turnCrank();

		// System.out.println(gumballMachine);

		gumballMachineA.insertAmount(25);
		gumballMachineA.turnCrank();

		////////////////////////////////

		gumballMachineA.insertAmount(25);
		gumballMachineA.insertAmount(15);
		gumballMachineA.turnCrank();

		///////////////////////////////
		gumballMachineA.turnCrank();
		System.out.println(gumballMachineA);

		System.out.println("*****************************************************");
		// Gumball machine that accepts only amount 25 in denomination of
		// quarter
		GumballMachine gumballMachineB = new GumballMachineB(2);

		System.out.println(gumballMachineB);

		////////////////////////////////

		gumballMachineB.insertAmount(5);
		gumballMachineB.insertAmount(10);
		gumballMachineB.insertAmount(10);
		gumballMachineB.insertAmount(25);
		gumballMachineB.turnCrank();

		gumballMachineB.insertAmount(4);
		gumballMachineB.turnCrank();

		// System.out.println(gumballMachine);

		gumballMachineB.insertAmount(25);
		gumballMachineB.turnCrank();

		///////////////////////////////
		gumballMachineB.turnCrank();
		System.out.println(gumballMachineB);

	}
}