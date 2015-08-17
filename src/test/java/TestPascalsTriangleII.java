import leetcode.PascalsTriangleII;
import org.junit.Test;

import java.util.List;

/**
 * Created by Patrick on 15/4/7.
 */
public class TestPascalsTriangleII {
    @Test
    public void testSample() throws Exception {
        PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();
        for (int i = -2; i != 14; i++) {
            List<Integer> integerList = pascalsTriangleII.getRow(i);
            printList(integerList);
        }
    }

    private void printList(List<Integer> list) {
        if (list != null) {
            System.out.print("{");
            for (Integer i : list) {
                System.out.print(i + ", ");
            }
            System.out.println("}");
        }
    }
}
