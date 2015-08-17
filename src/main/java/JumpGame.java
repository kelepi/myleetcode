/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/12
 * Time: 10:00
 */
/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return true;
        }
        int curMax = 0, nextMax = nums[0], pos = 0;
        do {
            pos = curMax;
            curMax = nextMax;
            for (int i = pos; i <= curMax; i++) {
                nextMax = Math.max(nextMax, nums[i] + i);
                if (nextMax >= nums.length - 1) {
                    return true;
                }
            }
        } while (curMax < nextMax);
        return nextMax >= nums.length - 1;
    }

    private boolean canJump(int[] nums, int pos) {
        if (pos >= nums.length) {
            return true;
        }
        int maxJump = nums[pos];
        for (int i = 1; i <= maxJump; i++) {
            if (canJump(nums, pos + i)) {
                return true;
            }
        }
        return false;
    }
}
