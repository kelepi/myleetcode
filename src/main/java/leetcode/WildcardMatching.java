package leetcode;

/**
 * Created by Patrick on 15/5/14.
 */
public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        int si = 0, pi = 0;
        int starPos = -1, matchPos = -1;
        while (si < s.length()) {
            if (pi < p.length()) {
                char sc = s.charAt(si), pc = p.charAt(pi);
                if (pc == '?' || pc == sc) {
                    si++;
                    pi++;
                } else if (pc == '*') {
                    starPos = pi;
                    matchPos = si;
                    pi++;
                } else if (starPos != -1) {
                    si = ++matchPos;
                    pi = starPos + 1;
                } else
                    break;
            } else {
                if (starPos != -1) {
                    if (starPos == p.length() - 1) {
                        return true;
                    } else {
                        si = ++matchPos;
                        pi = starPos + 1;
                    }
                } else {
                    return false;
                }
            }
        }
        while (pi < p.length() && p.charAt(pi) == '*') {
            pi++;
        }
        return pi == p.length();
    }
}
