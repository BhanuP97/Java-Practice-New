package Classes;

//  How do you check whether a string is a palindrome in Java?

public class CheckPalindromeIn_Java {
	public static void main(String[] args) {
		
		String str = "madam";
		// using string builder
		
		String reversedstr = new StringBuilder(str).reverse().toString();
		
		System.out.println(reversedstr);
		
		if (str.equals(reversedstr)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
		
	}

}
