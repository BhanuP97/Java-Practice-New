package Classes;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 5};
        int n = 5, sum = n * (n + 1) / 2;
        for (int num : arr) sum -= num;
        System.out.println("Missing Number: " + sum);
	}

}
