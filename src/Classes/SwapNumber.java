package Classes;

public class SwapNumber {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("before swapping a = " + a + "; before swaping b = "+ b);
		
        // Swap using a temporary variable

		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("after swapping a = " + a + "; after swaping b = "+ b);
		
	}

}
