import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 14:57
 */
/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        short[] a = toShortArray(s);
        short[] b = toShortArray(t);
        for (int i = 0; i != a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    private short[] toShortArray(String s) {
        Map<Character, Short> map = new HashMap<Character, Short>();
        short[] a = new short[s.length()];
        short cnt = 0;
        for (int i = 0; i != s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                a[i] = map.get(c);
            } else {
                a[i] = cnt;
                map.put(c, cnt);
                cnt++;
            }
        }
        return a;
    }
}
