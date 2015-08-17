package leetcode;

/**
 * Created by Patrick on 15/5/23.
 */
public class KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        MinStack m = new MinStack(k);
        for (int i = 0; i != nums.length; i++) {
            m.push(nums[i]);
        }
        return m.peek();
    }

    class MinStack {
        final int size;
        int cnt;
        int[] array;

        MinStack(int size) {
            this.size = size;
            cnt = 0;
            array = new int[size];
        }

        int peek() {
            return array[0];
        }

        void push(int val) {
            if (cnt != size) {
                int idx = cnt;
                array[idx] = val;
                while (idx != 0 && idx / 2 >= 0) {
                    if (array[idx / 2] > val) {
                        array[idx] = array[idx / 2];
                        idx = idx / 2;
                    } else {
                        break;
                    }
                }
                array[idx] = val;
                cnt++;
            } else {
                if (val > peek()) {
                    array[0] = val;
                    int idx = 0;
                    while (idx < size) {
                        int min = val, minIdx = idx;
                        if ((idx + 1) * 2 - 1 < size && array[(idx + 1) * 2 - 1] < min) {
                            minIdx = (idx + 1) * 2 - 1;
                            min = array[minIdx];
                        }
                        if ((idx + 1) * 2 < size && array[(idx + 1) * 2] < min) {
                            minIdx = (idx + 1) * 2;
                            min = array[minIdx];
                        }
                        if (minIdx != idx) {
                            array[minIdx] = array[idx];
                            array[idx] = min;
                            idx = minIdx;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }
}
