import java.util.Scanner;

public class AC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = scanner.nextInt();

		double Area = Math.PI * Math.pow(radius, 2);
		System.out.println("your area is " + Area);
		
		double Circumfrence = 2 * Math.PI * radius;
		System.out.println("your Cir is " + Circumfrence);
		

	}
	
	
	
	

}