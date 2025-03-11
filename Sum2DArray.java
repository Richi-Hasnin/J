public class Sum2DArray {
    public static void main(String[] args) {
        // Example 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        // Calculate the sum of all elements in the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        // Print the sum of all elements
        System.out.println("The sum of all elements in the 2D array is " + sum);
    }
}