import java.util.Scanner;

class OutExcept extends Exception {
    public OutExcept(String message) {
        super(message);
    }
}

public class StringIndexOutOfBoundsExceptionDemo {

    public static void exceptionMethod(String str) throws OutExcept {
        try {
            for (int i = 0; i < str.length() + 1; i++) {
                char a = str.charAt(i);
            }
        } catch (StringIndexOutOfBoundsException e) {
            throw new OutExcept("Index out of bound");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        try {
            exceptionMethod(str);
        } catch (OutExcept e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}