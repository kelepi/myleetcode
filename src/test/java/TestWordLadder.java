import leetcode.WordLadder;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Patrick on 15/4/6.
 */
public class TestWordLadder {
    @Test
    public void testSample() throws Exception {
        String start = "hit";
        String end = "cog";
        Set<String> dict = new HashSet<String>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");

        WordLadder wl = new WordLadder();
        int step = wl.ladderLength(start, end, dict);
        System.out.println(step);
        assert step == 5;
    }

    @Test
    public void testSimple1() throws Exception {
        String start = "hit";
        String end = "hit";
        Set<String> dict = new HashSet<String>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");

        WordLadder wl = new WordLadder();
        int step = wl.ladderLength(start, end, dict);
        System.out.println(step);
        assert step == 1;
    }

    @Test
    public void testSimple2() throws Exception {
        String start = "hit";
        String end = "hot";
        Set<String> dict = new HashSet<String>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");

        WordLadder wl = new WordLadder();
        int step = wl.ladderLength(start, end, dict);
        System.out.println(step);
        assert step == 2;
    }

    @Test
    public void testSimple3() throws Exception {
        String start = "hit";
        String end = "dot";
        Set<String> dict = new HashSet<String>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");

        WordLadder wl = new WordLadder();
        int step = wl.ladderLength(start, end, dict);
        System.out.println(step);
        assert step == 3;
    }

    @Test
    public void testSimple4() throws Exception {
        String start = "hit";
        String end = "dog";
        Set<String> dict = new HashSet<String>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");

        WordLadder wl = new WordLadder();
        int step = wl.ladderLength(start, end, dict);
        System.out.println(step);
        assert step == 4;
    }

    @Test
    public void testSimple0() throws Exception {
        String start = "hit";
        String end = "abc";
        Set<String> dict = new HashSet<String>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");

        WordLadder wl = new WordLadder();
        int step = wl.ladderLength(start, end, dict);
        System.out.println(step);
        assert step == 0;
    }

    // Time Limit Exceeded
    @Test
    public void testError1() throws Exception {
        String start = "nape";
        String end = "mild";
        String[] list = {"dose","ends","dine","jars","prow","soap","guns","hops","cray","hove","ella","hour","lens","jive","wiry","earl","mara","part","flue","putt","rory","bull","york","ruts","lily","vamp","bask","peer","boat","dens","lyre","jets","wide","rile","boos","down","path","onyx","mows","toke","soto","dork","nape","mans","loin","jots","male","sits","minn","sale","pets","hugo","woke","suds","rugs","vole","warp","mite","pews","lips","pals","nigh","sulk","vice","clod","iowa","gibe","shad","carl","huns","coot","sera","mils","rose","orly","ford","void","time","eloy","risk","veep","reps","dolt","hens","tray","melt","rung","rich","saga","lust","yews","rode","many","cods","rape","last","tile","nosy","take","nope","toni","bank","jock","jody","diss","nips","bake","lima","wore","kins","cult","hart","wuss","tale","sing","lake","bogy","wigs","kari","magi","bass","pent","tost","fops","bags","duns","will","tart","drug","gale","mold","disk","spay","hows","naps","puss","gina","kara","zorn","boll","cams","boas","rave","sets","lego","hays","judy","chap","live","bahs","ohio","nibs","cuts","pups","data","kate","rump","hews","mary","stow","fang","bolt","rues","mesh","mice","rise","rant","dune","jell","laws","jove","bode","sung","nils","vila","mode","hued","cell","fies","swat","wags","nate","wist","honk","goth","told","oise","wail","tels","sore","hunk","mate","luke","tore","bond","bast","vows","ripe","fond","benz","firs","zeds","wary","baas","wins","pair","tags","cost","woes","buns","lend","bops","code","eddy","siva","oops","toed","bale","hutu","jolt","rife","darn","tape","bold","cope","cake","wisp","vats","wave","hems","bill","cord","pert","type","kroc","ucla","albs","yoko","silt","pock","drub","puny","fads","mull","pray","mole","talc","east","slay","jamb","mill","dung","jack","lynx","nome","leos","lade","sana","tike","cali","toge","pled","mile","mass","leon","sloe","lube","kans","cory","burs","race","toss","mild","tops","maze","city","sadr","bays","poet","volt","laze","gold","zuni","shea","gags","fist","ping","pope","cora","yaks","cosy","foci","plan","colo","hume","yowl","craw","pied","toga","lobs","love","lode","duds","bled","juts","gabs","fink","rock","pant","wipe","pele","suez","nina","ring","okra","warm","lyle","gape","bead","lead","jane","oink","ware","zibo","inns","mope","hang","made","fobs","gamy","fort","peak","gill","dino","dina","tier"};
        Set<String> dict = stringArrayToSet(list);

        WordLadder wl = new WordLadder();
        wl.ladderLength(start, end, dict);
//        int step = wl.ladderLength(start, end, dict);
//        System.out.println(step);
//        assert step == 0;
    }

    private Set<String> stringArrayToSet(String[] str) {
        Set<String> set = new HashSet<String>();
        Collections.addAll(set, str);
        return set;
    }
}
