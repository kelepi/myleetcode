import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/11
 * Time: 10:04
 */
/*
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:
Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
The solution set must not contain duplicate triplets.
    For example, given array S = {-1 0 1 2 -1 -4},

    A solution set is:
    (-1, 0, 1)
    (-1, -1, 2)
 */
public class z3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            } else {
                for (int j = i + 1, k = nums.length - 1; j < k; ) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[k]));
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
        return list;
    }
}
