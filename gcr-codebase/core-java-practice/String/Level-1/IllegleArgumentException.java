import java.util.Scanner;

class InnerIllegleArgumentException extends Exception {
    public InnerIllegleArgumentException(String message) {
        super(message);
    }
}

public class IllegleArgumentException {

    public static void InnerIllegalArgument(String s)
            throws InnerIllegleArgumentException {

        try {
            String str = s.substring(0, 29);
        } catch (StringIndexOutOfBoundsException e) {
            throw new InnerIllegleArgumentException("Illegal Argument passed");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        try {
            InnerIllegalArgument(str);
        } catch (InnerIllegleArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}