package leetcode;

import java.util.*;

/**
 * Created by Patrick on 15/4/6.
 * @TODO
 */
public class WordLadderII {
    public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        List<List<String>> result = new LinkedList<List<String>>();
        List<String> lineage = new LinkedList<String>();
        Set<String> visited = new HashSet<String>();
        Set<String> neighbours = neighbours(start, dict, visited);
        Map<String, Set<List<String>>> note = new HashMap<String, Set<List<String>>>();

        recursive(note, result, lineage, start, end, neighbours, dict, visited);
        return result;
    }

    private boolean recursive(Map<String, Set<List<String>>> note, List<List<String>> result, List<String> lineage, String cur, String end, Set<String> neighbours, Set<String> dict, Set<String> visited) {
        List<String> re = new LinkedList<String>();
        re.addAll(lineage);
        re.add(cur);
        if (cur.equals(end)) {
            result.add(re);
            if (!note.containsKey(cur)) {
                Set<List<String>> set = new HashSet<List<String>>();
                List<String> list = new LinkedList<String>();
                list.add(cur);
                set.add(list);
                note.put(cur, set);
            }
            return true;
        }
        if (canTransformTO(cur, end)) {
            re.add(end);
            result.add(re);
            if (!note.containsKey(cur)) {
                Set<List<String>> set = new HashSet<List<String>>();
                List<String> list = new LinkedList<String>();
                list.add(cur);
                list.add(end);
                set.add(list);
                note.put(cur, set);
            }
            return true;
        }
        boolean wholeStatus = false;
        for (String curNeighbour : neighbours) {
            if (note.containsKey(curNeighbour)) {
                for (List<String> tail : note.get(curNeighbour)) {
                    List<String> temp = new LinkedList<String>();
                    temp.addAll(re);
                    temp.addAll(tail);
                    result.add(temp);
                }
                continue;
            }
            Set<String> nextNeighbours = neighbours(curNeighbour, dict, visited);
            boolean status = recursive(note, result, re, curNeighbour, end, nextNeighbours, dict, visited);
            if (status) {
                wholeStatus = true;
                Set<List<String>> set = new HashSet<List<String>>();
                for (String nextNeighbour: nextNeighbours) {
                    if (note.containsKey(nextNeighbour)) {
                        for (List<String> tail: note.get(nextNeighbour)) {
                            List<String> list = new LinkedList<String>();
                            list.add(curNeighbour);
                            list.addAll(tail);
                            set.add(list);
                        }
                    }
                }
                if (!note.containsKey(curNeighbour)) {
                    note.put(curNeighbour, set);
                } else {
                    note.get(curNeighbour).addAll(set);
                }
            }
            visited.removeAll(nextNeighbours);
        }
        return wholeStatus;
    }

    public Set<String> neighbours(String str, Set<String> dict, Set<String> visited) {
        Set<String> neighbours = new HashSet<String>();
        for (String word : dict) {
            if (!visited.contains(word) && !neighbours.contains(word) && canTransformTO(str, word)) {
                neighbours.add(word);
                visited.add(word);
            }
        }
        return neighbours;
    }

    public boolean canTransformTO(String a, String b) {
        int cnt = 0;
        for (int i = 0; i != a.length(); i++) {
            if (b.charAt(i) != a.charAt(i)) {
                cnt++;
            }
        }
        return cnt == 1;
    }
}
