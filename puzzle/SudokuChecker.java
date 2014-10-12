package puzzle;

public class SudokuChecker {

	/**
	 * Checks the puzzle one row or column at a time using a boolean array.
	 * All values of the checked array, if found, 
	 * will be set to true in the corresponding index in the checker array.
	 * A valid array will have all their values to true.
	 * If any false value is found then it means that a duplicate cell value was found,
	 * or a cell value is not in the valid range of cell values, 1 to n.
	 */
	public static boolean isSolved(int[][] puzzle) {
		
		int max = puzzle[0].length;
		boolean[] checker;
		
		// check rows
		for (int i = 0; i < max; i++) {
			checker = new boolean[max];
			for (int j = 0; j < max; j++) {
				System.out.print(puzzle[i][j] + " ");
				if (puzzle[i][j] < 1 || puzzle[i][j] > max) {
					return false;
				}
				checker[puzzle[i][j]-1] = true;
			}
			for (int j = 0; j < max; j++) {
				if (checker[j] == false) {
					return false;
				}
			}
			System.out.println();
		}
		
		// check columns
		for (int i = 0; i < max; i++) {
			checker = new boolean[max];
			for (int j = 0; j < max; j++) {
				if (puzzle[i][j] < 1 || puzzle[i][j] > max) {
					return false;
				}
				checker[puzzle[j][i]-1] = true;
			}
			for (int j = 0; j < max; j++) {
				if (checker[j] == false) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		int[][] puzzle = new int[][]{{1,2,3}, {2,3,1}, {3,1,2}}; // ok
		System.out.println(isSolved(puzzle));
		
		puzzle = new int[][]{{1,2,3}, {2,3,1}, {1,2,3}}; // must not have duplicate values in a column
		System.out.println(isSolved(puzzle));
		
		puzzle = new int[][]{{1,1,3}, {2,3,1}, {3,1,2}}; // must not have duplicate values in a row
		System.out.println(isSolved(puzzle));
		
		puzzle = new int[][]{{1,2,3}, {2,3,1}, {1,2,-1}}; // must not have value not in 1 to n
		System.out.println(isSolved(puzzle));
		
		puzzle = new int[][]{{1,2,3}, {2,3,1}, {1,2,0}}; // must not have value not in 1 to n
		System.out.println(isSolved(puzzle));
		
		puzzle = new int[3][3]; // must not have value not in 1 to n
		System.out.println(isSolved(puzzle));
		
		puzzle = new int[][]{{1,2}, {2,1}}; // ok
		System.out.println(isSolved(puzzle));
		
		puzzle = new int[][]{{1,2}, {1,2}}; // must not have duplicate values in a column
		System.out.println(isSolved(puzzle));
		
		puzzle = new int[][]{{1,-1}, {1,2}}; // must not have value not in 1 to n
		System.out.println(isSolved(puzzle));
		
		puzzle = new int[][]{{1,3}, {1,2}}; // must not have value not in 1 to n
		System.out.println(isSolved(puzzle));
		
	    // The example from Wikipedia
	    puzzle = new int[][]{ 
	        {5, 3, 4, 6, 7, 8, 9, 1, 2}, 
	        {6, 7, 2, 1, 9, 5, 3, 4, 8},
	        {1, 9, 8, 3, 4, 2, 5, 6, 7},
	        {8, 5, 9, 7, 6, 1, 4, 2, 3},
	        {4, 2, 6, 8, 5, 3, 7, 9, 1},
	        {7, 1, 3, 9, 2, 4, 8, 5, 6},
	        {9, 6, 1, 5, 3, 7, 2, 8, 4},
	        {2, 8, 7, 4, 1, 9, 6, 3, 5},
	        {3, 4, 5, 2, 8, 6, 1, 7, 9}
	    };
		System.out.println(isSolved(puzzle));
	}
}
