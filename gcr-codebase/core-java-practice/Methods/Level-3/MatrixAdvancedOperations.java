import java.util.Random;

public class MatrixAdvancedOperations {
    public static void main(String[] args) {
        int[][] a2 = randomMatrix(2, 2);
        int[][] a3 = randomMatrix(3, 3);
        int[][] transpose2 = transpose(a2);
        int[][] transpose3 = transpose(a3);
        double det2 = determinant2x2(a2);
        double det3 = determinant3x3(a3);
        double[][] inv2 = inverse2x2(a2);
        double[][] inv3 = inverse3x3(a3);
        printMatrix(transpose2);
        printMatrix(transpose3);
        System.out.println(det2);
        System.out.println(det3);
        printMatrix(inv2);
        printMatrix(inv3);
    }

    public static int[][] randomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static double determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static double determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] inverse2x2(int[][] matrix) {
        double det = determinant2x2(matrix);
        double[][] result = new double[2][2];
        if (det == 0) {
            return result;
        }
        result[0][0] = matrix[1][1] / det;
        result[0][1] = -matrix[0][1] / det;
        result[1][0] = -matrix[1][0] / det;
        result[1][1] = matrix[0][0] / det;
        return result;
    }

    public static double[][] inverse3x3(int[][] matrix) {
        double det = determinant3x3(matrix);
        double[][] result = new double[3][3];
        if (det == 0) {
            return result;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[j][i] = cofactor(matrix, i, j) / det;
            }
        }
        return result;
    }

    public static double cofactor(int[][] matrix, int row, int col) {
        int[][] minor = new int[2][2];
        int m = 0;
        for (int i = 0; i < 3; i++) {
            if (i == row) continue;
            int n = 0;
            for (int j = 0; j < 3; j++) {
                if (j == col) continue;
                minor[m][n++] = matrix[i][j];
            }
            m++;
        }
        double det = minor[0][0] * minor[1][1] - minor[0][1] * minor[1][0];
        return ((row + col) % 2 == 0 ? 1 : -1) * det;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
