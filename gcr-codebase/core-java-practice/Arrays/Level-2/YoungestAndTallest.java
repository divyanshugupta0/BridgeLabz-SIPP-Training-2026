import java.util.Scanner;
public class YoungestAndTallest {
    public void main(){
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        float[] height = new float[3];
        float tallest = 0;
        int youngest = 0;
        for(int i = 0; i< 3; i++){
            System.out.print("Enter age of employee "+(i+1)+" :");
            age[i] = sc.nextInt();
            System.out.print("Enter height of employee "+(i+1)+" :");
            height[i] = sc.nextFloat();
            if(age[i] > youngest){
                youngest = age[i];
            }
            if(height[i] > tallest){
                tallest = height[i];
            }
        }
        System.out.println("Tallest is :"+tallest);
        System.out.print("Youngest is :"+youngest);

    }
}
