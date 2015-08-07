import org.junit.Test;
import utils.Utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/21
 * Time: 14:41
 */
public class TestWordSearchII {
    WordSearchII w = new WordSearchII();


    @Test
    public void testSample() throws Exception {
        String[] strs = {
                "oaan",
                "etae",
                "ihkr",
                "iflv"
        };
        char[][] chars = Utils.stringMatrixToCharMatrix(strs);
        String[] words = {"oath","pea","eat","rain"};
        List<String> list = w.findWords(chars, words);
        Utils.printStringList(list);
    }

    /*
    Input:	["aa"], ["a"]
    Output:	["a","a"]
    Expected:	["a"]
     */
    @Test
    public void testError() throws Exception {
        String[] strs = {
                "aa"
        };
        char[][] chars = Utils.stringMatrixToCharMatrix(strs);
        String[] words = {"a"};
        List<String> list = w.findWords(chars, words);
        Utils.printStringList(list);
    }
}
