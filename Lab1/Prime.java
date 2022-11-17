import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter a number :");
		 
		int x = sc.nextInt();
		 
		boolean prime = isPrime(x);
		 
		if (prime)
		{
		System.out.println(x +" is a prime number.");
		}
		else
		{
		System.out.println(x +" is not a prime number.");
		}

	}
	public static boolean isFactor(int k , int n) {
		if(!(k % n==0)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean isPrime(int x) {
		
		boolean prime = true;
		
		if(x <= 1) {
			prime = false;
			
			return prime;
			
		}
		else {
			for (int i=2; i <= x/2; i++) {
				if(isFactor(x , i)) {
					prime= false;
					
					break;
				}
				
				
			}
		}
		return prime;
		
	}

}
