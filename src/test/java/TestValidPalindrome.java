import leetcode.ValidPalindrome;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/14.
 */
public class TestValidPalindrome {
    @Test
    public void testSample() throws Exception {
        ValidPalindrome vp = new ValidPalindrome();
        assert !vp.isPalindrome(null);
        assert vp.isPalindrome("");
        assert vp.isPalindrome("A man, a plan, a canal: Panama");
        assert !vp.isPalindrome("race a car");
        assert !vp.isPalindrome("1a2");
        assert vp.isPalindrome("1aa1");
    }
}
