package Classes;

public class StringContainsVowels {
	
	public static void main(String[] args) {
		System.out.println(StringContainsVowels("Hello"));//true
		System.out.println(StringContainsVowels("TV"));//false
		
	}
	public static boolean StringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
		
	}

}
