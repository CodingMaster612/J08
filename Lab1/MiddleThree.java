import java.util.Scanner;

public class MiddleThree {

	public static void main(String[] args) {
		Middle3();
	}

	public static void Middle3() {
		int firstNumber, secondNumber, thirdNumber;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number:");
		firstNumber = scanner.nextInt();
		System.out.println("Enter the second number:");
		secondNumber = scanner.nextInt();
		System.out.println("Enter the third number:");
		thirdNumber = scanner.nextInt();

		if (secondNumber > firstNumber && firstNumber > thirdNumber
				|| thirdNumber > firstNumber && firstNumber > secondNumber) {
			System.out.println(firstNumber);
		} else if (firstNumber > secondNumber && secondNumber > thirdNumber
				|| thirdNumber > secondNumber && secondNumber > firstNumber) {
			System.out.println(secondNumber);
		} else if (firstNumber > thirdNumber && thirdNumber > secondNumber
				|| secondNumber > thirdNumber && thirdNumber > firstNumber) {
			System.out.println(thirdNumber);
		}
	}

}