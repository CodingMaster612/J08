import java.util.Scanner;

public class MaxThree {

	public static void main(String[] args) {
		Max3();

	}
	public static void Max3() {
		int firstNumber, secondNumber, thirdNumber, largest, temp;  
		
		Scanner scanner = new Scanner(System.in);  
		 
		System.out.println("Enter the first number:");  
		firstNumber= scanner.nextInt();  
		System.out.println("Enter the second number:");  
		secondNumber = scanner.nextInt();  
		System.out.println("Enter the third number:");  
		thirdNumber = scanner.nextInt();  
		
		temp=firstNumber>secondNumber?firstNumber:secondNumber;
		
		
		
		largest=thirdNumber>temp?thirdNumber:temp;  
		  
		System.out.println("The largest number is: "+largest);  
		     
	}

}