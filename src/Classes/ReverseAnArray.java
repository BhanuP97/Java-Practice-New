package Classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		
		int [] array = {1,2,3,4};
		for(int i = 0, j = array.length - 1; i < j; i++, j--) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
