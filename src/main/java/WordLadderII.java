import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/19
 * Time: 15:10
 */
/*
Given two words (start and end), and a dictionary, find all shortest transformation sequence(s) from start to end, such that:

Only one letter can be changed at a time
Each intermediate word must exist in the dictionary
For example,

Given:
start = "hit"
end = "cog"
dict = ["hot","dot","dog","lot","log"]
Return
  [
    ["hit","hot","dot","dog","cog"],
    ["hit","hot","lot","log","cog"]
  ]
Note:
All words have the same length.
All words contain only lowercase alphabetic characters.
 */
public class WordLadderII {
    public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        List<List<String>> results = new ArrayList<List<String>>();
        if (dict == null || dict.isEmpty()) {
            return results;
        }
        if (start.equals(end)) {
            List<String> l = new ArrayList<String>();
            l.add(start);
            results.add(l);
            return results;
        }

        Map<String, Set<String>> map = new HashMap<String, Set<String>>();
        Set<String> cur;
        Set<String> next = new HashSet<String>();

        next.add(start);
        dict.add(end);

        boolean find = false;
        StringBuilder sb = new StringBuilder();
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        while (!find && !dict.isEmpty() && !next.isEmpty()) {
            cur = next;
            next = new HashSet<String>();
            dict.removeAll(cur);

            for (String prev: cur) {
                for (int i = 0; i != prev.length(); i++) {
                    char c = prev.charAt(i);
                    for (int j = 0; j != 26; j++) {
                        if (chars[j] == c) {
                             continue;
                        }
                        sb.delete(0, sb.length());
                        sb.append(prev);
                        sb.setCharAt(i, chars[j]);
                        String tranfrom = sb.toString();
                        if (dict.contains(tranfrom)) {
                            next.add(tranfrom);
                            if (tranfrom.equals(end)) {
                                find = true;
                            }
                            if (map.containsKey(tranfrom)) {
                                map.get(tranfrom).add(prev);
                            } else {
                                Set<String> s = new HashSet<String>();
                                s.add(prev);
                                map.put(tranfrom, s);
                            }
                        }
                    }
                }
            }
        }
        if (find) {
            List<String> list = new ArrayList<String>();
            addLadders(start, end, map, list, results);
        }
        return results;
    }

    private void addLadders(String start, String cur, Map<String, Set<String>> map, List<String> list, List<List<String>> results) {
        for (String prev: map.get(cur)) {
            if (prev.equals(start)) {
                List<String> l = new ArrayList<String>();
                l.add(start);
                l.add(cur);
                l.addAll(list);
                if (results.isEmpty() || l.size() == results.get(0).size()) {
                    results.add(l);
                } else if (l.size() < results.get(0).size()) {
                    results.clear();
                    results.add(l);
                }
            } else {
                List<String> l = new ArrayList<String>();
                l.add(cur);
                l.addAll(list);
                addLadders(start, prev, map, l, results);
            }
        }
    }
}
