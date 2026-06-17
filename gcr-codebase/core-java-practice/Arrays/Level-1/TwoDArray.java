import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        int[] array = new int[rows * cols];
        int idx = 0;
        System.out.print("Enter elements of rows and cols: ");
        for(int i = 0; i < rows; i++ ){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                array[idx++] = arr[i][j];
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
