package Classes;

public class Divisibleby03 {

	public static void main(String[] args) {
		
		System.out.println("number between 1 to 100 divisible by 03 are : ");
		
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
