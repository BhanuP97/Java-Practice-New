package Classes;

public class SUmOfNaturalNumbers {
	static int n = 10;
	static int sum = 0;
	public static void main(String[] args) {
		// sum of natural numbers n= n * (n+1) / 2
		
		
		// sum using loop
		
		for (int i=0; i<=n; i++) {
			sum += i;
		}
		System.out.println("sum of first " + n + " natural number is :" + sum);
		
		// sum using formula
		int sum1 = n * (n+1)/2;
		
		System.out.println("sum of first " + n + " natural number is : " + sum1);
		

	}

	

}
