package Classes;

import java.util.List;

// How do you check if a list of integers contains only odd numbers in Java?
public class onlyOddNumbers {

	public static boolean onlyOddNumbers(List<Integer> list) {
		for (int i: list) {
			if (i% 2 == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,3,5,7,9);
		System.out.println(onlyOddNumbers(numbers));
		
		

	}

}
