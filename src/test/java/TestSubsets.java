import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/15
 * Time: 12:28
 */
public class TestSubsets {
    Subsets s = new Subsets();

    @Test
    public void testSample() throws Exception {
        int[] ints = {1, 2, 3};
        List<List<Integer>> lists = s.subsets(ints);
        for (List<Integer> list: lists) {
            System.out.print('[');
            for (int i: list) {
                System.out.print(i + ",");
            }
            System.out.println(']');
        }
    }

    @Test
    public void testError() throws Exception {
        int[] ints = {4,1,0};
        List<List<Integer>> lists = s.subsets(ints);
        for (List<Integer> list: lists) {
            System.out.print('[');
            for (int i: list) {
                System.out.print(i + ",");
            }
            System.out.println(']');
        }
    }
}
