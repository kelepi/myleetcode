import library.tree.TreeBuilder;
import object.TreeNode;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/7/22
 * Time: 13:48
 */
public class TestTreeBuilder {
    TreeBuilder treeBuilder = new TreeBuilder();

    @Test
    public void testBuildTreeNull() throws Exception {
        int[] intsA = {};
        int[] intsB = {1};
        assert treeBuilder.buildTreeByPreOrderAndInOrder(null, null) == null;
        assert treeBuilder.buildTreeByPreOrderAndInOrder(null, intsA) == null;
        assert treeBuilder.buildTreeByPreOrderAndInOrder(intsA, null) == null;
        assert treeBuilder.buildTreeByPreOrderAndInOrder(intsA, intsB) == null;
        assert treeBuilder.buildTreeByPreOrderAndInOrder(intsB, intsA) == null;
    }

    @Test
    public void testBuildTree1Elem() throws Exception {
        int[] pre = {1};
        int[] in = {1};
        TreeNode node = treeBuilder.buildTreeByPreOrderAndInOrder(pre, in);
        assert node != null;
        assert node.val == 1;
        assert node.left == null;
        assert node.right == null;
    }

    @Test
    public void testBuildTree2Elem() throws Exception {
        int[] pre = {2, 1};
        int[] in = {1, 2};
        TreeNode node = treeBuilder.buildTreeByPreOrderAndInOrder(pre, in);
        assert node != null;
        assert node.val == 2;
        assert node.left != null;
        assert node.left.val == 1;
        assert node.left.left == null;
        assert node.left.right == null;
        assert node.right == null;
    }

    @Test
    public void testBuildTree3ElemL() throws Exception {
        int[] pre = {3, 2, 1};
        int[] in = {1, 2, 3};
        TreeNode node = treeBuilder.buildTreeByPreOrderAndInOrder(pre, in);
        assert node != null;
        assert node.val == 3;
        assert node.left != null;
        assert node.left.val == 2;
        assert node.left.left != null;
        assert node.left.left.val == 1;
        assert node.left.left.left == null;
        assert node.left.left.right == null;
        assert node.left.right == null;
        assert node.right == null;
    }

    @Test
    public void testBuildTree3ElemR() throws Exception {
        int[] pre = {1, 2, 3};
        int[] in = {1, 2, 3};
        TreeNode node = treeBuilder.buildTreeByPreOrderAndInOrder(pre, in);
        assert node != null;
        assert node.val == 1;
        assert node.right != null;
        assert node.right.val == 2;
        assert node.right.right != null;
        assert node.right.right.val == 3;
        assert node.right.right.left == null;
        assert node.right.right.right == null;
        assert node.right.left == null;
        assert node.left == null;
    }

    @Test
    public void testBuildTree3ElemM() throws Exception {
        int[] pre = {2, 1, 3};
        int[] in = {1, 2, 3};
        TreeNode node = treeBuilder.buildTreeByPreOrderAndInOrder(pre, in);
        assert node != null;
        assert node.val == 2;
        assert node.right != null;
        assert node.right.val == 3;
        assert node.right.right == null;
        assert node.right.left == null;
        assert node.left != null;
        assert node.left.val == 1;
        assert node.left.left == null;
        assert node.left.right == null;
    }

    /*
    Runtime Error Message:
    Line 31: java.lang.StackOverflowError
    Last executed input:
    [1,2,3], [2,3,1]
     */

    @Test
    public void testbuildTreeError() throws Exception {
        int[] pre = {1, 2, 3};
        int[] in = {2, 3, 1};
        TreeNode node = treeBuilder.buildTreeByPreOrderAndInOrder(pre, in);
        assert node != null;
        assert node.val == 1;
        assert node.left != null;
        assert node.left.val == 2;
        assert node.right == null;
        assert node.left.left == null;
        assert node.left.right != null;
        assert node.left.right.val == 3;
        assert node.left.right.left == null;
        assert node.left.right.right == null;
    }

    /*
    Input:
    [4,1,3,2], [1,2,3,4]
    Output:
    [4,1,null,null,2,null,3]
    Expected:
    [4,1,null,null,3,2]
     */
    @Test
    public void testbuildTreeError2() throws Exception {
        int[] pre = {4, 1, 3, 2};
        int[] in = {1, 2, 3, 4};
        TreeNode node = treeBuilder.buildTreeByPreOrderAndInOrder(pre, in);
        assert node != null;
        assert node.val == 4;
        assert node.left != null;
        assert node.left.val == 1;
        assert node.right == null;
        assert node.left.left == null;
        assert node.left.right != null;
        assert node.left.right.val == 3;
        assert node.left.right.left != null;
        assert node.left.right.left.val == 2;
        assert node.left.right.left.left == null;
        assert node.left.right.left.right == null;
        assert node.left.right.right == null;
    }

    @Test
    public void testBuildTreePostNull() throws Exception {
        int[] intsA = {};
        int[] intsB = {1};
        assert treeBuilder.buildTreeByPostOrderAndInOrder(null, null) == null;
        assert treeBuilder.buildTreeByPostOrderAndInOrder(null, intsA) == null;
        assert treeBuilder.buildTreeByPostOrderAndInOrder(intsA, null) == null;
        assert treeBuilder.buildTreeByPostOrderAndInOrder(intsA, intsB) == null;
        assert treeBuilder.buildTreeByPostOrderAndInOrder(intsB, intsA) == null;
    }

    @Test
    public void testBuildTreePost1Elem() throws Exception {
        int[] post = {1};
        int[] in = {1};
        TreeNode node = treeBuilder.buildTreeByPostOrderAndInOrder(in, post);
        assert node != null;
        assert node.val == 1;
        assert node.left == null;
        assert node.right == null;
    }

