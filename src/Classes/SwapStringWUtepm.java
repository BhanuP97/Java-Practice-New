package Classes;

public class SwapStringWUtepm {

	public static void main(String[] args) {
		String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swap: str1 = " + str1 + ", str2 = " + str2);

        // Swap strings using concatenation
        str1 = str1 + str2; // str1 now contains both strings
        str2 = str1.substring(0, str1.length() - str2.length()); // Extract the original str1
        str1 = str1.substring(str2.length()); // Extract the original str2

        System.out.println("After swap: str1 = " + str1 + ", str2 = " + str2);

	}

}
