import leetcode.LongestPalindromicSubstring;
import org.junit.Test;

/**
 * Created by Patrick on 15/5/25.
 */
public class TestLongestPalindromicSubstring {
    LongestPalindromicSubstring l = new LongestPalindromicSubstring();

    @Test
    public void testSample() throws Exception {
        System.out.println(l.longestPalindrome("a"));
        System.out.println(l.longestPalindrome("aa"));
        System.out.println(l.longestPalindrome("aaa"));
        System.out.println(l.longestPalindrome("aaaa"));
        System.out.println(l.longestPalindrome("aaaaa"));
    }

    @Test
    public void testSampleA() throws Exception {
        System.out.println(l.longestPalindrome("aba"));
        System.out.println(l.longestPalindrome("caba"));
        System.out.println(l.longestPalindrome("abac"));
        System.out.println(l.longestPalindrome("cxaba"));
        System.out.println(l.longestPalindrome("abaxc"));
    }

    @Test
    public void testSampleAC() throws Exception {
        System.out.println(l.longestPalindrome("abazxcvbvcxz"));
        System.out.println(l.longestPalindrome("cabazxcvbvcxz"));
        System.out.println(l.longestPalindrome("abazxcvbvcxzc"));
        System.out.println(l.longestPalindrome("cxabazxcvbvcxz"));
        System.out.println(l.longestPalindrome("abazxcvbvcxzxc"));
    }

    @Test
    public void testSampleB() throws Exception {
        System.out.println(l.longestPalindrome("abba"));
        System.out.println(l.longestPalindrome("cabba"));
        System.out.println(l.longestPalindrome("abbac"));
        System.out.println(l.longestPalindrome("cxabba"));
        System.out.println(l.longestPalindrome("abbaxc"));
    }

    @Test
    public void testSampleBC() throws Exception {
        System.out.println(l.longestPalindrome("abbazxcvbbvcxz"));
        System.out.println(l.longestPalindrome("cabbazxcvbbvcxz"));
        System.out.println(l.longestPalindrome("abbazxcvbbvcxzc"));
        System.out.println(l.longestPalindrome("cxabbazxcvbbvcxz"));
        System.out.println(l.longestPalindrome("abbazxcvbbvcxzxc"));
    }

    @Test
    public void testError() throws Exception {
        System.out.println(l.longestPalindrome("aaa"));
    }
}
