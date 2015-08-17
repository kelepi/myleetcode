package leetcode;

/**
 * Created by Patrick on 15/4/14.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                sb.append(c);
            }
        }
        s = sb.toString();
        for (int i = 0; i != s.length(); i++) {
            int j = s.length() - i - 1;
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
