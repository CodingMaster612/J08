import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		
		isPerfect(6);

	}
	
	public static boolean isFactor(int k , int n) {
		if(!(k % n==0)) {
			return false;
		}
		else {
			return true;
		}
	}
	public static int isPerfect(int Number) {
		int i, Sum = 0 ;
//		Scanner scanner = new Scanner(System.in);		
//		System.out.println("Please Enter any Number: ");
//		Number = scanner.nextInt();

		for(i = 1 ; i < Number ; i++) {
			if(isFactor(Number, i))  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format("is a Perfect Number " + Number);
		}
		else {
			System.out.format(" is NOT a Perfect Number "  + Number);
		}
		return Sum;
	}

}
