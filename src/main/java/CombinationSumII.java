import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/15
 * Time: 19:14
 */
public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> sets = new HashSet<List<Integer>>();
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if (candidates == null || candidates.length == 0 || target <= 0) {
            lists.add(list);
        } else {
            Arrays.sort(candidates);
            combinationSumImpl(candidates, 0, 0, target, sets, list);
            for (List<Integer> l: sets) {
                lists.add(l);
            }
        }
        return lists;
    }

    private void combinationSumImpl(int[] candidates, int idx, int sum, int target, Set<List<Integer>> sets, List<Integer> list) {
        if (sum == target) {
            List<Integer> re = new ArrayList<Integer>();
            for (int i : list) {
                re.add(i);
            }
            sets.add(re);
        }
        if (idx == candidates.length) {
            return;
        }
        if (sum < target) {
            int cur = candidates[idx];
            combinationSumImpl(candidates, idx + 1, sum, target, sets, list);
            int pos = list.size();
            list.add(cur);
            combinationSumImpl(candidates, idx + 1, sum + cur, target, sets, list);
            list.remove(pos);
        }
    }
}
