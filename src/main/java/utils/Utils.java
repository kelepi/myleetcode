package utils;

import java.util.*;

/**
 * Created by Patrick on 15/4/6.
 */
public class Utils {
    public static Set<String> stringArrayToSet(String[] str) {
        Set<String> set = new HashSet<String>();
        Collections.addAll(set, str);
        return set;
    }

    public static void printListListString(List<List<String>> lists) {
        for (List<String> re : lists) {
            for (String str : re) {
                System.out.print(str + ", ");
            }
            System.out.println();
        }
    }

    public static void printBitsReverse(int a, int bits) {
        while (bits-- != 0) {
            System.out.print(a % 2);
            a >>= 1;
        }
        System.out.println();
    }

    public static void printBits(int a, int bits) {
        printBitsImpl(a, bits);
        System.out.println();
    }

    public static int[] intToBytesArray(int num) {
        int[] ints = new int[32];
        for (int i = ints.length - 1; i >= 0; i--) {
            if (num == 0) {
                break;
            }
            ints[i] = num % 2;
            num = num >> 1;
        }
        return ints;
    }

    public static void printBytesArray(int[] ints) {
        for (int i = 0; i != ints.length; i++) {
            System.out.print(ints[i]);

            System.out.println();
        }
    }

    public static void printListListInteger(List<List<Integer>> lists) {
        for (List<Integer> list : lists) {
            System.out.print("Length = " + list.size());
            System.out.print(", [");
            for (int i : list) {
                System.out.print(i + ",");
            }
            System.out.println(']');
        }
    }

    public static void printStringList(List<String> list) {
        System.out.println("Size = " + list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void printIntList(List<Integer> list) {
        for (int s : list) {
            System.out.print(s);
        }
    }

    public static long factorial(int a) {
        long l = 1;
        while (a != 0) {
            l *= a;
            a--;
        }
        return l;
    }

    public static void printBitsImpl(int a, int bits) {
        if (bits != 0) {
            printBitsImpl(a >> 1, bits - 1);
            System.out.print(a % 2);
        }
    }

    public static char[][] stringMatrixToCharMatrix(String[] strs) {
        int row = strs.length, col = strs[0].length();
        char[][] matrix = new char[row][col];
        for (int i = 0; i != row; i++) {
            for (int j = 0; j != col; j++) {
                matrix[i][j] = strs[i].charAt(j);
            }
        }
        return matrix;
    }

    public static void printListInt(List<Integer> list) {
        System.out.print("[");
        for (Integer i : list) {
            System.out.print(i + ",");
        }
        System.out.println("]");
    }

    public static void printIntArray(int[] nums) {
        printIntArray(nums, nums.length);
    }

    public static void printIntArray(int[] nums, int len) {
        System.out.print("[");
        for (int i = 0; i != len; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println("]");
    }

    public static boolean equalIntArray(int[] ints, int[] vals) {
        if (ints == null || vals == null || ints.length != vals.length) {
            return false;
        }
        for (int i = 0; i != ints.length; i++) {
            if (ints[i] != vals[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printStringStringList(List<List<String>> lists) {
        for (List<String> list : lists) {
            System.out.print("Length = " + list.size());
            System.out.print(", [");
            for (String i : list) {
                System.out.print(i + ",");
            }
            System.out.println(']');
        }
    }

    public static void printListStringArray(List<String[]> list) {
        for (String[] strs : list) {
            System.out.println("[");
            for (String str : strs) {
                System.out.println(str);
            }
            System.out.println("]");
        }
    }

    public static List<Integer> intArrayToList(int[] ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints) {
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

    public static int bsearch(int[] ints, int i, int l, int r) {
        if (l > r) {
            return -1;
        }
        int mid = (l + r) / 2;
        if (i == ints[mid]) {
            return mid;
        } else if (i < ints[mid]) {
            return bsearch(ints, i, l, mid - 1);
        } else {
            return bsearch(ints, i, mid + 1, r);
        }
    }
}
