/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/30
 * Time: 9:53
 */
/*
Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
 */
public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        int left = findLeft(nums, target, 0, nums.length - 1);
        int right = findRight(nums, target, 0, nums.length - 1);
        int[] ints = {left, right};
        return ints;
    }

    private int findLeft(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) /2;
        if (nums[mid] == target) {
            if (mid == start) {
                return mid;
            } else if (nums[mid - 1] != target) {
                return mid;
            } else {
                return findLeft(nums, target, start, mid - 1);
            }
        } else if(nums[mid] < target) {
            return findLeft(nums, target, mid + 1, end);
        } else {
            return findLeft(nums, target, start, mid - 1);
        }
    }

    private int findRight(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) /2;
        if (nums[mid] == target) {
            if (mid == end) {
                return mid;
            } else if (nums[mid + 1] != target) {
                return mid;
            } else {
                return findRight(nums, target, mid + 1, end);
            }
        } else if(nums[mid] < target) {
            return findRight(nums, target, mid + 1, end);
        } else {
            return findRight(nums, target, start, mid - 1);
        }
    }
}
