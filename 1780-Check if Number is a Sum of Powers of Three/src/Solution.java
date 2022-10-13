import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(85));
        System.out.println(checkPowersOfThreeFasterSolution(85));

    }

    //My Solution
    /*Runtime: 1 ms, faster than 39.78% of Java online submissions for Check if Number is a Sum of Powers of Three.
    Memory Usage: 40.9 MB, less than 43.71% of Java online submissions for Check if Number is a Sum of Powers of Three.*/
    public static boolean checkPowersOfThree(int n){

        for (int power = 16; power >= 0; power--) {
            if ((int) Math.pow(3, power) <= n) {
                n = n - (int) Math.pow(3, power);
                if (n == 0)
                    return true;
            }
        }

        return  false;
    }

    //Faster solution than mine
    /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Check if Number is a Sum of Powers of Three.
    Memory Usage: 40.7 MB, less than 71.04% of Java online submissions for Check if Number is a Sum of Powers of Three.*/
    public static boolean checkPowersOfThreeFasterSolution(int n) {
        if(n==0){
            return true;
        }
        int x = n%3;
        //this will give the digit at that particular place in ternary representation;
        if(x==2){
            return false;
        }

        return checkPowersOfThreeFasterSolution(n/3);
    }
}
