package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Patrick on 15/5/25.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i: nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}
