import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/15
 * Time: 12:22
 */
/*
Given a set of distinct integers, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        byte[] bits = new byte[nums.length];
        subsetsImpl(nums, bits, 0, lists);
        return lists;
    }

    private void subsetsImpl(int[] nums, byte[] bits, int i, List<List<Integer>> lists) {
        if (i == bits.length) {
            List<Integer> list = new ArrayList<Integer>();
            for (int n = 0; n != bits.length; n++) {
                if (bits[n] != 0) {
                    list.add(nums[n]);
                }
            }
            lists.add(list);
        } else {
            bits[i] = 0;
            subsetsImpl(nums, bits, i + 1, lists);
            bits[i] = 1;
            subsetsImpl(nums, bits, i + 1, lists);
        }
    }
}
