import object.TreeLinkNode;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/29
 * Time: 10:31
 */
public class TestPopulatingNextRightPointersinEachNodeII {
    PopulatingNextRightPointersinEachNodeII p = new PopulatingNextRightPointersinEachNodeII();

    /*
        1
       /  \
      2    3
     / \    \
    4   5    7
     */
    @Test
    public void testSample() throws Exception {
        TreeLinkNode t1 = new TreeLinkNode(1);
        TreeLinkNode t2 = new TreeLinkNode(2);
        TreeLinkNode t3 = new TreeLinkNode(3);
        TreeLinkNode t4 = new TreeLinkNode(4);
        TreeLinkNode t5 = new TreeLinkNode(5);
        TreeLinkNode t7 = new TreeLinkNode(7);
        TreeLinkNode t8 = new TreeLinkNode(8);
        TreeLinkNode t9 = new TreeLinkNode(9);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.right = t7;
        t5.right = t8;
        t7.left = t9;

        p.connect(t1);
        System.out.println();
    }
}
