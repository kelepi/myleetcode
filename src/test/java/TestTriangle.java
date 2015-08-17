import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/6/1
 * Time: 18:27
 */
public class TestTriangle {
    Triangle t = new Triangle();

    /*
    [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
  */
    @Test
    public void testSample() throws Exception {
        List<List<Integer>> listList = new ArrayList<List<Integer>>();
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(2);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(3);
        l2.add(4);
        List<Integer> l3 = new ArrayList<Integer>();
        l3.add(6);
        l3.add(5);
        l3.add(7);
        List<Integer> l4 = new ArrayList<Integer>();
        l4.add(4);
        l4.add(1);
        l4.add(8);
        l4.add(3);
        listList.add(l1);
        listList.add(l2);
        listList.add(l3);
        listList.add(l4);
        int m = t.minimumTotal(listList);
        assert m == 11;
    }
}
