package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Patrick on 15/4/6.
 */
public class WordLadder {
    public int ladderLength(String start, String end, Set<String> dict) {
        int step = 0;

        Set<String> visited = new HashSet<String>();
        Set<String> neighbours = new HashSet<String>();
        neighbours.add(start);

        while (!neighbours.isEmpty()) {
            step++;
            if (neighbours.contains(end)) {
                return step;
            }
            for (String neighbour : neighbours) {
                if (canTransformTO(neighbour, end)) {
                    return step + 1;
                }
            }
            neighbours = neighbours(neighbours, dict, visited);
        }
        return 0;
    }

    public Set<String> neighbours(Set<String> strs, Set<String> dict, Set<String> visited) {
        Set<String> neighbours = new HashSet<String>();
        for (String word : dict) {
            if (!visited.contains(word) && !neighbours.contains(word)) {
                for (String str : strs) {
                    if (canTransformTO(str, word)) {
                        neighbours.add(word);
                        visited.add(word);
                    }
                }
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
