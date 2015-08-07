/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/30
 * Time: 15:19
 */
/*
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.
 */
public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        return searchImpl(nums, 0, nums.length - 1, target);
    }

    int searchImpl(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int leftVal = nums[left], midVal = nums[mid], rightVal = nums[right];
        if (midVal == target) {
            return mid;
        }
        if (midVal >= leftVal && midVal < rightVal) {
            if (leftVal <= target && target < midVal) {
                return searchImpl(nums, left, mid - 1, target);
            } else if (midVal < target && target <= rightVal) {
                return searchImpl(nums, mid + 1, right, target);
            } else {
                return -1;
            }
        }
        if (midVal < leftVal && midVal < rightVal) {
            if (midVal < target && target <= rightVal) {
                return searchImpl(nums, mid + 1, right, target);
            } else if (target < midVal || target >= leftVal) {
                return searchImpl(nums, left, mid - 1, target);
            } else {
                return -1;
            }
        }
        if (midVal >= leftVal && midVal > rightVal) {
            if (leftVal <= target && target < midVal) {
                return searchImpl(nums, left, mid - 1, target);
            } else if (target > midVal || target <= rightVal) {
                return searchImpl(nums, mid + 1, right, target);
            } else {
                return -1;
            }
        }
        return -1;
    }
}
