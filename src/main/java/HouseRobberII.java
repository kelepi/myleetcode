/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/26
 * Time: 9:56
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] maxWithLastHouse = new int[nums.length];
        int[] maxWithoutLastHouse = new int[nums.length];
        int aMax = 0, bMax = 0;
        for (int i = nums.length - 1; i >= 1; i--) {
            int max = nums[i];
            for (int j = i + 2; j < nums.length; j++) {
                max = Math.max(max, nums[i] + maxWithLastHouse[j]);
            }
            max = Math.max(aMax, max);
            maxWithLastHouse[i] = max;
            aMax = max;
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            int max = nums[i];
            for (int j = i + 2; j < nums.length - 1; j++) {
                max = Math.max(max, nums[i] + maxWithoutLastHouse[j]);
            }
            max = Math.max(bMax, max);
            maxWithoutLastHouse[i] = max;
            bMax = max;
        }
        return Math.max(aMax, bMax);
    }
}
