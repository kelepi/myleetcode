import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 15:32
 */
public class TestIsomorphicStrings {
    IsomorphicStrings is = new IsomorphicStrings();

    @Test
    public void testSample() throws Exception {
          assert is.isIsomorphic("egg", "add");
          assert !is.isIsomorphic("foo", "bar");
          assert is.isIsomorphic("paper", "title");
    }
}
