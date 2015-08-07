import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/18
 * Time: 17:52
 */
/*
Given a collection of integers that might contain duplicates, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
 */
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
        if (nums == null) {
            return subsets;
        }
        Arrays.sort(nums);

        int i = 0;
        while (i != nums.length) {
            List<List<Integer>> newLists = new ArrayList<List<Integer>>();
            List<Integer> curNumber = new ArrayList<Integer>();
            curNumber.add(nums[i]);
            newLists.add(curNumber);
            int j = i + 1;
            for (; j != nums.length; j++) {
                if (nums[j] == nums[i]) {
                    List<Integer> dupList = new ArrayList<Integer>();
                    for (int k = 0; k != (j - i + 1); k++) {
                        dupList.add(nums[i]);
                    }
                    newLists.add(dupList);
                } else {
                    break;
                }
            }
            i = j;
            List<List<Integer>> mergedList = new ArrayList<List<Integer>>();
            for (List<Integer> list : subsets) {
                for (List<Integer> list2 : newLists) {
                    List<Integer> mList = new ArrayList<Integer>();
                    mList.addAll(list);
                    mList.addAll(list2);
                    mergedList.add(mList);
                }
            }
            for (List<Integer> list : subsets) {
                mergedList.add(list);
            }
            for (List<Integer> list2 : newLists) {
                mergedList.add(list2);
            }
            subsets = mergedList;
        }
        List<Integer> emptyList = new ArrayList<Integer>();
        subsets.add(emptyList);
        return subsets;
    }
}
