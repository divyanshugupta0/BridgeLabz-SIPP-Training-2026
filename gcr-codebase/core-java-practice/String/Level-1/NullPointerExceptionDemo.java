import java.util.*;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class NullPointerExceptionDemo {

    public  void main() throws MyException {
        Scanner sc = new Scanner(System.in);
        String str = null;

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            throw new MyException("Null reference encountered.");
        }
    }
}