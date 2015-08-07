/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/29
 * Time: 10:02
 */
/*
A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.

click to show spoilers.

Note:
Your solution should be in logarithmic complexity.
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        return findPeakElementImplx(nums, 0, nums.length);
    }

    int findPeakElementImplx(int[] nums, int start, int end) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (mid == 0) {
            if (mid == nums.length - 1) {
                return mid;
            } else if (nums[mid] > nums[mid + 1]) {
                return mid;
            }
        } else if (mid == nums.length - 1 && nums[mid] > nums[mid - 1]) {
            return mid;
        } else if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
            return mid;
        }
        int find = findPeakElementImplx(nums, start, mid);
        if (find == -1 && mid != start) {
            find = findPeakElementImplx(nums, mid, end);
        }
        return find;
    }
}
