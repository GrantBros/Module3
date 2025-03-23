
import java.util.Scanner;
public class Identity1 {
	
	public static void main(String[] args) {
		String first;
		String last;
		String street;
		String city;
		String post;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your first name?");
		first = scanner.nextLine();
		System.out.println("What is your last name?");
		last = scanner.nextLine();
		System.out.println("What is your street address?");
		street = scanner.nextLine();
		System.out.println("What city do you live in?");
		city = scanner.nextLine();
		System.out.println("What is your postal code?");
		post = scanner.nextLine();
		System.out.println(first);
		System.out.println(last);
		System.out.println(street);
		System.out.println(city);
		System.out.println(post);
		
	}

}
