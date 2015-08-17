import org.junit.Test;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/11
 * Time: 10:18
 */
public class Testz3Sum {
    @Test
    public void testBasic() throws Exception {
        Set<List<Integer>> s = new HashSet<List<Integer>>();
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        s.add(l1);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        assert s.contains(l2);
    }

    @Test
    public void testBasic2() throws Exception {
        int[] ints = {-1, 3, 2, 1, 0, -1, 0};
        Arrays.sort(ints);
        for (int i: ints) {
            System.out.print(i);
        }
    }

    @Test
    public void testSample() throws Exception {
        z3Sum z = new z3Sum();
        int[] ints = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = z.threeSum(ints);

        for (List<Integer> l : list) {
            System.out.print("{");
            for (Integer i : l) {
                System.out.print(i + ", ");
            }
            System.out.println("}");
        }
    }

    /*
    Method 1. With Set and tuple class: 0.055s
    Method 2. Remove duplicates and Set & tuple: 0.03s
    Method 3. Add limitation: 0.019s
     */
    @Test
    public void testTLE() throws Exception {
        z3Sum z = new z3Sum();
        int[] ints = {7, -1, 14, -12, -8, 7, 2, -15, 8, 8, -8, -14, -4, -5, 7, 9, 11, -4, -15, -6, 1, -14, 4, 3, 10, -5, 2, 1, 6, 11, 2, -2, -5, -7, -6, 2, -15, 11, -6, 8, -4, 2, 1, -1, 4, -6, -15, 1, 5, -15, 10, 14, 9, -8, -6, 4, -6, 11, 12, -15, 7, -1, -9, 9, -1, 0, -4, -1, -12, -2, 14, -9, 7, 0, -3, -4, 1, -2, 12, 14, -10, 0, 5, 14, -1, 14, 3, 8, 10, -8, 8, -5, -2, 6, -11, 12, 13, -7, -12, 8, 6, -13, 14, -2, -5, -11, 1, 3, -6};
        List<List<Integer>> list = z.threeSum(ints);

        for (List<Integer> l : list) {
            System.out.print("{");
            for (Integer i : l) {
                System.out.print(i + ", ");
            }
            System.out.println("}");
        }
    }

    @Test
    public void testError() throws Exception {
        z3Sum z = new z3Sum();
        int[] ints = {0, 0, 0};
        assert z.threeSum(ints).size() == 1;
    }
}
