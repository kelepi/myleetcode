import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/26
 * Time: 10:57
 */
public class TestIntegertoRoman {
    IntegertoRoman itor = new IntegertoRoman();

    @Test
    public void testSample() throws Exception {
        for (int i = 0; i < 30; i++) {
            System.out.println(i + ", " + itor.intToRoman(i));
        }
        for (int i = 30; i < 100; i += 10) {
            System.out.println(i + ", " + itor.intToRoman(i));
        }
        for (int i = 100; i < 3000; i += 100) {
            System.out.println(i - 10 + ", " + itor.intToRoman(i - 10));
            System.out.println(i + ", " + itor.intToRoman(i));
            System.out.println(i + 10 + ", " + itor.intToRoman(i + 10));
        }
//        for (int i = 1237; i != 1337; i += 6) {
//            System.out.println(i + ", " + itor.intToRoman(i));
//        }
    }

    @Test
    public void testError() throws Exception {
        System.out.println(itor.intToRoman(10));
    }
}
