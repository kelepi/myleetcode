import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/21
 * Time: 16:04
 */
/*
Given a collection of numbers that might contain duplicates, return all possible unique permutations.

For example,
[1,1,2] have the following unique permutations:
[1,1,2], [1,2,1], and [2,1,1].
 */
public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();

        ArrayList<Integer> n = new ArrayList<Integer>();
        for (int i = 0; i != nums.length; i++) {
            n.add(nums[i]);
        }
        permutaion(n, 0, lists);

        return lists;
    }

    void permutaion(ArrayList<Integer> sb, int idx, List<List<Integer>> all) {
        if (idx == sb.size()) {
            List<Integer> t = new ArrayList<Integer>(sb);
            all.add(t);
            return;
        }
        Set<Integer> set = new HashSet<Integer>();

        for (int i = idx; i != sb.size(); i++) {
            int tobeSwitched = sb.get(i);
            if (!set.contains(tobeSwitched)) {
                int original = sb.get(idx);
                sb.set(i, original);
                sb.set(idx, tobeSwitched);
                permutaion(sb, idx + 1, all);
                sb.set(idx, original);
                sb.set(i, tobeSwitched);
                set.add(tobeSwitched);
            }
        }
    }
}
