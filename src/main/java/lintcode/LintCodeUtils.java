package lintcode;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/8/7
 * Time: 17:06
 */
public class LintCodeUtils {
    public static ArrayList<Integer> intArrayToIntArrayList(int[] ints) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i : ints) {
            arr.add(i);
        }
        return arr;
    }

    public static void printIntArray(int[] ints) {
        for (int i: ints) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static String stringSorter(String str) {
        StringBuilder sb = new StringBuilder();

        int[] cnt = new int[26];
        for (int i = 0; i != str.length(); i++) {
            cnt[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i != cnt.length; i++) {
            while (cnt[i] > 0) {
                sb.append((char)('a' + i));
                cnt[i]--;
            }
        }
        return sb.toString();
    }
}
