package sweet.sour;

public class Binarysearch {

		int search(int arr[], int low, int high, int x) {
			// using exception handling to avoid run time errors
			// use of try and catch block
			try {
				if (high >= low) {
					// to find mid value
					int mid = low + (high - 1) / 2;
	// if middle element is the target value just return mid value as target
					if (arr[mid] == x)
						return mid;
	// if middle value is greater than target then recursively call the method by
					// passing arguments from low to mid
					if (arr[mid] > x)
						return search(arr, low, mid - 1, x);
					if (arr[mid] < x)
						return search(arr, mid + 1, high, x);
				}
			}
			// catch block
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			// return -1 when all the above conditions failed
			return -1;
		}

		public static void main(String args[]) {
			// create object for the class
			Binarysearch b = new Binarysearch();
	int arr[] = { 1, 2, 4, 9, 11, 12, 14, 16, 21, 23, 24, 25, 27, 28, 29, 30, 31, 34, 36, 37 };
			// store the length of the array
			int n = arr.length;
			// setting the target element
			int x = 24;
			// function call
			int result = b.search(arr, 0, n - 1, x);
	// conditional statement to check weather the given element is present    or not
			if (result == -1)
				System.out.println("Element not present in the given array");
			else
	System.out.println("Element found at index " + result + " by  using binary     search");
		}
	}


