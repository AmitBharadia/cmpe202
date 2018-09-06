import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Set<Integer> coinSetX = new HashSet<>(Arrays.asList(25));
		Set<Integer> coinSetY = new HashSet<>(Arrays.asList(5, 10, 25));

		// Three Types of Gumball machine accepting different type of coins and
		// different amount
		GumballMachineType typeA = new GumballMachineType(coinSetX, 25);
		GumballMachineType typeB = new GumballMachineType(coinSetX, 50);
		GumballMachineType typeC = new GumballMachineType(coinSetY, 50);

		// Instantiating Gumball Machines on the basis of its type
		GumballMachine gumballMachineA = new GumballMachine(5, typeA);

		System.out.println(gumballMachineA);

		gumballMachineA.insertAmount(25);
		gumballMachineA.turnCrank();

		System.out.println(gumballMachineA);

		gumballMachineA.insertAmount(25);
		gumballMachineA.turnCrank();
		gumballMachineA.insertAmount(25);
		gumballMachineA.turnCrank();

		System.out.println(gumballMachineA);

		System.out.println("**************************************************");

		GumballMachine gumballMachineB = new GumballMachine(5, typeB);

		System.out.println(gumballMachineB);

		gumballMachineB.insertAmount(25);
		gumballMachineB.turnCrank();

		System.out.println(gumballMachineB);

		gumballMachineB.insertAmount(25);
		gumballMachineB.turnCrank();
		gumballMachineB.insertAmount(25);
		gumballMachineB.turnCrank();

		System.out.println(gumballMachineB);
		System.out.println("**************************************************");
		///////////////////////
		GumballMachine gumballMachineC = new GumballMachine(5, typeC);

		System.out.println(gumballMachineC);

		gumballMachineC.insertAmount(5);
		gumballMachineC.turnCrank();

		System.out.println(gumballMachineC);

		gumballMachineC.insertAmount(10);
		gumballMachineC.turnCrank();
		gumballMachineC.insertAmount(10);
		gumballMachineC.insertAmount(25);
		gumballMachineC.turnCrank();

		System.out.println(gumballMachineC);

		System.out.println("**************************************************");
	}
}
