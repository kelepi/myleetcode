package leetcode;

/**
 * Created by Patrick on 15/4/14.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String shortest = strs[0];
        for (String str : strs) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }

        for (int i = shortest.length(); i != 0; i--) {
            String candidate = shortest.substring(0, i);
            boolean ok = true;
            for (String str : strs) {
                if (!str.startsWith(candidate)) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return candidate;
            }
        }
        return "";
    }
}
