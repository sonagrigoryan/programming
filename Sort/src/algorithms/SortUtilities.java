package algorithms;

public final class SortUtilities {
	/**
	 * Compares given two values.
	 * @param v
	 * @param w
	 * @return true if the comparison is true, and false otherwise
	 */
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	/**
	 * Exchanges the two elements in the array.
	 * @param arr 
	 * @param i
	 * @param j
	 */
	public static void exchange (Object[] arr, int i, int j) {
		// TODO(sona): check arr is not null, i and j are within arr.
		Object buffer = arr[i];
		arr[i] = arr[j];
		arr[j] = buffer;	
	}
	
	/**
	 * isSorted method checks if the given array is in sorted order or not.
	 * @param arr An array of Comparable type
	 * @return Returns true if array is in sorted order, and false otherwise.
	 */
	public static boolean isSorted(Comparable[] arr) {
		if (arr == null) throw new IllegalArgumentException("The array is not initialized in the memory.");
		for (int i = 0; i < arr.length - 1; i++) {
			if (less(arr[i+1], arr[i])) {
				return false;
			}
		}
		return true;
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
}
