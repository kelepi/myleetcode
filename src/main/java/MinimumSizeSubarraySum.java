/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/22
 * Time: 13:54
 */
/*
Given an array of n positive integers and a positive integer s,
find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.

For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint.

click to show more practice.

More practice:
If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n).
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int l = 0, r = 0, sum = 0, min = Integer.MAX_VALUE;
        while (r != nums.length) {
            sum += nums[r];
            if (sum >= s) {
                while (true) {
                    if (sum - nums[l] >= s) {
                        sum -= nums[l];
                        l++;
                    } else {
                        min = Math.min(r - l + 1, min);
                        sum = 0;
                        l = l + 1;
                        r = l;
                        break;
                    }
                }
            } else {
                r++;
            }
        }
        return min == Integer.MAX_VALUE ? 0: min;
    }
}
