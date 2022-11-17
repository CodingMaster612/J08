import java.util.Scanner;

public class MiniumThree {

	public static void main(String[] args) {
		Min3();

	}
	public static void Min3() {
		int firstNumber, secondNumber, thirdNumber, smallest;  
		
		Scanner scanner = new Scanner(System.in);  
		 
		System.out.println("Enter the first number:");  
		firstNumber= scanner.nextInt();  
		System.out.println("Enter the second number:");  
		secondNumber = scanner.nextInt();  
		System.out.println("Enter the third number:");  
		thirdNumber = scanner.nextInt();  
		
		 if(firstNumber < secondNumber) {
			 if(thirdNumber < firstNumber) {
				 smallest = thirdNumber;
			 }else {
				 smallest = firstNumber;
			 }
		 }else {
			 if(secondNumber < thirdNumber) {
				 smallest = secondNumber;
			 }else {
				 smallest = thirdNumber;
			 }
		 }
		 System.out.println("Here is your smallest number "+ smallest);    
	}

}
