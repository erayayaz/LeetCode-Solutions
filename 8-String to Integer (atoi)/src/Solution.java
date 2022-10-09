public class Solution {
    public static void main(String[] args) {

        System.out.println(myAtoi("300000000000000"));

    }

    public static int myAtoi(String s) {

        if(s.equals("") || s == null)return 0;
        int digit = 0;
        long ans =0;
        boolean neg = false;
        boolean clamp = false;
        int i = 0;

        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if(s.charAt(i) == '-'){
                neg = true;
            }
            i++;

        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            digit++;
            ans = ans * 10 + s.charAt(i) -'0';
            if(Integer.MAX_VALUE < ans ){
                clamp = true;
                break;
            }
            i++;
        }

        if (digit == 0) return 0;

        if (neg) {

            if (clamp) return Integer.MIN_VALUE;

            return -(int)ans;
        }

        if(clamp){
            return Integer.MAX_VALUE;}

        return (int)ans;
    }
}
