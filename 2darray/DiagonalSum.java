public class DiagonalSum {

    public static int sum = 0;

    public static int sum(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int optimal(int[][] matrix) { //this is having O(n)
        sum = 0; // Reset sum for optimal method
        for (int i = 0; i < matrix.length; i++) {
            // for primary diagonal
            sum += matrix[i][i];

            // for secondary diagonal
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int result = sum(matrix);
        int result1 = optimal(matrix);
        System.out.println("Result for having high time complexity: " + result);
        System.out.println("Result for having low time complexity: " + result1);
    }
}