    @Test
    public void testBuildTreePost2Elem() throws Exception {
        int[] post = {1, 2};
        int[] in = {1, 2};
        TreeNode node = treeBuilder.buildTreeByPostOrderAndInOrder(in, post);
        assert node != null;
        assert node.val == 2;
        assert node.left != null;
        assert node.left.val == 1;
        assert node.left.left == null;
        assert node.left.right == null;
        assert node.right == null;
    }

    @Test
    public void testBuildTreePost3ElemL() throws Exception {
        int[] post = {1, 2, 3};
        int[] in = {1, 2, 3};
        TreeNode node = treeBuilder.buildTreeByPostOrderAndInOrder(in, post);
        assert node != null;
        assert node.val == 3;
        assert node.left != null;
        assert node.left.val == 2;
        assert node.left.left != null;
        assert node.left.left.val == 1;
        assert node.left.left.left == null;
        assert node.left.left.right == null;
        assert node.left.right == null;
        assert node.right == null;
    }

    @Test
    public void testBuildTreePost3ElemR() throws Exception {
        int[] in = {1, 2, 3};
        int[] post = {3, 2, 1};
        TreeNode node = treeBuilder.buildTreeByPostOrderAndInOrder(in, post);
        assert node != null;
        assert node.val == 1;
        assert node.right != null;
        assert node.right.val == 2;
        assert node.right.right != null;
        assert node.right.right.val == 3;
        assert node.right.right.left == null;
        assert node.right.right.right == null;
        assert node.right.left == null;
        assert node.left == null;
    }

    @Test
    public void testBuildTreePost3ElemM() throws Exception {
        int[] in = {1, 2, 3};
        int[] post = {1, 3, 2};
        TreeNode node = treeBuilder.buildTreeByPostOrderAndInOrder(in, post);
        assert node != null;
        assert node.val == 2;
        assert node.right != null;
        assert node.right.val == 3;
        assert node.right.right == null;
        assert node.right.left == null;
        assert node.left != null;
        assert node.left.val == 1;
        assert node.left.left == null;
        assert node.left.right == null;
    }

    /*
    Runtime Error Message:
    Line 31: java.lang.StackOverflowError
    Last executed input:
    [1,2,3], [2,3,1]
     */
    @Test
    public void testbuildTreePostError() throws Exception {
        int[] in = {2, 3, 1};
        int[] post = {3, 2, 1};
        TreeNode node = treeBuilder.buildTreeByPostOrderAndInOrder(in, post);
        assert node != null;
        assert node.val == 1;
        assert node.left != null;
        assert node.left.val == 2;
        assert node.right == null;
        assert node.left.left == null;
        assert node.left.right != null;
        assert node.left.right.val == 3;
        assert node.left.right.left == null;
        assert node.left.right.right == null;
    }

    /*
    Input:
    [4,1,3,2], [1,2,3,4]
    Output:
    [4,1,null,null,2,null,3]
    Expected:
    [4,1,null,null,3,2]
     */
    @Test
    public void testbuildTreePostError2() throws Exception {
        int[] in = {1, 2, 3, 4};
        int[] post = {2, 3, 1, 4};
        TreeNode node = treeBuilder.buildTreeByPostOrderAndInOrder(in, post);
        assert node != null;
        assert node.val == 4;
        assert node.left != null;
        assert node.left.val == 1;
        assert node.right == null;
        assert node.left.left == null;
        assert node.left.right != null;
        assert node.left.right.val == 3;
        assert node.left.right.left != null;
        assert node.left.right.left.val == 2;
        assert node.left.right.left.left == null;
        assert node.left.right.left.right == null;
        assert node.left.right.right == null;
    }

    @Test
    public void testSortedArrayToBSTNull() throws Exception {
        TreeNode node = treeBuilder.sortedArrayToBST(null);
        assert node == null;
    }

    @Test
    public void testSortedArrayToBSTEmpty() throws Exception {
        int[] ints = {};
        TreeNode node = treeBuilder.sortedArrayToBST(ints);
        assert node == null;
    }

    @Test
    public void testSortedArrayToBST1elem() throws Exception {
        int[] ints = {1};
        TreeNode node = treeBuilder.sortedArrayToBST(ints);
        assert node != null;
        assert node.val == 1;
        assert node.left == null;
        assert node.right == null;
    }

    @Test
    public void testSortedArrayToBST2elem() throws Exception {
        int[] ints = {1, 2};
        TreeNode node = treeBuilder.sortedArrayToBST(ints);
        assert node != null;
        assert node.val == 2;
        assert node.left != null;
        assert node.left.val == 1;
        assert node.left.left == null;
        assert node.left.right == null;
        assert node.right == null;
    }

    @Test
    public void testSortedArrayToBST3elem() throws Exception {
        int[] ints = {1, 2, 3};
        TreeNode node = treeBuilder.sortedArrayToBST(ints);
        assert node != null;
        assert node.val == 2;
        assert node.left != null;
        assert node.left.val == 1;
        assert node.left.left == null;
        assert node.left.right == null;
        assert node.right != null;
        assert node.right.val == 3;
        assert node.right.left == null;
        assert node.right.right == null;
    }

    @Test
    public void testSortedArrayToBST4elem() throws Exception {
        int[] ints = {1, 2, 3, 4};
        TreeNode node = treeBuilder.sortedArrayToBST(ints);
        assert node != null;
        assert node.val == 3;
        assert node.left != null;
        assert node.left.val == 2;
        assert node.left.left != null;
        assert node.left.left.val == 1;
        assert node.left.left.left == null;
        assert node.left.left.right == null;
        assert node.left.right == null;
        assert node.right != null;
        assert node.right.val == 4;
        assert node.right.left == null;
        assert node.right.right == null;
    }
}
