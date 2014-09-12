package algorithms;

import utilities.SortUtilities;

public class InsertionSorter implements Sorter {
	/**
	 * A Method that takes as an argument an array of Comparable type of values and sorts
	 * it in ascending order using the algorithm of INSERTION.
	 * @param arr An array of type Comparable
	 * @throws Exception 
	 */
	public void sort(Comparable[] arr) {
		if (arr == null) throw new IllegalArgumentException("The array is not initialized in the memory.");
		final int arrSize = arr.length;

		for (int i = 1, j; i < arrSize; i++) {	
			j = i;
			while (j > 0 && SortUtilities.less(arr[j], arr[j-1])) {
				SortUtilities.exchange(arr, j, j-1);
				j--;
			}	
		}
	}
}
