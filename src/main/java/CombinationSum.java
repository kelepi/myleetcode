import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/15
 * Time: 13:30
 */
/*
Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 2,3,6,7 and target 7,
A solution set is:
[7]
[2, 2, 3]
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if (candidates == null || candidates.length == 0 || target <= 0) {
            lists.add(list);
        } else {
            Arrays.sort(candidates);
            combinationSumImpl(candidates, 0, 0, target, lists, list);
        }
        return lists;
    }

    private void combinationSumImpl(int[] candidates, int idx, int sum, int target, List<List<Integer>> lists, List<Integer> list) {
        if (sum == target) {
            List<Integer> re = new ArrayList<Integer>();
            for (int i : list) {
                re.add(i);
            }
            lists.add(re);
        }
        if (idx == candidates.length) {
            return;
        }
        if (sum < target) {
            boolean zero = true;
            int pos = list.size();
            while (sum <= target) {
                if (!zero) list.add(candidates[idx]);
                combinationSumImpl(candidates, idx + 1, sum, target, lists, list);
                sum += candidates[idx];
                zero = false;
            }
            while (list.size() > pos) {
                list.remove(pos);
            }
        }
    }
}
