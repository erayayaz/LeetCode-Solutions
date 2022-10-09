public class Solution {
    public static void main(String[] args) {
        System.out.println(findTarget(-1230));
    }

    public static int findTarget(int x) {
        String ans = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();
        try {
            return Integer.parseInt(ans);
        } catch (Exception e) {
            return 0;
        }
    }
}
