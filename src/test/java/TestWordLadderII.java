import leetcode.WordLadderII;
import org.junit.Test;
import utils.Utils;

import java.util.List;
import java.util.Set;

/**
 * Created by Patrick on 15/4/6.
 */
public class TestWordLadderII {
    @Test
    public void testSample() throws Exception {
        String start = "hit";
        String end = "cog";
        String[] words = {"hot","dot","dog","lot","log"};
        Set<String> dict = Utils.stringArrayToSet(words);

        WordLadderII wordLadderII = new WordLadderII();
        List<List<String>> result = wordLadderII.findLadders(start, end, dict);

        Utils.printListListString(result);
    }

    @Test
    public void testEasy() throws Exception {
        String start = "hit";
        String end = "hit";
        String[] words = {"hot","dot","dog","lot","log"};
        Set<String> dict = Utils.stringArrayToSet(words);

        WordLadderII wordLadderII = new WordLadderII();
        List<List<String>> result = wordLadderII.findLadders(start, end, dict);

        Utils.printListListString(result);
    }

    @Test
    public void testEasy2() throws Exception {
        String start = "hit";
        String end = "hot";
        String[] words = {"hot","dot","dog","lot","log"};
        Set<String> dict = Utils.stringArrayToSet(words);

        WordLadderII wordLadderII = new WordLadderII();
        List<List<String>> result = wordLadderII.findLadders(start, end, dict);

        Utils.printListListString(result);
    }

    @Test
    public void testEasy3() throws Exception {
        String start = "hit";
        String end = "hoz";
        String[] words = {"hot","dot","dog","lot","log", "hiz"};
        Set<String> dict = Utils.stringArrayToSet(words);

        WordLadderII wordLadderII = new WordLadderII();
        List<List<String>> result = wordLadderII.findLadders(start, end, dict);

        Utils.printListListString(result);
    }

    @Test
    public void testEasy4() throws Exception {
        String start = "hit";
        String end = "log";
        String[] words = {"hot","dot","dog","lot","log", "hiz"};
        Set<String> dict = Utils.stringArrayToSet(words);

        WordLadderII wordLadderII = new WordLadderII();
        List<List<String>> result = wordLadderII.findLadders(start, end, dict);

        Utils.printListListString(result);
    }

    @Test
    public void testEasy5() throws Exception {
        String start = "hit";
        String end = "abc";
        String[] words = {"hot","dot","dog","lot","log", "hiz"};
        Set<String> dict = Utils.stringArrayToSet(words);

        WordLadderII wordLadderII = new WordLadderII();
        List<List<String>> result = wordLadderII.findLadders(start, end, dict);

        Utils.printListListString(result);
    }

    @Test
    public void testEasy6() throws Exception {
        String start = "hit";
        String end = "abc";
        String[] words = {};
        Set<String> dict = Utils.stringArrayToSet(words);

        WordLadderII wordLadderII = new WordLadderII();
        List<List<String>> result = wordLadderII.findLadders(start, end, dict);

        Utils.printListListString(result);
    }

    @Test
    public void testEasy7() throws Exception {
        String start = "hit";
        String end = "hit";
        String[] words = {};
        Set<String> dict = Utils.stringArrayToSet(words);

        WordLadderII wordLadderII = new WordLadderII();
        List<List<String>> result = wordLadderII.findLadders(start, end, dict);

        Utils.printListListString(result);
    }

    @Test
    public void testEasy8() throws Exception {
        String start = "";
        String end = "";
        String[] words = {};
        Set<String> dict = Utils.stringArrayToSet(words);

        WordLadderII wordLadderII = new WordLadderII();
        List<List<String>> result = wordLadderII.findLadders(start, end, dict);

        Utils.printListListString(result);
    }

    // Time
    @Test
    public void testError1() throws Exception {
        String start = "qa";
        String end = "sq";
        String[] words = {"si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"};
        Set<String> dict = Utils.stringArrayToSet(words);

        WordLadderII wordLadderII = new WordLadderII();
        List<List<String>> result = wordLadderII.findLadders(start, end, dict);

        Utils.printListListString(result);
    }
}
