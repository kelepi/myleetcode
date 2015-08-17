import com.google.common.base.Charsets;
import com.google.common.io.Files;
import leetcode.Trie;
import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * Created by Patrick on 15/5/9.
 */
public class TestTrie {
    Trie trie = new Trie();

    @Test
    public void testSubString() throws Exception {
        String str = "good";
        assert str.substring(1).equals("ood");
    }

    @Test
    public void testTrieSample() throws Exception {
        assert !trie.search("good");
        assert !trie.startsWith("goo");
        trie.insert("good");
        trie.insert("god");
        trie.insert("talk");
        assert trie.search("good");
        assert trie.search("god");
        assert trie.search("talk");
        assert !trie.search("tal");
        assert trie.startsWith("goo");
        assert trie.startsWith("go");
        assert trie.startsWith("g");
        assert trie.startsWith("");
        assert trie.startsWith("god");
        assert trie.startsWith("talk");
        assert trie.startsWith("tal");
        assert trie.startsWith("ta");
        assert trie.startsWith("t");
        assert trie.startsWith("");
    }

    @Test
    public void testError() throws Exception {
        trie.insert("abc");
        assert trie.search("abc");
        assert !trie.search("ab");
        trie.insert("ab");
        assert trie.search("ab");
        trie.insert("ab");
        assert trie.search("ab");
    }

    @Test
    public void testError02() throws Exception {
        trie.insert("testor");
        trie.insert("testor");
        trie.insert("terceron");
        trie.insert("terceron");
        trie.insert("tealess");
        trie.insert("tealess");
        trie.insert("teledendron");
        trie.insert("teledendron");
        trie.insert("temalacatl");
        trie.insert("temalacatl");
        trie.insert("tetradactylous");
        trie.insert("tetradactylous");
        trie.insert("tetramera");
        trie.insert("tenderheart");
        trie.insert("tetramera");
        trie.insert("tenderheart");
        trie.insert("testacean");
        trie.insert("testamental");
        trie.insert("testacean");
        trie.insert("testamental");
        trie.insert("tetragonalness");
        trie.insert("teca");
        trie.insert("tetragonalness");
        trie.insert("teca");
        trie.insert("teasiness");
        trie.insert("temporarily");
        trie.insert("teasiness");
        trie.insert("temporarily");
        trie.insert("tenderfootish");
        trie.insert("tenderfootish");
        trie.insert("terry");
        trie.insert("tecon");
        trie.insert("terry");
        trie.insert("tecon");
        trie.insert("temporohyoid");
        trie.insert("temporohyoid");
        trie.insert("testudinidae");
        trie.insert("terpsichoreal");
        trie.insert("testudinidae");
        trie.insert("terpsichoreal");
        trie.insert("teamer");
        trie.insert("teamer");
        trie.insert("temporaneous");
        trie.insert("temporaneous");
        trie.insert("testicle");
        trie.insert("testicle");
        trie.insert("terpane");
        trie.insert("terpane");
        trie.insert("tetraiodide");
        trie.insert("tetraiodide");
        trie.insert("tenurially");
        trie.insert("tenurially");
        trie.insert("tetremimeral");
        trie.insert("tetremimeral");
        trie.insert("terebral");
        trie.insert("terebral");
        trie.insert("terebinthinate");
        trie.insert("tea");
        trie.insert("terebinthinate");
        trie.insert("tea");
        trie.insert("tetradrachma");
        trie.insert("tetradrachma");
        trie.insert("technologic");
        trie.insert("technologic");
        trie.insert("teletactor");
        trie.insert("teletactor");
        trie.insert("teleostomian");
        trie.insert("teleostomian");
        trie.insert("teasiness");
        trie.insert("teasiness");
        trie.insert("teloteropathic");
        trie.insert("tesserants");
        trie.insert("teloteropathic");
        assert !trie.search("ten");
        trie.insert("ten");
        assert trie.search("ten");
        trie.insert("teleiosis");
        trie.insert("tesserants");
        assert trie.search("ten");
        trie.insert("ten");
        assert trie.search("ten");
        trie.insert("teleiosis");
        trie.insert("terebratular");
        trie.insert("telepathically");
        trie.insert("terebratular");
        trie.insert("telepathically");
        trie.insert("tetrapteron");
        trie.insert("teleologist");
        trie.insert("teetotalism");
        trie.insert("tetrapteron");
        trie.insert("teleologist");
        trie.insert("teetotalism");
        trie.insert("tetragonus");
        trie.insert("tetragonus");
        trie.insert("tempe");
        trie.insert("tempe");
        trie.insert("tensility");
        trie.insert("tetraonine");
        trie.insert("tensility");
        trie.insert("tetroxalate");
        trie.insert("tetraonine");
        trie.insert("tetroxalate");
        trie.insert("telautomatic");
        trie.insert("telautomatic");
        trie.insert("teasable");
        trie.insert("teasable");
        trie.insert("tetrathionic");
        trie.insert("tetrathionic");
        trie.insert("ban");
    }
/*
forefin, false
ten, false
 */
    @Test
    public void testError03() throws Exception {
        File trieCases = new File("/Users/patrick/develop/leetcode/src/test/resources/case");
        File trieAsserts = new File("/Users/patrick/develop/leetcode/src/test/resources/assert");
        List<String> cases = Files.readLines(trieCases, Charsets.UTF_8);
        List<String> results = Files.readLines(trieAsserts, Charsets.UTF_8);
        int cnt = 0;
        for (String str: cases) {
            String word = str.substring(str.indexOf("\"") + 1, str.lastIndexOf("\""));
            if (str.startsWith("insert")) {
                trie.insert(word);
            } else {
                boolean result = Boolean.parseBoolean(results.get(cnt));
                assert result == trie.search(word);
                cnt++;
            }
        }
    }

    @Test
    public void testError04() throws Exception {
        File trieCases = new File("/Users/patrick/develop/leetcode/src/test/resources/case");
        File trieAsserts = new File("/Users/patrick/develop/leetcode/src/test/resources/assert");
        List<String> cases = Files.readLines(trieCases, Charsets.UTF_8);
        List<String> results = Files.readLines(trieAsserts, Charsets.UTF_8);
        for (String str: cases) {
            String word = str.substring(str.indexOf("\"") + 1, str.lastIndexOf("\""));
            if (str.startsWith("insert") && word.length() == 3 && word.charAt(2) == 'n') {
                System.out.println(word);
            }
            else if (str.startsWith("insert") && word.startsWith("ten")) {
                System.out.println(word);
            } else if (word.startsWith("te")) {
                System.out.println(word);
            }
        }
    }
}
