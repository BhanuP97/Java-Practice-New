package Classes;

public class Amstrong_Number {

	
	public static boolean isArmstrong(int num) {
		int originalNumber = num;
		int sum = 0;
		
		int digits = Integer.toString(num).length(); //calculate the number of digits
		
		while(num>0) {
			int digit = num % 10; // Extract the last digit
			sum += Math.pow(digit, digits); 
			
			num /= 10;// remove the last digit	
		}
			
		return sum == originalNumber;


	}

	public static void main(String[] args) {

		int number = 153;
		if(isArmstrong(number)) {
			System.out.println(number + " is a Armstrong Number");
		} else {
			System.out.println(number  +" is not a Armstrong number ");
		}

	}
}
