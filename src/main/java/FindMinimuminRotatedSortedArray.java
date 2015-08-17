/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/29
 * Time: 10:21
 */
/*
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.

(left + right + 1) / 2
2 4 5 6 7 0 1 （比两边大 -> 比左边大即可）
6 7 0 1 （比右边小）
6 7 0 (比左边大）
7 0 （mid = right，结束）


6 7 0 1 2 4 5 （比两边小 -> 比右边小即可）
6 7 0 1 （比右边小）
6 7 0 （比左边大）
7 0 （mid = right，结束）

 */
public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        return findMinImpl(nums, 0, nums.length - 1);
    }

    int findMinImpl(int[] nums, int left, int right) {
        int mid = (left + right) / 2;

        int leftVal = nums[left], midVal = nums[mid], rightVal = nums[right];
        if (midVal >= leftVal && midVal > rightVal) {
            return findMinImpl(nums, mid + 1, right);
        }
        if (midVal > leftVal && midVal < rightVal) {
            return findMinImpl(nums, left, mid - 1);
        }
        if (midVal < leftVal && midVal < rightVal) {
            if (nums[mid - 1] > nums[mid] && nums[mid + 1] > nums[mid]) {
                return nums[mid];
            }
            return findMinImpl(nums, left, mid - 1);
        }
        return nums[mid];
    }
}
