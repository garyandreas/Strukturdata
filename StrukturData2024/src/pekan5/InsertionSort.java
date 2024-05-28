package pekan5;

public class InsertionSort {
	/*Fuction to sort array using insertion sort
	 * 
	 */
	void sort (int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			
			/* Move element of arr[0..i-1], that are greater than key, to one position ahead of their current position
			 * 
			 */
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j -1;
			}
			arr[j + 1] = key;
		}
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
	// Driver method
	public static void main(String args[]) {
		int arr[] = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		InsertionSort ob = new InsertionSort();
		
		System.out.print("Data sebelum di urut : ");
		printArray(arr);
		
		
		ob.sort(arr);
		System.out.print("Data sesudah di urut : ");
		printArray(arr);
	}
}
