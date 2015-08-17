import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/19
 * Time: 10:47
 */
public class TestPermutationSequence {
    PermutationSequence p = new PermutationSequence();

    @Test
    public void testSample() throws Exception {
        assert p.getPermutation(3, 1).equals("123");
        assert p.getPermutation(3, 2).equals("132");
        assert p.getPermutation(3, 3).equals("213");
        assert p.getPermutation(3, 4).equals("231");
        assert p.getPermutation(3, 5).equals("312");
        assert p.getPermutation(3, 6).equals("321");
    }
}
