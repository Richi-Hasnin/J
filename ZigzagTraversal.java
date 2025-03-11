public class ZigzagTraversal {
    public static void main(String[] args) {
        // Example 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Get the dimensions of the array
        int rows = array.length;
        int cols = array[0].length;

        // Traverse the array in a zigzag pattern
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Traverse from left to right
                for (int j = 0; j < cols; j++) {
                    System.out.print(array[i][j] + " ");
                }
            } else {
                // Traverse from right to left
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
