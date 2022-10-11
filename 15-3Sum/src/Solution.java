import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {0,0,0,0};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum (int[] nums ){

        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        int index=0, numsSize = nums.length;

        while ( index < numsSize - 2) {
            int j = index + 1;
            int k = numsSize - 1;

            if ((index > 0 && nums[index] != nums[index - 1]) || index == 0) {
                while (j < k) {
                    if ((nums[index] + nums[j] + nums[k]) == 0) {
                        output.add(new ArrayList<>(Arrays.asList(nums[index],nums[j],nums[k])));
                        while(j < k && nums[j] == nums[j + 1]) j++;
                        while(j < k && nums[k] == nums[k - 1]) k--;
                        j++;
                        k--;
                    } else if ((nums[index] + nums[j] + nums[k]) < 0) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }

            index++;
        }

        return output;
    }
}
