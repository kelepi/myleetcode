package leetcode;

import java.util.*;

/**
 * Created by Patrick on 15/6/30.
 */
public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }
        int fast;
        TreeSet<Wrapper> treeSet = new TreeSet<Wrapper>(new Comparator<Wrapper>() {
            public int compare(Wrapper o1, Wrapper o2) {
                return new Long(o1.val).compareTo(new Long(o2.val));
            }
        });
        LinkedList<Wrapper> list = new LinkedList<Wrapper>();
        for (fast = 0; fast != nums.length; fast++) {
            if (list.size() > k) {
                Wrapper w = list.poll();
                treeSet.remove(w);
            }
            Wrapper current = new Wrapper(nums[fast], fast);

            if (!treeSet.isEmpty()) {
                SortedSet<Wrapper> prev = treeSet.headSet(current, true);
                SortedSet<Wrapper> next = treeSet.tailSet(current, true);
                if (!prev.isEmpty() && Math.abs(prev.last().val - current.val) <= t)
                    return true;
                if (!next.isEmpty() && Math.abs(next.first().val - current.val) <= t)
                    return true;
            }
            list.add(current);
            treeSet.add(current);
        }

        return false;
    }

    class Wrapper {
        final long val;
        final long index;

        public Wrapper(long val, long index) {
            this.val = val;
            this.index = index;
        }
    }
}
