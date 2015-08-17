package leetcode;

/**
 * Created by Patrick on 15/5/25.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int len = 0, pos = 0, maxLen = 0;
        boolean dup = false, isdup = false;
        for (int i = 0; i != s.length(); i++) {
            int r = i;
            if (i + 1 < s.length() && s.charAt(i + 1) == s.charAt(i)) {
                dup = true;
                r = i + 1;
            } else {
                dup = false;
            }
            int j = 0;
            while (i - j >= 0 && r + j < s.length()) {
                if (s.charAt(i - j) != s.charAt(r + j)) {
                    j--;
                    int l = dup ? (j + 1) * 2 : j * 2 + 1;
                    if (l > maxLen) {
                        maxLen = l;
                        len = j;
                        pos = i;
                        isdup = dup;
                    }
                    break;
                } else {
                    int l = dup ? (j + 1) * 2 : j * 2 + 1;
                    if (l > maxLen) {
                        maxLen = l;
                        len = j;
                        pos = i;
                        isdup = dup;
                    }
                    j++;
                }
            }
            j = 0;
            r = i;
            while (i - j >= 0 && r + j < s.length()) {
                if (s.charAt(i - j) != s.charAt(r + j)) {
                    j--;
                    int l = j * 2 + 1;
                    if (l > maxLen) {
                        maxLen = l;
                        len = j;
                        pos = i;
                        isdup = false;
                    }
                    break;
                } else {
                    int l = j * 2 + 1;
                    if (l > maxLen) {
                        maxLen = l;
                        len = j;
                        pos = i;
                        isdup = false;
                    }
                    j++;
                }
            }
        }
        return isdup ? s.substring(pos - len, pos + len + 2) : s.substring(pos - len, pos + len + 1);
    }
}
