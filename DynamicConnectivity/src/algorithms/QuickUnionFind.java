package algorithms;
/***
 * QuickUnionFind is a class built based on eager approach to solve dynamic connectivity problems.
 * @author sonagrigoryan
 *
 */
public class QuickUnionFind {
	private int[] ids;
	private int componentAmount;
	
	/**
	 * QuickUnionFind constructor initializes union-find data structure with n objects (0 to n-1).
	 * QuickUnionFind algorithm is quadratic time process (~N^2)
	 * @param n n is the number of object that union-find structure will have
	 */
	public QuickUnionFind(int n) {
		componentAmount = n;
		ids = new int[n];
		for (int i = 0; i < n; ++i) {
			ids[i] = i;
		}
	}
	
	/**
	 * union() method adds connection between ids X and Y.
	 * @param objX
	 * @param objY
	 */
	public void union(int indexX, int indexY) {
		int valueX = ids[indexX];
		int valueY = ids[indexY];
		if (valueX == valueY) return;
		for (int i = 0; i < ids.length; i++) {
			if (ids[i] == valueX) {
				ids[i] = valueY;
			}
		}
		componentAmount--;
	}
	
	/**
	 * isCommected() method checks if given two ids are connected to each other.
	 * @param indexX First component of type int
	 * @param indexY Second component of type int
	 * @return Returns true if the two ids are connected, and false otherwise.
	 */
	public boolean isConnected(int indexX, int indexY) {
		return ids[indexX] == ids[indexY];
	}
	
	/**
	 * find() method identifies the component for given index
	 * @param indexX index of searched component 
	 * @return
	 */
	public int find(int indexX) {
		return ids[indexX];
	}
	
	/**
	 * componentAmount() method calculates the total amount of ids.
	 * @return Returns an integer representing the total amount of ids	
	 */
	public int componentAmount() {
		return componentAmount;
	}
	
	/**
	 * print(int[] arr) method prints the whole array.
	 * @param arr Array of type int[]
	 */
	public  void print() {
		if (ids.length != 0 || ids != null) {
			for (int i = 0; i < ids.length; i++) {
				System.out.print(" " + ids[i]);
			}
		}
	}
}
