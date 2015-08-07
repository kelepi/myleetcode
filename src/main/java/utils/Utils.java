package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/12
 * Time: 9:54
 */
public class Utils {
    public static char[][] stringMatrixToCharMatrix(String[] strs) {
        char[][] chars = new char[strs.length][strs[0].length()];
        for (int i = 0; i != strs.length; i++) {
            String str = strs[i];
            for (int j = 0; j != str.length(); j++) {
                char c = str.charAt(j);
                chars[i][j] = c;
            }
        }
        return chars;
    }

    public static void printListListInteger(List<List<Integer>> lists) {
        for (List<Integer> list: lists) {
            System.out.print("Length = " + list.size());
            System.out.print(", [");
            for (int i: list) {
                System.out.print(i + ",");
            }
            System.out.println(']');
        }
    }

    public static void printStringList(List<String> list) {
        System.out.println("Size = " + list.size());
        for (String s: list) {
            System.out.println(s);
        }
    }

    public static void printIntList(List<Integer> list) {
        for (int s: list) {
            System.out.print(s);
        }
        System.out.println();
    }

    public static void printStringStringList(List<List<String>> lists) {
        for (List<String> list: lists) {
            System.out.print("Length = " + list.size());
            System.out.print(", [");
            for (String i: list) {
                System.out.print(i + ",");
            }
            System.out.println(']');
        }
    }

    public static void printListStringArray(List<String[]> list) {
        for (String[] strs: list) {
            System.out.println("[");
            for (String str: strs) {
                System.out.println(str);
            }
            System.out.println("]");
        }
    }

    public static List<Integer> intArrayToList(int[] ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i: ints) {
            list.add(i);
        }
        return list;
    }

    public static int[] rotate(int[] ints, int n) {
        int[] nints = new int[ints.length];
        for (int i = 0; i != n; i++) {
            nints[i] = ints[ints.length - n + i];
        }
        for (int i = 0; i != ints.length - n; i++) {
            nints[n + i] = ints[i];
        }
        return nints;
    }


    /*
    @Test
    public void testBasic() throws Exception {
        int[] ints = {2,1};
        for (int i = 0; i != 4; i++) {
            System.out.println(c.bsearch(ints, i, 0, ints.length - 1));
        }
    }
     */
    public static int bsearch(int[] ints, int i, int l, int r) {
        if (l > r) {
            return -1;
        }
        int mid = (l + r) /2;
        if (i == ints[mid]) {
            return mid;
        } else if (i < ints[mid]) {
            return bsearch(ints, i, l, mid - 1);
        } else {
            return bsearch(ints, i, mid + 1, r);
        }
    }
}
