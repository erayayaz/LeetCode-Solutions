import java.util.regex.Pattern;

class Solution {
    public int minPartitions(String n) {
        
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            if (pattern.matcher(String.valueOf(n.charAt(i))).matches()) {
               if ((n.charAt(i) - '0') > max) {
                   max = n.charAt(i) - '0';
               }
            }
        }

        return max;
    }
}