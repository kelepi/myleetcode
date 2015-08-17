/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 9:58
 */
/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example,
Given s = "Hello World",
return 5.
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int cnt = 0;
        boolean exist = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (isChar(c) ) {
                if (!exist) {
                    exist = true;
                }
                cnt++;
            } else {
                if (exist) {
                    return cnt;
                }
            }
        }
        return cnt;
    }

    boolean isChar(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }
}
