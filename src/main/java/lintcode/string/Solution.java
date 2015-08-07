package lintcode.string;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/8/7
 * Time: 11:11
 */

import lintcode.LintCodeUtils;
import lintcode.sort.QuickSort;

import java.util.*;

public class Solution {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i != a.length; i++) {
            if (b[i] != a[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     *
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        //write your code here
        if (source == null || target == null || source.length() < target.length()) {
            return -1;
        }
        for (int i = 0; i <= source.length() - target.length(); i++) {
            boolean find = true;
            for (int j = 0; j != target.length(); j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    find = false;
                    break;
                }
            }
            if (find) {
                return i;
            }
        }
        return -1;
    }

    public int strStrKMP(String source, String target) {
        //write your code here
        if (source == null || target == null || source.length() < target.length()) {
            return -1;
        }
        int[] partialMatch = new int[target.length()];
        Set<String> set = new HashSet<String>();
        for (int i = 1; i < target.length(); i++) {
            String str = target.substring(0, i);
            set.clear();
            for (int j = 1; j < str.length(); j++) {
                String prefix = str.substring(0, j);
                set.add(prefix);
            }
            for (int j = 1; j <= str.length() - 1; j++) {
                String postfix = str.substring(j, str.length());
                if (set.contains(postfix)) {
                    partialMatch[i - 1] = postfix.length();
                    break;
                }
            }
        }

        for (int i = 0; i <= source.length() - target.length(); ) {
            boolean find = true;
            for (int j = 0; j != target.length(); j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    find = false;
                    int swift = j == 0 ? 0 : j - partialMatch[j - 1];
                    i += swift == 0 ? 1 : swift;
                    break;
                }
            }
            if (find) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        int[] cnt = new int[26];
        for (int i = 0; i != A.length(); i++) {
            cnt[A.charAt(i) - 'A']++;
        }
        for (int i = 0; i != B.length(); i++) {
            int v = B.charAt(i) - 'A';
            cnt[v]--;
            if (cnt[v] < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        if (dictionary == null || dictionary.length == 0) {
            return new ArrayList<String>();
        }
        int maxLength = 0;
        ArrayList<String> strs = new ArrayList<String>();

        for (String str : dictionary) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                strs.clear();
                strs.add(str);
            } else if (str.length() == maxLength) {
                strs.add(str);
            }
        }
        return strs;
    }

    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(ArrayList<Integer> nums) {
        // write your code
        if (nums == null || nums.size() == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (Integer num : nums) {
            if (sum + num < 0) {
                sum = num;
            } else {
                if (sum < 0) {
                    sum = num;
                } else {
                    sum += num;
                }
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    /**
     * @param nums: A list of integers.
     * @return: An integer denotes the middle number of the array.
     */
    public int median(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }
        QuickSort qs = new QuickSort();
        qs.quickSort(nums);
        return nums[nums.length % 2 == 0 ? nums.length / 2 - 1 : nums.length / 2];
    }

    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        List<String> list = new ArrayList<String>();
        if (strs == null || strs.length == 0) {
            return list;
        }

        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str: strs) {
            String s = LintCodeUtils.stringSorter(str);
            if (map.containsKey(s)) {
                map.get(s).add(str);
            } else {
                List<String> l = new ArrayList<String>();
                l.add(str);
                map.put(s, l);
            }
        }
        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            if (entry.getValue().size() > 1) {
                list.addAll(entry.getValue());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

    }
}






















