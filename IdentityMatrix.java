public class IdentityMatrix {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean isIdentity = true;

        // Check if the matrix is an identity matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] != 1) {
                    isIdentity = false;
                    break;
                } else if (i != j && matrix[i][j] != 0) {
                    isIdentity = false;
                    break;
                }
            }
            if (!isIdentity) {
                break;
            }
        }

        // Print the result
        if (isIdentity) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }
    }
}