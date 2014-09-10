package algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortingTest {
	
	@Test
	public void emptyArrIsSortedTest() throws Exception {
		Comparable[] arr = new Double[] {};
		assertTrue(Sorting.isSorted(arr));
	}
	
	@Test (expected=Exception.class)
	public void nullArrIsSortedTest() throws Exception {
		Comparable[] arr = null;
		Sorting.isSorted(arr);
	}
	
	@Test
	public void TestIsSorted() throws Exception {
		Comparable[] arr = new Integer[] { 5, 4, 3, 2, 1 };
		assertFalse(Sorting.isSorted(arr));
		arr = new Integer[] { 1, 2, 3, 4, 5};
		assertTrue(Sorting.isSorted(arr));
	}
	@Test
	public void test() throws Exception {
		Comparable[] arr = new Integer[] { 5, 4, 3, 2, 1 };
		assertFalse(Sorting.isSorted(arr));
		Sorting.insertionSort(arr);
		assertTrue(Sorting.isSorted(arr));
	}
	@Test (expected = Exception.class)
	public void nullArrInsertionSortTest() throws Exception {
		Comparable[] arr = null;
		Sorting.insertionSort(arr);	
	}
	@Test 
	public void emptyArrInsertionSortTest() throws Exception {
		Comparable[] arr = new Double[] {};
		Sorting.insertionSort(arr);
		assertTrue(Sorting.isSorted(arr));
	}
	@Test 
	public void negativeNumbersInsertionSortTest() throws Exception {
		Comparable[] arr = new Integer[] {-1, -2, -3, -4, -5, 0, 3, -6};
		assertFalse(Sorting.isSorted(arr));
		Sorting.insertionSort(arr);
		assertTrue(Sorting.isSorted(arr));
	}

}
