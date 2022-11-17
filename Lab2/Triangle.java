import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the width of the Triangle:");
		double base = s.nextDouble();

		System.out.println("Enter the height of the Triangle:");
		double height = s.nextDouble();
		
		double area = Triangle(base,height);
		System.out.println(area);
	}

	public static double Triangle(double base, double height) {

		// Area = (width*height)/2
		double area = (base * height) / 2;
		return area;
	}
}