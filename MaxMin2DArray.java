public class MaxMin2DArray {
    public static void main(String[] args) {
        // Example 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Initialize max and min with the first element of the array
        int max = array[0][0];
        int min = array[0][0];

        // Find the maximum and minimum elements in the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }

        // Print the maximum and minimum elements
        System.out.println("The maximum element in the 2D array is " + max);
        System.out.println("The minimum element in the 2D array is " + min);
    }
}