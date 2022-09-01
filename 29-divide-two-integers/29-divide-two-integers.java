class Solution {
    public int divide(int dividend, int divisor) {
             if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MAX_VALUE && divisor == 1) return Integer.MAX_VALUE;
        if (dividend == divisor) return 1;
        if (divisor == 1) return dividend;
        if (divisor == -1) return -dividend;

        
        int sign = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0 ) ? -1 : 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int result = 0;

        while ((dividend - divisor) >=0) {
            result++;
            dividend = dividend - divisor;
        }

        return sign < 0 ? -result : result;
    }
}