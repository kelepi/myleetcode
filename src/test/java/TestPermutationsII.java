import org.junit.Test;
import utils.Utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/21
 * Time: 16:10
 */
public class TestPermutationsII {
    PermutationsII p = new PermutationsII();

    @Test
    public void testSample() throws Exception {
        int[] ints = {1, 1, 2};
        List<List<Integer>> lists = p.permuteUnique(ints);
        Utils.printListListInteger(lists);
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {1, 1};
        List<List<Integer>> lists = p.permuteUnique(ints);
        Utils.printListListInteger(lists);
    }

    @Test
    public void testSample3() throws Exception {
        int[] ints = {1, 2};
        List<List<Integer>> lists = p.permuteUnique(ints);
        Utils.printListListInteger(lists);
    }

    @Test
    public void testSample4() throws Exception {
        int[] ints = {1};
        List<List<Integer>> lists = p.permuteUnique(ints);
        Utils.printListListInteger(lists);
    }

    @Test
    public void testSample5() throws Exception {
        int[] ints = {1, 1, 1, 2};
        List<List<Integer>> lists = p.permuteUnique(ints);
        Utils.printListListInteger(lists);
    }
}
