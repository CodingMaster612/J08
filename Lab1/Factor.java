public class Factor{

	public static void main(String[] args) {
	boolean main= isFactor(10, 10);
	System.out.println(main);
	}
	public static boolean isFactor(int k , int n) {
		if(!(k % n==0)) {
			return false;
		}
		else {
			return true;
		}
	}

}