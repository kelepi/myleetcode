import leetcode.FindAllOnesInMatrix;
import org.junit.Test;
import utils.Utils;

/**
 * Created by Patrick on 15/5/2.
 */
public class TestAllOnesInMatrix {
    FindAllOnesInMatrix m = new FindAllOnesInMatrix();

    @Test
    public void testSample() throws Exception {
        String[] strs = {
                "000000",
                "011000",
                "001010",
                "001010",
                "001110",
                "000000",
        };
        char[][] matrix = Utils.stringMatrixToCharMatrix(strs);
        int max = m.allOnes(matrix);
        assert max == 9;
    }

    @Test
    public void testSample2() throws Exception {
        String[] strs = {
                "000011",
                "111100",
                "001010",
                "001010",
                "101110",
                "100000",
        };
        char[][] matrix = Utils.stringMatrixToCharMatrix(strs);
        int max = m.allOnes(matrix);
        assert max == 13;
    }

    @Test
    public void testSample10() throws Exception {
        String[] strs = {
                "0"
        };
        char[][] matrix = Utils.stringMatrixToCharMatrix(strs);
        int max = m.allOnes(matrix);
        assert max == 0;
    }

    @Test
    public void testSample20() throws Exception {
        String[] strs = {
                "00",
                "00"
        };
        char[][] matrix = Utils.stringMatrixToCharMatrix(strs);
        int max = m.allOnes(matrix);
        assert max == 0;
    }

    @Test
    public void testSample21() throws Exception {
        String[] strs = {
                "00",
                "01"
        };
        char[][] matrix = Utils.stringMatrixToCharMatrix(strs);
        int max = m.allOnes(matrix);
        assert max == 1;
    }

    @Test
    public void testSample22() throws Exception {
        String[] strs = {
                "10",
                "01"
        };
        char[][] matrix = Utils.stringMatrixToCharMatrix(strs);
        int max = m.allOnes(matrix);
        assert max == 2;
    }

    @Test
    public void testSample23() throws Exception {
        String[] strs = {
                "11",
                "01"
        };
        char[][] matrix = Utils.stringMatrixToCharMatrix(strs);
        int max = m.allOnes(matrix);
        assert max == 3;
    }

    @Test
    public void testSample30() throws Exception {
        String[] strs = {
                "1101",
                "1101",
                "1111"
        };
        char[][] matrix = Utils.stringMatrixToCharMatrix(strs);
        int max = m.allOnes(matrix);
        assert max == 0;
    }
}
