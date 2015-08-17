import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/12
 * Time: 10:36
 */
/*
Implement wildcard pattern matching with support for '?' and '*'.

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "*") → true
isMatch("aa", "a*") → true
isMatch("ab", "?*") → true
isMatch("aab", "c*a*b") → false
 */
public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        Map<List<String>, Boolean> map = new HashMap<List<String>, Boolean>();
        return isMatchImplWithMap(s, p, map);
    }

    private boolean isMatchImplWithMap(String s, String p, Map<List<String>, Boolean> map) {
        boolean status;
        int slen = s.length(), plen = p.length();
        if (slen == 0 && plen == 0) {
            status = true;
        } else if (slen == 0) {
            status = plen == 1 && p.charAt(0) == '*';
        } else if (plen == 0) {
            status = false;
        } else {
            char pc = p.charAt(0);
            if (pc != '*' && pc != '?') {
                int i = 0;
                while (i < Math.min(s.length(), p.length()) && s.charAt(i) == p.charAt(i)) {
                    i++;
                }
                s = s.substring(i);
                p = p.substring(i);
                List<String> key = Arrays.asList(s, p);
                if (map.containsKey(key)) {
                    status = map.get(key);
                } else {
                    status = i > 0 && isMatchImplWithMap(s, p, map);
                }
            } else if (pc == '?') {
                status = isMatchImplWithMap(s.substring(1), p.substring(1), map);
            } else {
                int i = 0;
                while (i < p.length() && p.charAt(i) == '*') {
                    i++;
                }
                if (i == p.length()) {
                    status = true;
                } else {
                    int ie = i;
                    while (ie < p.length() && p.charAt(ie) != '*' && p.charAt(ie) != '?') {
                        ie++;
                    }
                    String prefix = p.substring(i, ie);
                    if (prefix.length() > s.length()) {
                        status = false;
                    } else {
                        int j = 0;
                        while (j < s.length() && (j + prefix.length() - 1) < s.length()) {
                            boolean ok = true;
                            for (int ti = 0; ti < prefix.length(); ti++) {
                                if (s.charAt(ti + j) != prefix.charAt(ti)) {
                                    ok = false;
                                }
                            }
                            if (ok)
                                break;
                            else
                                j++;
                        }
                        status = j != s.length() && (isMatchImplWithMap(s.substring(j), p.substring(i), map) || isMatchImplWithMap(s.substring(j + 1), p, map));
                    }
                }
            }
        }
        map.put(Arrays.asList(s, p), status);
        return status;
    }

    private boolean isMatchImpl(String s, String p) {
        int slen = s.length(), plen = p.length();
        if (slen == 0 && plen == 0) {
            return true;
        } else if (slen == 0) {
            return plen == 1 && p.charAt(0) == '*';
        } else if (plen == 0) {
            return false;
        } else {
            char pc = p.charAt(0);
            if (pc != '*' && pc != '?') {
                int i = 0;
                while (i < Math.min(s.length(), p.length()) && s.charAt(i) == p.charAt(i)) {
                    i++;
                }
                return i > 0 && isMatchImpl(s.substring(i), p.substring(i));
            } else if (pc == '?') {
                return isMatchImpl(s.substring(1), p.substring(1));
            } else {
                int i = 0;
                while (i < p.length() && p.charAt(i) == '*') {
                    i++;
                }
                return isMatchImpl(s, p.substring(i)) || isMatchImpl(s.substring(1), p);
            }
        }
    }

    /*
    这个方法对 * 号的理解有误：
    这个方法： a* -> aaaaa | aaa | aa | a
    题目却是： a* -> abcde | abbbb | aaaaaaaaa
     */
    public boolean isMatchSimple(String s, String p) {
        if (s == null) {
            return false;
        }
        if (s.length() == 0) {
            return p.length() == 0 || p.length() == 1 && p.charAt(0) == '*';
        }
        if (p.length() == 0) {
            return false;
        }
        if (p.charAt(0) == '*') {
            int i = 1;
            char c = s.charAt(0);
            while (i < s.length() && s.charAt(i) == c) {
                i++;
            }
            return isMatch(s.substring(i), p.substring(1));
        } else if (p.charAt(0) == '?') {
            if (p.length() == 1)
                return s.length() == 1;
            else
                return p.charAt(1) == '*' || isMatch(s.substring(1), p.substring(1));
        } else {
            if (p.charAt(0) != s.charAt(0)) {
                return false;
            } else if (p.length() > 1 && p.charAt(1) == '*') {
                int i = 1;
                char c = s.charAt(0);
                while (i < s.length() && s.charAt(i) == c) {
                    i++;
                }
                return isMatch(s.substring(i), p.substring(2));
            } else {
                return isMatch(s.substring(1), p.substring(1));
            }
        }
    }
}
