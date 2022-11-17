public class Bool {

	public static void main(String[] args) {
		
		boolean x = true;
		
		boolean y = false;
		
		boolean answer= Xor(x,y);
		System.out.println(answer);
	}
	public static boolean Xor(boolean x, boolean y) {
		if(x == true || y == true) {
			return true;
		}
		else {
			return false;
		}
	}
}
