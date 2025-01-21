package Classes;

public class ReverseString {
	static String Name = "Qualitrix Technilogies Pvt Ltd";
	public static void main(String[] args) {

		// using loop

		String Reverse = "";
		for(int i= Name.length()-1; i>0; i--) {
			Reverse += Name.charAt(i);
		}
		System.out.println("Original String "+ Name);
		System.out.println("Reversed String "+ Reverse);


		// using String Builder
		StringBuilder sb = new StringBuilder(Name);
		String reversed = sb.reverse().toString();
		System.out.println("Reversed String "+ reversed);
	}	




}
