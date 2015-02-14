package math.matrix;

/**
 * O(n^6)
 */
public class MaximumSubmatrixSumBruteForce {

	public static void main(String[] args) {
		int[][] matrix = {{0,-2,-7,0},{9,2,-6,2},{-4,1,-4,1},{-1,8,0,-2}};
		System.out.println(findMaxSum(matrix));

		matrix = new int[][] {{1}};
		System.out.println(findMaxSum(matrix));

		matrix = new int[][] {{4},{-2}};
		System.out.println(findMaxSum(matrix));

		matrix = new int[][] {{0},{1}};
		System.out.println(findMaxSum(matrix));

		matrix = new int[][] {{1},{0},{1},{0}};
		System.out.println(findMaxSum(matrix));

		matrix = new int[][] {{4,-2},{0,0},{-1,0},{2,3}};
		System.out.println(findMaxSum(matrix));

		matrix = new int[][] {{-1,-4,-5,-4},{-5,8,-1,3},{-2,1,3,2},{1,5,6,-9}};
		System.out.println(findMaxSum(matrix));

	}
	
	public static int findMaxSum(int matrix[][]) {
		int rows = matrix.length;
		int max = 0;
		
		if (rows > 0) {
			int cols = matrix[0].length;
			if (cols > 0) {

				// i, j will determine the size of the submatrix
				for (int i = rows; i > 0; i--) {
					for (int j = cols; j > 0; j--) {
						// x, y will determine the top left of the submatrix
						for (int x = 0; x <= rows - i; x++) {
							for (int y = 0; y <= cols - j; y++) {
								int sum = 0;
								for (int a = x; a < x + i; a++) {
									for (int b = y; b < y + j; b++) {
										sum += matrix[a][b];
									}
								}
								max = sum > max ? sum : max;
							}
						}
					}
				}
			}
		}
		
		
		return max;
	}

}
