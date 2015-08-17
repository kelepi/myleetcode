package lintcode.sort;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/8/7
 * Time: 18:14
 */
public class QuickSort {
    public void quickSort(int[] ints) {
        quickSortImpl(ints, 0, ints.length - 1);
    }

    private void quickSortImpl(int[] ints, int low, int high) {
        if (low < high) {
            int middle = partition(ints, low, high);
            quickSortImpl(ints, low, middle);
            quickSortImpl(ints, middle + 1, high);
        }
    }

    private int partition(int[] ints, int low, int high) {
        int pivot = ints[low];
        while (low < high) {
            while (low < high && ints[high] >= pivot) {
                high--;
            }
            ints[low] = ints[high];
            while (low < high && ints[low] < pivot) {
                low++;
            }
            ints[high] = ints[low];
        }
        ints[low] = pivot;
        return low;
    }
}
