package Classes;

import java.util.HashSet;

public class DuplicateElementsInJva {
	public static void main(String[] args) {
		
		int[] array = {1,2,3,2,3,4,6};
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int num: array) {
			
			if(!set.add(num)) {
				System.out.println("Duplicate" + num);
			}
		}
		
	}

}
