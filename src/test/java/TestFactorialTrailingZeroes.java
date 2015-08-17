import leetcode.FactorialTrailingZeroes;
import org.junit.Test;
import com.google.common.math.BigIntegerMath;

/**
 * Created by Patrick on 15/4/11.
 */
public class TestFactorialTrailingZeroes {
    @Test
    public void testSample() throws Exception {
        FactorialTrailingZeroes f = new FactorialTrailingZeroes();
        for (int i = 0; i != 100; i++) {
            System.out.println("[" + i + "] " + BigIntegerMath.factorial(i) + " = " + f.trailingZeroes(i));
        }
    }
}
