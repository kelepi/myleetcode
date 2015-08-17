package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Patrick on 15/4/11.
 */
public class MajorityElement {
    public int majorityElement(int[] num) {
        int re = 0, max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : num) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                re = e.getKey();
                max = e.getValue();
            }
        }
        return re;
    }
}
