package algorithms;

public class SelectionSorter implements Sorter {
	/**
	 * A Method that takes as an argument an array of Comparable type of values and sorts
	 * it in ascending order using the algorithm of SELECTION.
	 * @param arr An array of type Comparable
	 */
	@Override
	public void sort(Comparable[] arr) {
		int min; // current minimum value in the array
		final int arrSize = arr.length;
		for (int i = 0; i < arrSize - 1; ++i) {
			min = i;
			for (int j = i+1; j < arrSize; ++j) {
				if (SortUtilities.less(arr[j], arr[min])) {
					min = j; //finds the minimum element in the array starting from for current i-th element
				}
			}
			SortUtilities.exchange(arr, i, min);	
		}
		
	}
}
