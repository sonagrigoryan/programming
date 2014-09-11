package algorithms;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

@Ignore("base class; not for actual execution.")
public class SortTest {
	private Sorter sorter;
	
	protected final void setSorter(Sorter s) {
		this.sorter = s;
	}
	
	@Test
	public void sortTest() {
		Integer[] arr = new Integer[] { 5, 4, 3, 2, 1 };
		assertFalse(SortUtilities.isSorted(arr));
		sorter.sort(arr);
		assertTrue(SortUtilities.isSorted(arr));
	}

	@Test 
	public void emptyArrSortTest() {
		Double[] arr = new Double[] {};
		sorter.sort(arr);
		assertTrue(SortUtilities.isSorted(arr));
	}
	
	@Test 
	public void negativeNumbersSortTest() {
		Integer[] arr = new Integer[] {-1, -2, -3, -4, -5, 0, 3, -6};
		assertFalse(SortUtilities.isSorted(arr));
		sorter.sort(arr);
		assertTrue(SortUtilities.isSorted(arr));
	}
	
	@Test
	public void stringSortTest() {
		String[] strArr = new String[] {"dom", "ding", "dong", "song", "long", "bong"};
		String[] expectedArr = {"bong", "ding", "dom", "dong", "long","song"};
		sorter.sort(strArr);
		assertArrayEquals(expectedArr, strArr);
	}
}
