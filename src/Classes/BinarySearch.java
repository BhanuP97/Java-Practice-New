package Classes;

public class BinarySearch {
		    public static int binarySearch(int[] arr, int target) {
		        int left = 0;
		        int right = arr.length - 1;

		        while (left <= right) {
		            int mid = left + (right - left) / 2; // Prevents integer overflow

		            if (arr[mid] == target) {
		                return mid; // Target found
		            } else if (arr[mid] < target) {
		                left = mid + 1; // Search the right half
		            } else {
		                right = mid - 1; // Search the left half
		            }
		        }

		        return -1; // Target not found
		    }

		    public static void main(String[] args) {
		        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13};
		        int target = 7;

		        int result = binarySearch(sortedArray, target);

		        if (result != -1) {
		            System.out.println("Element found at index: " + result);
		        } else {
		            System.out.println("Element not found.");
		        }
		    
}
	}
