import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 10:37
 */
public class TestAddBinary {
    AddBinary ab = new AddBinary();

    @Test
    public void testSample() throws Exception {
        assert ab.addBinary("1", "1").equals("10");
        assert ab.addBinary("0", "1").equals("1");
        assert ab.addBinary("1", "0").equals("1");
        assert ab.addBinary("11", "0").equals("11");
        assert ab.addBinary("11", "1").equals("100");
        assert ab.addBinary("11", "10").equals("101");
        assert ab.addBinary("11", "11").equals("110");
        assert ab.addBinary("101", "11").equals("1000");
        assert ab.addBinary("11", "101").equals("1000");
    }

    @Test
    public void testSample2() throws Exception {
        assert ab.addBinary("11", "10").equals("101");
    }
}
