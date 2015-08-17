package leetcode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Patrick on 15/6/25.
 */
/*
        Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

        For example,
        S = "ADOBECODEBANC"
        T = "ABC"
        Minimum window is "BANC".

        Note:
        If there is no such window in S that covers all characters in T, return the emtpy string "".

        If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.
        */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        String str = "";

        Queue<Integer> index = new LinkedBlockingQueue<Integer>();
        int min = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(t);
        int len = sb.length();
        for (int i = 0; i != s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j != sb.length(); j++) {
                if (sb.charAt(j) != '@' && sb.charAt(j) == c) {
                    index.add(i);
                    sb.setCharAt(j, '@');
                    len--;
                    break;
                }
            }
            if (len == 0) {
                str = s.substring(min, i + 1);
                min = index.poll();
                sb.append(t);
                len = sb.length();
                for (int j = 0; j != sb.length(); j++) {
                    if (sb.charAt(j) == s.charAt(min)) {
                        sb.setCharAt(j, '@');
                        len--;
                        break;
                    }
                }
            }
        }
        return str;
    }
}
