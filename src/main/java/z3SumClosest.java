import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/11
 * Time: 11:23
 */
public class z3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i > 0 && nums[i] == nums[i - 1]) {
                for (int j = i + 1, k = nums.length - 1; j < k; ) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum < closet) {
                        closet = sum;
                        while (j < k && nums[j + 1] == nums[j]) {
                            j++;
                        }
                        while (j < k && nums[k - 1] == nums[k]) {
                            k--;
                        }
                        j++;
                        k--;
                    } else if (nums[i] + nums[j] + nums[k] < 0)
                        j++;
                    else
                        k--;
                }
            }
        }
        return 0;
    }
}
