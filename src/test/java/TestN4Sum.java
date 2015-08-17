import leetcode.N4Sum;
import org.junit.Test;

import java.util.List;

/**
<<<<<<< HEAD
 * Created by Patrick on 15/4/23.
 */
public class TestN4Sum {
    @Test
    public void testTLE22() throws Exception {
        int[] ints = {-474,-445,-442,-426,-410,-382,-369,-367,-356,-351,-339,-335,-335,-320,-318,-313,-276,-250,-227,-215,-209,-209,-200,-198,-189,-183,-154,-149,-138,-134,-121,-110,-97,-93,-86,-66,-61,-54,-33,-12,-9,2,6,13,30,59,82,86,88,111,132,159,162,193,204,220,225,229,231,275,314,327,332,386,400,440,452,457,485};
        int target = 3456;
        N4Sum n4Sum = new N4Sum();
        List<List<Integer>> result = n4Sum.fourSum(ints, target);
        print(result);
    }
    @Test
    public void testSample() throws Exception {
        int[] ints = {1, 0, -1, 0, -2, 2};
        int target = 0;
        N4Sum n4Sum = new N4Sum();
        List<List<Integer>> result = n4Sum.fourSum(ints, target);
        print(result);
    }

    void print(List<List<Integer>> list) {
        for (List<Integer> l: list) {
            for (Integer i: l) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }

    @Test
    public void testName() throws Exception {
        int[] ints = {1, 0, -1, 0, -2, 2};
        N4Sum n4Sum = new N4Sum();
        List<List<Integer>> list = n4Sum.fourSum(ints, 0);

        print(list);
    }

    @Test
    public void testTLE() throws Exception {
        int[] ints = {-500, -481, -480, -469, -437, -423, -408, -403, -397, -381, -379, -377, -353, -347, -337, -327, -313, -307, -299, -278, -265, -258, -235, -227, -225, -193, -192, -177, -176, -173, -170, -164, -162, -157, -147, -118, -115, -83, -64, -46, -36, -35, -11, 0, 0, 33, 40, 51, 54, 74, 93, 101, 104, 105, 112, 112, 116, 129, 133, 146, 152, 157, 158, 166, 177, 183, 186, 220, 263, 273, 320, 328, 332, 356, 357, 363, 372, 397, 399, 420, 422, 429, 433, 451, 464, 484, 485, 498, 499};
        N4Sum n4Sum = new N4Sum();
        for (int i = 2139; i != 3000; i++) {
            System.out.println("Estimate i = " + i);
            List<List<Integer>> list = n4Sum.fourSum(ints, i);
            if (list.size()> 0) {
                System.out.println("Found target = " + i);
                print(list);
                break;
            }
        }
    }


    @Test
    public void testTLE2() throws Exception {
        int[] ints = {-474,-445,-442,-426,-410,-382,-369,-367,-356,-351,-339,-335,-335,-320,-318,-313,-276,-250,-227,-215,-209,-209,-200,-198,-189,-183,-154,-149,-138,-134,-121,-110,-97,-93,-86,-66,-61,-54,-33,-12,-9,2,6,13,30,59,82,86,88,111,132,159,162,193,204,220,225,229,231,275,314,327,332,386,400,440,452,457,485};
        N4Sum n4Sum = new N4Sum();
        for (int i = 3456; i != 3457; i++) {
            System.out.println("Estimate i = " + i);
            List<List<Integer>> list = n4Sum.fourSum(ints, i);
            if (list.size()> 0) {
                System.out.println("Found target = " + i);
                print(list);
                break;
            }
        }
    }
}
