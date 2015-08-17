package leetcode;

/**
 * Created by Patrick on 15/4/7.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        for (int i = 0; i != k; i++) {
            int temp = nums[nums.length - 1];
            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
            nums[0] = temp;
        }
    }
}
