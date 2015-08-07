import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 14:45
 */
/*
You are a professional robber planning to rob houses along a street.
Each house has a certain amount of money stashed,
the only constraint stopping you from robbing each of them is that adjacent houses have security system connected
and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house,
determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber {
    public int rob(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        return robImpl(nums, 0, map);
    }

    public int robImpl(int[] nums, int start, Map<Integer, Integer> map) {
        if (start >= nums.length) {
            return 0;
        }
        if (map.containsKey(start)) {
            return map.get(start);
        }
        int a = robImpl(nums, start + 2, map) + nums[start];
        int b = robImpl(nums, start + 1, map);
        int max = Math.max(a, b);
        map.put(start, max);
        return max;
    }
}
