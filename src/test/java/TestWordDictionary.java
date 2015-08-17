import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/19
 * Time: 10:23
 */
public class TestWordDictionary {
    WordDictionary wd = new WordDictionary();

    @Test
    public void testSample() throws Exception {
        wd.addWord("bad");
        wd.addWord("dad");
        wd.addWord("mad");
        assert !wd.search("pad");
        assert wd.search("bad");
        assert wd.search(".ad");
        assert wd.search("b..");
    }

    /*
Input:	addWord("a"),addWord("a"),search("."),search("a"),search("aa"),search("a"),search(".a"),search("a.")
Output:	[true,true,false,true,false,true]
Expected:	[true,true,false,true,false,false]
     */
    @Test
    public void testError() throws Exception {
        wd.addWord("a");
        wd.addWord("a");
        assert wd.search(".");
        assert wd.search("a");
        assert !wd.search("aa");
        assert wd.search("a");
        assert !wd.search(".a");
        assert !wd.search("a.");
    }

    /*

Input:	addWord("at"),addWord("and"),addWord("an"),addWord("add"),search("a"),search(".at"),addWord("bat"),search(".at"),search("an."),search("a.d."),search("b."),search("a.d"),search(".")
Output:	[false,false,true,true,false,true,true,true]
Expected:	[false,false,true,true,false,false,true,false]
     */

    @Test
    public void testError2() throws Exception {
        wd.addWord("at");
        wd.addWord("and");
        wd.addWord("an");
        wd.addWord("add");
        assert !wd.search("a");
        assert !wd.search(".at");
        wd.addWord("bat");
        assert wd.search(".at");
        assert wd.search("an.");
        assert !wd.search("a.d.");
        assert !wd.search("b.");
        assert wd.search("a.d");
        assert !wd.search(".");
    }
}
