package Classes;
// Given the integers 1, 2, 3, 4, 5, 6, 7, 8, 9, and 10, write a program to print only the even numbers from the given integers.
public class onlyEvenNumbersIntiger {

	public static void main(String[] args) {


		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Only Even Nummebers");

		for (int num: numbers) {
			if (num % 2 ==0) {// check if the number is even
				System.out.println(num +" ");

			}
		}


	}

}
