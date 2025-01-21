package Classes;

public class PalindromeString {

	public static void main(String[] args) {
		 
		String str = "madam";
		
		String reversedstr = new StringBuilder(str).reverse().toString();
		
		if(str.equals(reversedstr)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}

	}

}
