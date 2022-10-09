public class Solution {
    public static void main(String[] args) {
        String[] str = new String[] {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix (String[] strs) {

        String firstElement = strs[0];
        for (int index = 1; index < strs.length; index++ ) {
            while (strs[index].indexOf(firstElement) != 0) {
                firstElement = firstElement.substring(0, firstElement.length() - 1);
            }
        }

        return firstElement;
    }
}
