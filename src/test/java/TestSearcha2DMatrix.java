import org.junit.Test;

import static object.IntsUtils.existElem;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/29
 * Time: 13:17
 */
public class TestSearcha2DMatrix {
    Searcha2DMatrix s = new Searcha2DMatrix();

    @Test
    public void testSearcha2DMatrix1() throws Exception {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {8, 9, 10},
                {13, 17, 19}
        };
        int[] exists = existElem(matrix);
        for (int i : exists) {
            System.out.println("Estimate num = " + i);
            assert s.searchMatrix(matrix, i);
        }
        int[] nonExists = {7, 11, 12, 14, 15, 16, 18, 20, 21};
        for (int i : nonExists) {
            System.out.println("Estimate num = " + i);
            assert !s.searchMatrix(matrix, i);
        }
    }

    @Test
    public void testSearcha2DMatrix11() throws Exception {
        int[][] matrix = {
                {1, 2, 3},
                {8, 9, 10},
                {13, 17, 19}
        };
        int[] exists = existElem(matrix);
        for (int i : exists) {
            System.out.println("Estimate num = " + i);
            assert s.searchMatrix(matrix, i);
        }
        int[] nonExists = {7, 11, 12, 14, 15, 16, 18, 20, 21};
        for (int i : nonExists) {
            System.out.println("Estimate num = " + i);
            assert !s.searchMatrix(matrix, i);
        }
    }

    @Test
    public void testSearcha2DMatrix12() throws Exception {
        int[][] matrix = {
                {1, 2, 3},
                {8, 9, 10}
        };
        int[] exists = existElem(matrix);
        for (int i : exists) {
            System.out.println("Estimate num = " + i);
            assert s.searchMatrix(matrix, i);
        }
        int[] nonExists = {7, 11, 12, 14, 15, 16, 18, 20, 21};
        for (int i : nonExists) {
            System.out.println("Estimate num = " + i);
            assert !s.searchMatrix(matrix, i);
        }
    }

    @Test
    public void testSearcha2DMatrix13() throws Exception {
        int[][] matrix = {
                {1, 2, 3}
        };
        int[] exists = existElem(matrix);
        for (int i : exists) {
            System.out.println("Estimate num = " + i);
            assert s.searchMatrix(matrix, i);
        }
        int[] nonExists = {7, 11, 12, 14, 15, 16, 18, 20, 21};
        for (int i : nonExists) {
            System.out.println("Estimate num = " + i);
            assert !s.searchMatrix(matrix, i);
        }
    }

    @Test
    public void testSearcha2DMatrix14() throws Exception {
        int[][] matrix = {
                {1, 2}
        };
        int[] exists = existElem(matrix);
        for (int i : exists) {
            System.out.println("Estimate num = " + i);
            assert s.searchMatrix(matrix, i);
        }
        int[] nonExists = {7, 11, 12, 14, 15, 16, 18, 20, 21};
        for (int i : nonExists) {
            System.out.println("Estimate num = " + i);
            assert !s.searchMatrix(matrix, i);
        }
    }

    @Test
    public void testSearcha2DMatrix15() throws Exception {
        int[][] matrix = {
                {1}, {2}, {3}, {4}, {5}, {6}, {7},  {9}, {10}, {11}, {12}, {13}, {14}, {15}, {16}, {17}, {18}, {19}
        };
        int[] exists = existElem(matrix);
        for (int i : exists) {
            System.out.println("Estimate num = " + i);
            assert s.searchMatrix(matrix, i);
        }
        int[] nonExists = {8, 20, 21};
        for (int i : nonExists) {
            System.out.println("Estimate num = " + i);
            assert !s.searchMatrix(matrix, i);
        }
    }

    @Test
    public void testSearcha2DMatrix20() throws Exception {
        int[][] matrix = {
                {1},
                {4},
                {8},
                {13}
        };
        int[] exists = existElem(matrix);
        for (int i : exists) {
            System.out.println("Estimate num = " + i);
            assert s.searchMatrix(matrix, i);
        }
        int[] nonExists = {7, 11, 12, 14, 15, 16, 18, 20, 21};
        for (int i : nonExists) {
            System.out.println("Estimate num = " + i);
            assert !s.searchMatrix(matrix, i);
        }
    }

    @Test
    public void testSearcha2DMatrix2() throws Exception {
        int[][] matrix = {
                {1},
                {4},
                {8},
                {13}
        };
        int[] exists = existElem(matrix);
        for (int i : exists) {
            System.out.println("Estimate num = " + i);
            assert s.searchMatrix(matrix, i);
        }
        int[] nonExists = {7, 11, 12, 14, 15, 16, 18, 20, 21};
        for (int i : nonExists) {
            System.out.println("Estimate num = " + i);
            assert !s.searchMatrix(matrix, i);
        }
    }

    @Test
    public void testSearcha2DMatrix3() throws Exception {
        int[][] matrix = {
                {1},
                {4},
                {8}
        };
        int[] exists = existElem(matrix);
        for (int i : exists) {
            System.out.println("Estimate num = " + i);
            assert s.searchMatrix(matrix, i);
        }
        int[] nonExists = {7, 11, 12, 14, 15, 16, 18, 20, 21};
        for (int i : nonExists) {
            System.out.println("Estimate num = " + i);
            assert !s.searchMatrix(matrix, i);
        }
    }

    @Test
    public void testSearcha2DMatrix4() throws Exception {
        int[][] matrix = {
                {1},
                {4}
        };
        int[] exists = existElem(matrix);
        for (int i : exists) {
            System.out.println("Estimate num = " + i);
            assert s.searchMatrix(matrix, i);
        }
        int[] nonExists = {7, 11, 12, 14, 15, 16, 18, 20, 21};
        for (int i : nonExists) {
            System.out.println("Estimate num = " + i);
            assert !s.searchMatrix(matrix, i);
        }
    }

    @Test
    public void testSearcha2DMatrix5() throws Exception {
        int[][] matrix = {
                {1}
        };
        int[] exists = existElem(matrix);
        for (int i : exists) {
            System.out.println("Estimate num = " + i);
            assert s.searchMatrix(matrix, i);
        }
        int[] nonExists = {7, 11, 12, 14, 15, 16, 18, 20, 21};
        for (int i : nonExists) {
            System.out.println("Estimate num = " + i);
            assert !s.searchMatrix(matrix, i);
        }
    }
}
