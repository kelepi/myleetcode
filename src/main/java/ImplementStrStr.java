/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 10:49
 */
/*
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Update (2014-11-02):
The signature of the function had been updated to return the index instead of the pointer.
If you still see your function signature returns a char * or String, please click the reload button  to reset your code definition.
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        int limit = Math.min(needle.length(), haystack.length() - needle.length());
        int[] pm = partialMatch(needle, limit);
        for (int i = 0; i <= haystack.length() - needle.length(); ) {
            if (haystack.charAt(i) != needle.charAt(0)) {
                i++;
            } else {
                boolean find = true;
                for (int j = 1; j != needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        find = false;
                        i += (j - pm[j - 1]);
                        break;
                    }
                }
                if (find) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int[] partialMatch(String str, int limit) {
        int[] pm = new int[str.length()];
        for (int i = 0; i != limit; i++) {
            String s = str.substring(0, i);
            if (s.length() != 0) {
                for (int j = s.length() - 1; j != 0; j--) {
                    String prefix = s.substring(0, j);
                    String postfix = s.substring(s.length() - j, s.length());
                    if (prefix.equals(postfix)) {
                        pm[i - 1] = j;
                        break;
                    }
                }
            }
        }
        return pm;
    }
}
