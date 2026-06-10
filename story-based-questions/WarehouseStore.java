// Ques:  A warehouse stores item quantities in an array. Find the max, min,
// total stock, and detect duplicates. Extend: rotate the stock array by
// k positions (simulate daily shift handover), and transpose a 2D shelf
// grid.

public class WarehouseStore {
    public static int findMax(int[] stock) {
        int max = stock[0];
        for (int i : stock) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static int findMin(int[] stock) {
        int min = stock[0];
        for (int i : stock) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    public static int findTotal(int[] stock) {
        int total = 0;
        for (int i : stock) {
            total += i;
        }
        return total;
    }
    public static boolean detectDuplicates(int[] stock) {
        for (int i = 0; i < stock.length; i++) {
            for (int j = i + 1; j < stock.length; j++) {
                if (stock[i] == stock[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void rotateArray(int[] stock, int k) {
        int n = stock.length;
        k = k % n; // Handle cases where k > n
        reverse(stock, 0, n - 1);
        reverse(stock, 0, k - 1);
        reverse(stock, k, n - 1);
    }
    public static void reverse(int[] stock, int start, int end) {
        while (start < end) {
            int temp = stock[start];
            stock[start] = stock[end];
            stock[end] = temp;
            start++;
            end--;
        }
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[] stock = {10, 20, 30, 40, 50, 20};
        int[][] shelfGrid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int maxStock = findMax(stock);
        int minStock = findMin(stock);
        int totalStock = findTotal(stock);

        System.out.println("Max Stock: " + maxStock);
        System.out.println("Min Stock: " + minStock);
        System.out.println("Total Stock: " + totalStock);

        boolean hasDuplicates = detectDuplicates(stock);
        System.out.println("Has Duplicates: " + hasDuplicates);

        int k = 2;
        rotateArray(stock, k);
        System.out.print("Rotated Stock: ");
        printArray(stock);

        int[][] transposedGrid = transposeMatrix(shelfGrid);
        System.out.println("Transposed Shelf Grid:");
        printMatrix(transposedGrid);
    }
}
