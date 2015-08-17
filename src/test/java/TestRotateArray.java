import leetcode.RotateArray;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/7.
 */
public class TestRotateArray {
    @Test
    public void testSample() throws Exception {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] re = {5, 6, 7, 1, 2, 3, 4};
        int k = 3;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
        assert arrEqual(nums, re);
    }

    @Test
    public void test01() throws Exception {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] re = {1, 2, 3, 4, 5, 6, 7};
        int k = 7;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
        assert arrEqual(nums, re);
    }

    @Test
    public void test02() throws Exception {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] re = {1, 2, 3, 4, 5, 6, 7};
        int k = 0;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
        assert arrEqual(nums, re);
    }

    @Test
    public void test03() throws Exception {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] re = {6, 7, 1, 2, 3, 4, 5};
        int k = 2;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
        assert arrEqual(nums, re);
    }

    @Test
    public void test04() throws Exception {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] re = {6, 7, 1, 2, 3, 4, 5};
        int k = 9;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
        assert arrEqual(nums, re);
    }

    private boolean arrEqual(int[] a, int[] b) {
        for (int i = 0; i != a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    private void printArr(int[] arr) {
        if (arr != null) {
            System.out.print("{");
            for (int i = 0; i != arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println("}");
        }
    }
}
