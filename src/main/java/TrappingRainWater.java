/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/11
 * Time: 13:41
 */
/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

For example,
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int sum = 0;

        int effectiveStart = 0, effectiveEnd = height.length - 1;
        while (effectiveStart < effectiveEnd && height[effectiveStart + 1] > height[effectiveStart]) {
            effectiveStart++;
        }
        while (effectiveStart < effectiveEnd && height[effectiveEnd - 1] > height[effectiveEnd]) {
            effectiveEnd--;
        }

        int start = effectiveStart;
        while (start < effectiveEnd) {
            while (start + 1 < effectiveEnd && height[start + 1] > height[start]) {
                start++;
            }
            if (start == effectiveEnd) {
                break;
            }
            int end = effectiveEnd;
            int effectiveHeight = Math.min(height[start], height[end]);

            int pos = end;
            while (end > start) {
                if (height[end] > effectiveHeight) {
                    effectiveHeight =Math.min(height[start], height[end]);
                    pos = end;
                }
                end--;
            }
            for (int i = start + 1; i != pos; i++) {
                sum += effectiveHeight - height[i];
            }
            start = pos;
        }
        return sum;
    }
}
