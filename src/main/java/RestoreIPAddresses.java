import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/18
 * Time: 16:56
 */
/*
Given a string containing only digits, restore it by returning all possible valid IP address combinations.

For example:
Given "25525511135",

return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 */
public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        int[] ip = new int[4];
        int[] ints = new int[s.length()];
        for (int i = 0; i != s.length(); i++) {
            ints[i] = s.charAt(i) - '0';
        }
        List<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();

        restoreIpAddressesImpl(ints, 0, ip, 0, list, sb);
        return list;
    }

    private void restoreIpAddressesImpl(int[] ints, int i, int[] ip, int j, List<String> list, StringBuilder sb) {
        if (ints.length - i > (ip.length - j) * 3) {
            return;
        }
        if (i > ints.length || j > ip.length) {
            return;
        }
        if (i == ints.length && j == ip.length) {
            sb.delete(0, sb.length());
            for (int ip_ : ip) {
                sb.append(ip_).append(".");
            }
            sb.deleteCharAt(sb.length() - 1);
            list.add(sb.toString());
        } else if (i == ints.length || j == ip.length) {
            return;
        } else if(ints[i] != 0) {
            ip[j] = ints[i];
            restoreIpAddressesImpl(ints, i + 1, ip, j + 1, list, sb);
            if (i + 1 < ints.length) {
                ip[j] = ints[i] * 10 + ints[i + 1];
                restoreIpAddressesImpl(ints, i + 2, ip, j + 1, list, sb);
                if (i + 2 < ints.length) {
                    ip[j] = ints[i] * 100 + ints[i + 1] * 10 + ints[i + 2];
                    if (ip[j] <= 255) {
                        restoreIpAddressesImpl(ints, i + 3, ip, j + 1, list, sb);
                    }
                }
            }
        } else {
            ip[j] = 0;
            restoreIpAddressesImpl(ints, i + 1, ip, j + 1, list, sb);
        }
    }
}
