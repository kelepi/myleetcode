import leetcode.BinaryTreeLevelOrderTraversal;
import leetcode.ConvertSortedListtoBinarySearchTree;
import object.ListNode;
import object.ListNodeUtils;
import object.TreeNode;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/25.
 */
public class TestConvertSortedListtoBinarySearchTree {
    ConvertSortedListtoBinarySearchTree cvt = new ConvertSortedListtoBinarySearchTree();
    BinaryTreeLevelOrderTraversal b = new BinaryTreeLevelOrderTraversal();

    @Test
    public void testSample() throws Exception {
        int[] ints = {1, 2, 3, 4, 5};
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNodeUtils.printListNode(list);
        TreeNode treeNode = cvt.sortedListToBST(list);
        System.out.println();
    }
    @Test
    public void testSample2() throws Exception {
        int[] ints = {1};
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNodeUtils.printListNode(list);
        TreeNode treeNode = cvt.sortedListToBST(list);
        System.out.println();
    }
    @Test
    public void testSample3() throws Exception {
        int[] ints = {1,2};
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNodeUtils.printListNode(list);
        TreeNode treeNode = cvt.sortedListToBST(list);
        System.out.println();
    }
    @Test
    public void testSample4() throws Exception {
        int[] ints = {1,2,3};
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNodeUtils.printListNode(list);
        TreeNode treeNode = cvt.sortedListToBST(list);
        System.out.println();
    }
    @Test
    public void testSample5() throws Exception {
        int[] ints = {1,2,3,4};
        ListNode list = ListNodeUtils.toListNode(ints);
        ListNodeUtils.printListNode(list);
        TreeNode treeNode = cvt.sortedListToBST(list);
        System.out.println();
    }
}
