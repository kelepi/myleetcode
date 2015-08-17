import leetcode.RepeatedDNASequences;
import org.junit.Test;

import java.util.List;

/**
 * Created by Patrick on 15/4/21.
 */
public class TestRepeatedDNASequences {
    @Test
    public void testSample() throws Exception {
        String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        RepeatedDNASequences rds = new RepeatedDNASequences();
        List<String> strs = rds.findRepeatedDnaSequences(str);
        assert strs.size() == 2;
        assert strs.get(0).equals("AAAAACCCCC");
        assert strs.get(1).equals("CCCCCAAAAA");
    }
}
