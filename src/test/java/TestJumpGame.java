import com.google.common.io.Files;
import org.junit.Test;

import java.io.File;
import java.nio.charset.Charset;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/12
 * Time: 10:04
 */
public class TestJumpGame {
    JumpGame j = new JumpGame();

    @Test
    public void testError0() throws Exception {
        int[] ints = {0};
        assert j.canJump(ints);
    }

    @Test
    public void testError1() throws Exception {
        int[] ints = {1};
        assert j.canJump(ints);
    }

    @Test
    public void testError2() throws Exception {
        int[] ints = {2};
        assert j.canJump(ints);
    }

    @Test
    public void testError3() throws Exception {
        int[] ints = {2, 1, 0};
        assert j.canJump(ints);
    }

    @Test
    public void testSample() throws Exception {
        int[] ints = {2, 3, 1, 1, 4};
        assert j.canJump(ints);
    }

    @Test
    public void testSample2() throws Exception {
        int[] ints = {3, 2, 1, 0, 4};
        assert !j.canJump(ints);
    }

    @Test
    public void testTLE() throws Exception {
        File file = new File("D:\\Users\\yf_liu\\Dev\\github\\myleetcode\\src\\test\\resources\\TestJumpGame.txt");
        String[] strs = Files.readLines(file, Charset.defaultCharset()).get(0).split(",");
        int[] ints = new int[strs.length];
        for (int i = 0; i != strs.length; i++) {
            ints[i] = Integer.parseInt(strs[i]);
        }
        assert j.canJump(ints);
    }
}
