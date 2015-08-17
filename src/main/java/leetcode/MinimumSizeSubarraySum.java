package leetcode;

/**
 * Created by Patrick on 15/5/12.
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0, right = nums.length - 1, sum = 0;
        for (int i = 0; i != nums.length; i++) {
            sum += nums[i];
        }
        if (sum < s) {
            return 0;
        }
        while (left < right) {
            if (nums[left] < nums[right] && sum - nums[left] >= s) {
                sum -= nums[left];
                left++;
            } else if (nums[left] > nums[right] && sum - nums[right] >= s) {
                sum -= nums[right];
                right--;
            } else if (nums[left] == nums[right] && sum - nums[left] >= s) {
                sum -= nums[left];
                left++;
            } else {
                break;
            }
        }
        return right - left + 1;
    }
}
