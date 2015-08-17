package lintcode.sort;

import lintcode.LintCodeUtils;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/8/7
 * Time: 18:26
 */
public class TestQuickSort {
    QuickSort qs = new QuickSort();

    @Test
    public void testQuickSortBasic() throws Exception {
        int[] ints = {5, 4, 1, 2, 3};
        qs.quickSort(ints);
        LintCodeUtils.printIntArray(ints);
    }
}
