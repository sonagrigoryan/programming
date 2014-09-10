package algorithm;
/***
 * Class consists of all elementary sorting algorithms. 
 * @author Sona Grigoryan
 *
 */

public class Sorting {	
	/**
	 * A Method that takes as an argument an array of Comparable type of values and sorts
	 * it in ascending order using the algorithm of SELECTION.
	 * @param arr An array of type Comparable
	 */
	public static void selectionSort(Comparable[] arr) {
		int min; // current minimum value in the array
		final int arrSize = arr.length;
		for (int i = 0; i < arrSize - 1; ++i) {
			min = i;
			for (int j = i+1; j < arrSize; ++j) {
				if (less(arr[j], arr[min])) {
					min = j; //finds the minimum element in the array starting from for current i-th element
				}
			}
			exchange(arr, i, min);	
		}
	}

	/**
	 * A Method that takes as an argument an array of Comparable type of values and sorts
	 * it in ascending order using the algorithm of INSERTION.
	 * @param arr An array of type Comparable
	 * @throws Exception 
	 */
	public static void insertionSort(Comparable[] arr) throws Exception {
		if (arr == null) throw new Exception("The array is not initialized in the memory.");
		final int arrSize = arr.length;

		for (int i = 1, j; i < arrSize; i++) {	
			j = i;
			while (j > 0 && less(arr[j], arr[j-1])) {
				exchange(arr, j, j-1);
				j--;
			}	
		}
	}
	
	public static void shellsort(Comparable[] arr) {
		// TODO(sona)
	}
	
	/**
	 * Compares given two values.
	 * @param v
	 * @param w
	 * @return true if the comparison is true, and false otherwise
	 */
	private static boolean less (Comparable<Comparable> v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	/**
	 * Exchanges the two elements in the array.
	 * @param arr 
	 * @param i
	 * @param j
	 */
	private static void exchange (Object[] arr, int i, int j) {
		Object buffer = arr[i];
		arr[i] = arr[j];
		arr[j] = buffer;	
	}
	
	/**
	 * Prints out the given array.
	 * @param arr array of Comparable type
	 */
	public static void printArray (Object[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // prints all elements from the array in given order
		}
		System.out.println();
	}
	
	public static boolean isSorted(Comparable[] arr) throws Exception {
		if (arr == null) throw new Exception("The array is not initialized in the memory.");
		for (int i = 0; i < arr.length - 1; i++) {
			if (less(arr[i+1], arr[i])) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		// Testing Selection Sort
		Comparable[] intArray = new Integer[] {5, 2, 7, 1, 9, 3, 4, 2, 9, 45, 23, 76, 32, 54, 76, 12, 0, 45, 2, 76, 76};
		printArray(intArray);

		
		ExecutionTime selectionSortExecTime = new ExecutionTime();
		
		selectionSortExecTime.start(); // start execution time clock
		Sorting.selectionSort(intArray);
		selectionSortExecTime.stop();  // stop execution time clock
		printArray(intArray);
		selectionSortExecTime.printElapsedTime();
		
		// Testing Insertion Sort
		Comparable[] doubleArray = new Integer[] {5, 2, 7, 1, 9, 3, 4, 2, -17, 45, 23, 76, 32, 54, 76, 12, 0, 45, 2, 76, 76};
		Sorting.printArray(doubleArray);
		
		
		selectionSortExecTime.start(); // start execution time clock
		Sorting.insertionSort(doubleArray);
		selectionSortExecTime.stop();  // stop execution time clock
		Sorting.printArray(doubleArray);
		selectionSortExecTime.printElapsedTime();
	}
}
