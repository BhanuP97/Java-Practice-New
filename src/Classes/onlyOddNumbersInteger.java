package Classes;

public class onlyOddNumbersInteger {

	public static void main(String[] args) {
		
		int [] number = {1,2,12,400,39, 45, 28, 89,100, 242};
		
		System.out.println("Only Odd Numbers are");
		
		for(int num: number) {
			if(num % 2 !=0) {
				System.out.println(num + " ");
			}
		}
	}

}
