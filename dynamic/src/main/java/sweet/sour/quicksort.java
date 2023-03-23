package sweet.sour;
import java.util.Scanner;
public class quicksort {

		static int move,compar;
		public static void sort(int[] arr, int low, int high) {
	//check element is present and increase compar
			if (low >= high) {
				compar++;
				return;
			}
	//initialize the value to variable
			int start = low;
			int end = high;
			int mid = (start + end) / 2;
			int pivot = arr[mid];
			while (start <= end) {
				while (arr[start] < pivot) {
					start++;
					compar++;
				}
				while (arr[end] > pivot) {
					end--;
					compar++;
				}
				if (start <= end) {
					int temp = arr[start];
					arr[start] = arr[end];
					arr[end] = temp;
					start++;
					end--;
					move++;
				}
			}
	//Recursive function call 
			sort(arr,low,end);
			sort(arr,start,high);
		}
		
	}
	 class Ass_QuickSort {
		public static void main(String[] args) {
			try (Scanner scan = new Scanner(System.in)) {
				System.out.print("Enter the Size of Array: ");
	//scan the use input and stored in variable size
				int size = scan.nextInt();
				int arr[] = new int[size];
	//execute the loop to use input size
				for (int i = 0; i < size; i++) {
					System.out.print("Enter the Array Element : ");
					arr[i] = scan.nextInt();
				}
	//Static function call
				quicksort.sort(arr,0,size-1);
				System.out.println("Sorted Array using QuickSort");
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println("\nData Movement : "+quicksort.move);
				System.out.println("Data comparisons : "+quicksort.compar);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}



