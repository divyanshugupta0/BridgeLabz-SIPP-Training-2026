public class MultiplicationTable {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if(num < 6 || num > 9){
            System.out.println("Please enter a number between 6 and 9");
            return;
        }
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    
}
