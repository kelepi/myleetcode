package leetcode;

import java.util.*;

/**
 * Created by Patrick on 15/4/21.
 */
public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<Integer, Boolean> md5 = new HashMap<Integer, Boolean>();
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String str = s.substring(i, i + 10);
            int hash = convert(str);
            if (md5.containsKey(hash)) {
                if (md5.get(hash)) {
                    list.add(str);
                    md5.put(hash, false);
                }
            } else {
                md5.put(hash, true);
            }
        }
        return list;
    }

    int convert(String s) {
        int num = 0;
        for (Character c: s.toCharArray()) {
            if (c == 'G') {
                num += 1;
            }
            if (c == 'C') {
                num += 2;
            }
            if (c == 'T') {
                num += 3;
            }
            num <<= 2;
        }
        return num;
    }
}
