package epam.com.HOMETASK_4;
import java.util.Scanner;

public class TEST {



	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		COMPOUNDANDSIMPLEINTEREST calculate = new COMPOUNDANDSIMPLEINTEREST();
		
		CONSTRUCTION budget = new CONSTRUCTION();
		
		System.out.println("Enter 1 to calculate Simple Interest / 2 to calculate Compound Interest");
		int option = input.nextInt();
		System.out.println("Enter amount, rate , time");
		double amount = input.nextDouble();
		double rate = input.nextDouble();
		double time = input.nextDouble();
		switch(option){
		case 1:
			System.out.println(calculate.computesSimpleInterest(amount, rate, time));
			break;
		case 2:
			System.out.println(calculate.computesCompoundInterest(amount, rate, time));
			break;
		default:
			System.out.println("Invalid option entered");
		}
		
		System.out.println("Enter Standard of the house to be constructed");
		System.out.println("Enter 1 for normal 2 for medium 3 for high");
		int standard = input.nextInt();
		int fullyAutomated;
		if( standard == 3){
			System.out.println("Enter 1 for fully automated house else enter 0");
			fullyAutomated = input.nextInt();
		}else{
			fullyAutomated = 0;
			
		}
		System.out.println("Enter the area ");
		double area = input.nextDouble();
		System.out.println(budget.calculatesConstructionCost(area, standard, fullyAutomated));
	}
}
