import java.util.Scanner;

public class Number{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int number = scanner.nextInt();
		
		System.out.println("you entered"+ number + "the new value is " + (double)number);

	}

}