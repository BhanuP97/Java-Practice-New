package Classes;

public class FactorialExample {

	public static void main(String[] args) {
		
		int num = 5; // Number to find factorial of // F(n) = F(1)*F(2)...F(n-1)*F(n)
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
	}

}
