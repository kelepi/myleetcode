import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/23
 * Time: 19:42
 */
public class TestAnagrams {
    @Test
    public void testBasic() throws Exception {
        Anagrams anagrams = new Anagrams();
        assert anagrams.ordered("decab").equals("abcde");
        assert anagrams.ordered("s.12f45ad3").equals(".12345adfs");
    }

    @Test
    public void testSample() throws Exception {
        String[] strs = {"cat","rye","aye","dog", "god","cud","cat","old","fop","bra"};
        Anagrams anagrams = new Anagrams();
        List<String> re = anagrams.anagrams(strs);
        assert re.size() == 4;
    }
}
