import java.util.Scanner;

class InnerNumberFormatException extends Exception {
    public InnerNumberFormatException(String message) {
        super(message);
    }
}

public class NumberFormatExceptionDemo {

    public static void parseNumber(String num)
            throws InnerNumberFormatException {

        try {
            Integer.parseInt(num);
        } catch (java.lang.NumberFormatException e) {
            throw new InnerNumberFormatException("Invalid number format");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        try {
            parseNumber(num);
            System.out.println("Valid number");
        } catch (InnerNumberFormatException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}