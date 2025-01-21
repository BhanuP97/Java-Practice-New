package Classes;

// How do you remove spaces from a string in Java?

public class removeWhiteSpaces {
	public static void main(String[] args) {
		String str = "   Hello Word    ";
		
		// Using replaceAll() method
		 String result = str.replaceAll("\\s", ""); // removing all the spaces
		 System.out.println(result);
		 
		 // using replace() method
		  String results = str.replace(" ", "");
		  System.out.println(results);
		  
		 // using trim() method
		  String Trim = str.trim(); // Removes leading and trailing spaces
		  System.out.println(Trim);
		 
		
	}

}
