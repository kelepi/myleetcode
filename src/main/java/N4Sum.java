import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/23
 * Time: 19:59
 */
public class N4Sum {
    public List<List<Integer>> fourSum(int[] num, int target) {
        if (num == null || num.length < 4) {
            return new ArrayList<List<Integer>>();
        }
        ArrayList<Integer> input = new ArrayList<Integer>(num.length);
        for (int i : num) {
            input.add(i);
        }
        Collections.sort(input);

        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        List<List<Integer>> list2 = new ArrayList<List<Integer>>();
        List<List<Integer>> active = list1;
        List<List<Integer>> inactive = list2;

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> init = new ArrayList<Integer>();
        init.add(input.get(0));
        active.add(init);

        for (int i = 1; i < input.size(); i++) {
            int n = input.get(i);
            for (List<Integer> before : active) {
                if (before.size() == 3) {
                    int sum = n;
                    for (int x : before) {
                        sum += x;
                    }
                    if (sum == target) {
                        before.add(n);
                        result.add(before);
                    } else {
                        inactive.add(before);
                    }
                } else {
                    ArrayList<Integer> merge = new ArrayList<Integer>(4);
                    merge.addAll(before);
                    merge.add(n);
                    inactive.add(before);
                    inactive.add(merge);
                }
            }
            ArrayList<Integer> cur = new ArrayList<Integer>(4);
            cur.add(n);
            inactive.add(cur);
            active = i % 2 == 1 ? list2 : list1;
            inactive = i % 2 == 1 ? list1 : list2;
            inactive.clear();
        }
        return result;
    }
}
