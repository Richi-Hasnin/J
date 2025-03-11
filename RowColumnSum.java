public class RowColumnSum {
    public static void main(String[] args) {
        // Example 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calculate the sum of each row
        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        // Calculate the sum of each column
        for (int j = 0; j < array[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < array.length; i++) {
                colSum += array[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }
    }
}