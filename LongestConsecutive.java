import java.util.*; 
public class LongestConsecutive {

    public int longestContinuousSubstring(String s) {
        char[] arr = s.toCharArray();

        if (arr.length == 0) {
            return 0;
        }

        int clen = 1;
        int mlen = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                continue;
            } else if (arr[i] == arr[i - 1] + 1) {
                clen++;
            } else {
                mlen = Math.max(mlen, clen);
                clen = 1;
            }
        }

        return Math.max(mlen, clen);
    }

    public static void main(String[] args) {
        LongestConsecutive lc = new LongestConsecutive();

        String s = "abcdfef";
        int res = lc.longestContinuousSubstring(s);

        System.out.println(res);
    }
}