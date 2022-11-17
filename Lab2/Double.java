import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a double");
		double number = scanner.nextDouble();
		
		
		
		System.out.println("You entered " + number + "the new value is" + Math.floor(number));
		System.out.println("You entered " + number + "the new value is" + Math.ceil(number));

	}

}