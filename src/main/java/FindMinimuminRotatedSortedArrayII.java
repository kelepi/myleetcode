/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/30
 * Time: 10:13
 */
/*
Follow up for "Find Minimum in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

The array may contain duplicates.
 */
public class FindMinimuminRotatedSortedArrayII {
    public int findMin(int[] nums) {
        return findMinImpl(nums, 0, nums.length - 1);
    }

    int findMinImpl(int[] nums, int left, int right) {
        int mid = (left + right) / 2;

        int leftVal = nums[left], midVal = nums[mid], rightVal = nums[right];
        if (leftVal == midVal || rightVal == midVal) {
            int min = nums[mid];
            if (mid > left) {
                min = Math.min(min, findMinImpl(nums, left, mid - 1));
            }
            if (mid < right) {
                min = Math.min(min, findMinImpl(nums, mid + 1, right));
            }
            return min;
        }
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
            if (nums[mid - 1] > nums[mid]) {
                return findMinImpl(nums, mid + 1, right);
            }
            return findMinImpl(nums, left, mid - 1);
        }
        return nums[mid];
    }
}
