package Classes;

public class ArmstrongNUmberRange {

	public static boolean isArmstrongNumberRange(int num) {

		int originalnumber = num;
		int sum = 0;
		int digits = Integer.toString(num).length();
		
		while (num>0) {
			int digit = num %10;
			sum += Math.pow(digit, digits);
			num /= 10;
			
		}
		return sum == originalnumber;

	}
	public static void main(String[] args) {
		int lower = 100, upper = 999;
		
		System.out.println("Armstrong numbers between " + lower + "and" + upper);
		for (int i = lower; i<= upper; i++) {
			if(isArmstrongNumberRange(i)) {
				System.out.println(i);
			}
		}

	}
}
