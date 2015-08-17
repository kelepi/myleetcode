/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/21
 * Time: 19:01
 */
public class TestValidSudoku {
    @org.junit.Test
    public void testSample() throws Exception {
        ValidSudoku vs = new ValidSudoku();
        String[] list = {".87654321", "2........", "3........", "4........", "5........", "6........", "7........", "8........", "9........"};
        char[][] chars = listToBoard(list);
        assert vs.isValidSudoku(chars);
    }

    @org.junit.Test
    public void testSample2() throws Exception {
        ValidSudoku vs = new ValidSudoku();
        String[] list = {".87654321", "2........", "3.......3", "4........", "5........", "6........", "7........", "8........", "9........"};
        char[][] chars = listToBoard(list);
        assert !vs.isValidSudoku(chars);
    }

    @org.junit.Test
    public void testSample3() throws Exception {
        ValidSudoku vs = new ValidSudoku();
        String[] list = {".87654321", "2........", "3........", "3........", "5........", "6........", "7........", "8........", "9........"};
        char[][] chars = listToBoard(list);
        assert !vs.isValidSudoku(chars);
    }

    @org.junit.Test
    public void testSample4() throws Exception {
        ValidSudoku vs = new ValidSudoku();
        String[] list = {".87654321", "27.......", "3........", "4........", "5........", "6........", "7........", "8........", "9........"};
        char[][] chars = listToBoard(list);
        assert !vs.isValidSudoku(chars);
    }

    char[][] listToBoard(String[] strs) {
        char[][] chars = new char[9][9];
        for (int i = 0; i != 9; i++) {
            for (int j = 0; j != 9; j++) {
                chars[i][j] = strs[i].charAt(j);
            }
        }
        return chars;
    }
}
