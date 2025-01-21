package Classes;

public class PermutationsOfaString {
	public static void main(String[] args) {
		String str = "ABC";
		System.out.println("All permutations of the string are:");
		isPermutations(str, 0, str.length() - 1);
	}
	public static void isPermutations(String str, int left, int right) {

		if(left == right) {
			System.out.println(str);
		} else {
			for (int i = left; i<= right ; i++) {

				str = swap(str, left, i);

				isPermutations(str, left + 1, right);

				str = swap(str, left, i);
			}

		}


	}
	private static String swap(String str, int i, int j) {
		char[] charArray = str.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return new String(charArray);
	}
}
