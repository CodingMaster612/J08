import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 4 digits ");
		double year = scanner.nextDouble();

	    // Implementing our algorithm.
	    if (year % 400 == 0) {
	      System.out.println(year + " is a leap year.");
	    } 
	    else if (year % 100 == 0) {
	      System.out.println(year + " is not a leap year.");
	    } 
	    else if (year % 4 == 0) {
	      System.out.println(year + " is a leap year.");
	    } 
	    else {
	      System.out.println(year + " is not a leap year.");
	    }
	    

	}

}
