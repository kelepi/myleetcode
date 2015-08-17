package leetcode;

/**
 * Created by Patrick on 15/4/11.
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        int re = 0;
        int[] a = convert(version1);
        int[] b = convert(version2);

        for (int i = 0; i != a.length; i++) {
            if (i == b.length) {
                re = 1;
                break;
            }
            if (a[i] > b[i]) {
                re = 1;
                break;
            } else if (a[i] < b[i]) {
                re = -1;
                break;
            }
        }
        if (re == 0 && b.length > a.length) {
            re = -1;
        }
        return re;
    }

    private int[] convert(String str) {
        if (str == null || str.isEmpty()) {
            return new int[0];
        }
        String[] strs = str.split("\\.");
        int end = strs.length - 1;
        while (end >= 0 && Integer.parseInt(strs[end]) == 0) {
            end--;
        }
        int[] ints = new int[end + 1];
        for (int i = 0; i != end + 1; i++) {
            ints[i] = Integer.parseInt(strs[i].trim());
        }
        return ints;
    }
}
