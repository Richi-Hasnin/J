public class TransposeMatrix {
    public static void main(String[] args) {
        // Example 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Get the dimensions of the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a new matrix to store the transpose
        int[][] transpose = new int[cols][rows];

        // Compute the transpose of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transpose of the matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}