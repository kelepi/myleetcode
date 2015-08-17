package leetcode;

/**
 * Created by Patrick on 15/5/23.
 */
/*
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3.
It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int cnt = 0, len = 0, prev = 0;
        int l = 0;
        for (int i = 0; i != nums.length; i++) {
            if (i == 0) {
                prev = nums[i];
                len++;
                l++;
                continue;
            }
            if (nums[i] == prev) {
                cnt++;
                if (cnt < 2) {
                    len++;
                    nums[l] = nums[i];
                    l++;
                }
            } else {
                prev = nums[i];
                cnt = 0;
                len++;
                nums[l] = nums[i];
                l++;
            }
        }
        return len;
    }
}
