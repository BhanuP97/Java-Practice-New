package Classes;

public class CheckPerfectSquare {

	public static void main(String[] args) {
		int num = 20;
		if(isPerfectSquare(num)) {
			System.out.println(num + " is a perfect square");
		}else {
			System.out.println(num + " is not a perfect square");

		}

	}

	public static boolean isPerfectSquare(int number) {
		if (number < 0) {
			return false;
		}
		
		for(int i =0; i * i <= number; i++) {
			if (i * i == number) {
			return true;
			}
		}
		
		
		return false;
	}
}
