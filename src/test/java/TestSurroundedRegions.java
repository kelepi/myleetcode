import leetcode.SurroundedRegions;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/5.
 */
public class TestSurroundedRegions {
    boolean matrixEqual(char[][] a, char[][] b) {
        for (int i = 0; i != a.length; i++) {
            for (int j = 0; j != a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    char[][] convert(String[] strs) {
        int row = strs.length;
        int col = strs[0].length();
        char[][] chars = new char[row][col];
        for (int i = 0; i != strs.length; i++) {
            String str = strs[0];
            for (int j = 0; j != strs[i].length(); j++) {
                chars[i][j] = str.charAt(j);
            }
        }
        return chars;
    }

    void printMatrix(char[][] chars) {
        System.out.println("{");
        for (int i = 0; i != chars.length; i++) {
            System.out.print("{");
            for (int j = 0; j != chars[i].length; j++) {
                if (j != chars[i].length - 1) {
                    System.out.print("'" + chars[i][j] + "',");
                } else {
                    System.out.print("'" + chars[i][j] + "'");
                }
            }
            System.out.println("},");
        }
        System.out.println("}");
    }

    @Test
    public void testSample() throws Exception {
        char board[][] = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        char result[][] = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        assert (matrixEqual(board, result));
    }

    @Test
    public void testSample11a() throws Exception {
        char board[][] = {
                {'X'},
        };
        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        char result[][] = {
                {'X'},
        };
        assert (matrixEqual(board, result));
    }


    @Test
    public void testSample11b() throws Exception {
        char board[][] = {
                {'O'},
        };
        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        char result[][] = {
                {'O'},
        };
        assert (matrixEqual(board, result));
    }

    @Test
    public void testSample12() throws Exception {
        char board[][] = {
                {'O', 'X'},
        };
        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        char result[][] = {
                {'O', 'X'},
        };
        assert (matrixEqual(board, result));
    }

    @Test
    public void testSample21() throws Exception {
        char board[][] = {
                {'X'},
                {'O'},
        };
        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        char result[][] = {
                {'X'},
                {'O'},
        };
        assert (matrixEqual(board, result));
    }

    @Test
    public void testSample41() throws Exception {
        char board[][] = {
                {'X'},
                {'O'},
                {'X'},
                {'O'},
        };
        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        char result[][] = {
                {'X'},
                {'O'},
                {'X'},
                {'O'},
        };
        assert (matrixEqual(board, result));
    }

    @Test
    public void testSample33() throws Exception {
        char board[][] = {
                {'X', 'X', 'X'},
                {'X', 'O', 'X'},
                {'X', 'X', 'X'},
        };
        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        char result[][] = {
                {'X', 'X', 'X'},
                {'X', 'X', 'X'},
                {'X', 'X', 'X'},
        };
        assert (matrixEqual(board, result));
    }

    @Test
    public void testSample55() throws Exception {
        char board[][] = {
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'O', 'O'},
                {'X', 'O', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
        };
        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        char result[][] = {
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'O', 'O'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
        };
        assert (matrixEqual(board, result));
    }

    @Test
    public void testSample55b() throws Exception {
        char board[][] = {
                {'X', 'X', 'X', 'X', 'O'},
                {'X', 'O', 'X', 'X', 'O'},
                {'X', 'O', 'O', 'X', 'X'},
                {'X', 'O', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
        };
        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        char result[][] = {
                {'X', 'X', 'X', 'X', 'O'},
                {'X', 'X', 'X', 'X', 'O'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
        };
        assert (matrixEqual(board, result));
    }

    @Test
    public void testSample55c() throws Exception {
        char board[][] = {
                {'X', 'X', 'X', 'X', 'O'},
                {'X', 'O', 'X', 'O', 'O'},
                {'X', 'O', 'X', 'O', 'X'},
                {'X', 'O', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
        };
        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        char result[][] = {
                {'X', 'X', 'X', 'X', 'O'},
                {'X', 'O', 'X', 'O', 'O'},
                {'X', 'O', 'X', 'O', 'X'},
                {'X', 'O', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
        };
        assert (matrixEqual(board, result));
    }

    @Test
    public void testError() throws Exception {
        char board[][] = {
                {'X','O','X','O','X','O'},
                {'O','X','O','X','O','X'},
                {'X','O','X','O','X','O'},
                {'O','X','O','X','O','X'}
        };
        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        char result[][] = {
                {'X','O','X','O','X','O'},
                {'O','X','X','X','X','X'},
                {'X','X','X','X','X','O'},
                {'O','X','O','X','O','X'}
        };
        assert (matrixEqual(board, result));
    }


    @Test
    public void testError2() throws Exception {
        String[] strs = {"XOOOOOOOOOOOOOOOOOOO","OXOOOOXOOOOOOOOOOOXX","OOOOOOOOXOOOOOOOOOOX","OOXOOOOOOOOOOOOOOOXO","OOOOOXOOOOXOOOOOXOOX","XOOOXOOOOOXOXOXOXOXO","OOOOXOOXOOOOOXOOXOOO","XOOOXXXOXOOOOXXOXOOO","OOOOOXXXXOOOOXOOXOOO","XOOOOXOOOOOOXXOOXOOX","OOOOOOOOOOXOOXOOOXOX","OOOOXOXOOXXOOOOOXOOO","XXOOOOOXOOOOOOOOOOOO","OXOXOOOXOXOOOXOXOXOO","OOXOOOOOOOXOOOOOXOXO","XXOOOOOOOOXOXXOOOXOO","OOXOOOOOOOXOOXOXOXOO","OOOXOOOOOXXXOOXOOOXO","OOOOOOOOOOOOOOOOOOOO","XOOOOXOOOXXOOXOXOXOO"};
        char board[][] = convert(strs);

        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        char result[][] = {
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
                {'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},
        };
        assert (matrixEqual(board, result));
    }


    @Test
    public void testError3() throws Exception {
        char board[][] = {
        };
        SurroundedRegions sr = new SurroundedRegions();
        sr.solve(board);
        char result[][] = {
        };
        assert (matrixEqual(board, result));
    }
}
