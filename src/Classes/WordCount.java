package Classes;

public class WordCount {
	public static void main(String[] args) {
		
		String office = "Qualitrix technologies pvt ltd";
		
		String [] word = office.trim().split("\\s+");
		
		int wordcount = word.length;
		System.out.println("no of words in a given string is : " + wordcount);
	}

}
