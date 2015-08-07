import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/15
 * Time: 12:55
 */
/*
Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

For example,
If n = 4 and k = 2, a solution is:

[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if (k > n) {
            lists.add(list);
        } else {
            combineImpl(n + 1, 1, k, lists, list);
        }
        return lists;
    }

    private void combineImpl(int n, int i, int k, List<List<Integer>> lists, List<Integer> list) {
        if (k == 0) {
            List<Integer> re = new ArrayList<Integer>(list.size());
            for (Integer num: list) {
                re.add(num);
            }
            lists.add(re);
        } else if (n - i >= k) {
            combineImpl(n, i + 1, k, lists, list);
            int idx =list.size();
            list.add(i);
            combineImpl(n, i + 1, k - 1, lists, list);
            list.remove(idx);
        }
    }
}
