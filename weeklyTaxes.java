import java.util.Scanner;
import java.util.InputMismatchException;

public class weeklyTaxes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your weekly income?");
		try {
		Double income = sc.nextDouble();
		if (income <= 500 && income > 0) { 
			System.out.println("Your weekly taxes are 10%");
			Double rate = .1;
			Double tax = income * rate;
			System.out.println("Your total weekly taxes are $" + tax);
			System.out.println("Your total net income is $" + (income - tax));
		} else if (income >= 500 && income <= 1500) { 
			System.out.println("Your weekly taxes are 15%");
			Double rate = .15;
			Double tax = income * rate;
			System.out.println("Your total weekly taxes are $" + tax);
			System.out.println("Your total net income is $" + (income - tax));
		} else if (income >= 1500 && income <= 2500) { 
				System.out.println("Your weekly taxes are 20%");
				Double rate = .2;
				Double tax = income * rate;
				System.out.println("Your total weekly taxes are $" + tax);
				System.out.println("Your total net income is $" + (income - tax));
		} else if (income >= 2500) { 
			System.out.println("Your weekly taxes are 30%");
			Double rate = .3;
			Double tax = income * rate;
			System.out.println("Your total weekly taxes are $" + tax);
			System.out.println("Your total net income is $" + (income - tax));
		} else {
			System.out.println("negative numbers will not be calculated.");
		}
		} catch (InputMismatchException e) {
			System.out.println("That is not a valid entry. Goodbye!");
		sc.close();
		}
	} 
}

		
