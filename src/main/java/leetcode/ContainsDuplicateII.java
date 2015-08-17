package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Patrick on 15/6/13.
 */
/*
Given an array of integers and an integer k, find out whether there there are two distinct indices i and j
in the array such that nums[i] = nums[j]
and the difference between i and j is at most k.
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i != nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.put(nums[i], i) <= k) {
                    return true;
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
