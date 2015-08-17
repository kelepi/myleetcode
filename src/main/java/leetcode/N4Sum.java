package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Patrick on 15/4/23.
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

        int last1 = input.get(input.size() - 1);
        int last2 = input.get(input.size() - 2) + last1;
        int last3 = input.get(input.size() - 3) + last2;
        for (int i = 0; i < input.size(); i++) {
            int n = input.get(i);
            for (List<Integer> before : active) {
                int sum = n;
                for (int x : before) {
                    sum += x;
                }
                if (before.size() == 3) {
                    if (sum == target) {
                        before.add(n);
                        result.add(before);
                    } else if(sum + last1 > target && sum < target){
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
