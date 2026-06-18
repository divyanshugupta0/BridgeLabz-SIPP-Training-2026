import java.util.Scanner;

public class OTPGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }
        System.out.println(areUnique(otps));
        for (int otp : otps) {
            System.out.println(otp);
        }
    }

    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
