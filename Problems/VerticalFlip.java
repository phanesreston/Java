/* 
  You are given an m x n 2D image matrix where each integer represents a pixel. 
  Flip it in-place along its vertical axis.
*/

public static void flipItVerticalAxis(int[][] matrix) {
    for (int x = 0; x < matrix.length; x++) {
        for (int y = 0; y < matrix[0].length/2; y++) {
            int tmp = matrix[x][matrix[0].length - y - 1];
            matrix[x][matrix[0].length - y - 1] = matrix[x][y];
            matrix[x][y] = tmp;
        }
    }
}
