import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        // Example 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int number = scanner.nextInt();

        boolean found = false;

        // Search for the number in the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == number) {
                    System.out.println("Number " + number + " found at position (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Number " + number + " not found in the array.");
        }

        scanner.close();
    }
}