
class Solution {
    public int minPartitions(String n) {
        
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            if (Character.isDigit(n.charAt(i))) {
               if (Character.getNumericValue(n.charAt(i)) > max) {
                   max = Character.getNumericValue(n.charAt(i));
               }
            }
        }

        return max;
    }
}