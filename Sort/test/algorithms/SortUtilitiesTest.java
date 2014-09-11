package algorithms;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;



public class SortUtilitiesTest {

	@Test
	public void emptyArrIsSortedTest() {
		Comparable[] arr = new Double[] {};
		assertTrue(SortUtilities.isSorted(arr));
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void nullArrIsSortedTest() throws IllegalArgumentException {
		Comparable[] arr = null;
		SortUtilities.isSorted(arr);
	}
	
	@Test
	public void TestIsSorted() throws Exception {
		Comparable[] arr = new Integer[] { 5, 4, 3, 2, 1 };
		assertFalse(SortUtilities.isSorted(arr));
		arr = new Integer[] { 1, 2, 3, 4, 5};
		assertTrue(SortUtilities.isSorted(arr));
	}
	
	@Test
	public void stringArrIsSortedTest() {
		Comparable[] strArr = new String[] {"abes", "fabes","karabes","dum", "bom"};
		assertFalse(SortUtilities.isSorted(strArr));
		strArr = new String[] {"abes", "bom", "dum", "fabes", "karabes"}; // or use Arrays.sort(strArr) method instead 
		assertTrue(SortUtilities.isSorted(strArr));
	}
	
	@Test
	public void negativeNumsIsSortedTest() {
		Comparable[] negativeArr = new Double[] {-4., 4., 2., -2., 17., -3.};
		assertFalse(SortUtilities.isSorted(negativeArr));
		Arrays.sort(negativeArr);
		assertTrue(SortUtilities.isSorted(negativeArr));
	}
	
	@Test 
	public void stringArrPrintArrTest() {
		Comparable[] strArr = new String[] {"abes", "fabes","karabes","dum", "bom"};
		SortUtilities.printArray(strArr);
	}
	
	@Test 
	public void lessTest() {
		// if the given arguments are not of type Comparable
		int primitiveX = 20, primitiveY = 10;
		assertTrue(SortUtilities.less(primitiveY, primitiveX));
		assertFalse(SortUtilities.less(primitiveX, primitiveY));
		
	}
	
	@Test
	public void exchangeTest() {
		Integer[] intArr = new Integer[] { 1, 5, 6, 10};
		Integer[] expected = { 10, 5, 6, 1};
		SortUtilities.exchange(intArr, 0, 3);
		assertArrayEquals(expected, intArr);
	}
	
}
