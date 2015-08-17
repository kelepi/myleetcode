import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/8
 * Time: 13:43
 */
/*
Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

For example, given s = "aab",
Return

  [
    ["aa","b"],
    ["a","a","b"]
  ]
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> results = new ArrayList<List<String>>();

        char[] chars = new char[s.length()];
        for (int i = 0; i != s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        List<String> list = new ArrayList<String>();
        partitionImpl(chars, 0, s, results, list);
        return results;
    }

    void partitionImpl(char[] chars, int start, String s, List<List<String>> results, List<String> list) {
        if (start == chars.length) {
            List<String> temp = new ArrayList<String>();
            temp.addAll(list);
            results.add(temp);
        }
        for (int i = start; i != chars.length; i++) {
            boolean isPalindrome = true;
            for (int left = start, right = i; left < right; left++, right--) {
                if (chars[left] != chars[right]) {
                    isPalindrome = false;
                }
            }
            if (isPalindrome) {
                int pos = list.size();
                list.add(s.substring(start, i + 1));
                partitionImpl(chars, i + 1, s, results, list);
                list.remove(pos);
            }
        }
    }
}
