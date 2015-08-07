/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/4
 * Time: 10:27
 */
/*
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        String longer, shorter;
        if (a.length() > b.length()) {
            longer = a;
            shorter = b;
        } else {
            longer = b;
            shorter = a;
        }
        sb = sb.append(longer).reverse();
        int blen = shorter.length();
        for (int i = blen - 1; i >= 0; i--) {
            char c = shorter.charAt(i);
            addBinary(sb, c, blen - i - 1);
        }
        return sb.reverse().toString();
    }

    private void addBinary(StringBuilder sb, char c, int i) {
        int add = c == '1' ? 1 : 0;
        if (add != 0) {
            for (int j = i; j != sb.length(); j++) {
                if (sb.charAt(j) == '1') {
                    sb.setCharAt(j, '0');
                } else {
                    sb.setCharAt(j, '1');
                    add = 0;
                    break;
                }
            }
        }
        if (add == 1) {
            sb.append("1");
        }
    }
}
