import leetcode.N4Sum;
import org.junit.Test;

import java.util.List;

/**
 * Created by Patrick on 15/4/23.
 */
public class TestN4Sum {
    @Test
    public void testTLE() throws Exception {
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
}
