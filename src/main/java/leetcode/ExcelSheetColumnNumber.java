package leetcode;

/**
 * Created by Patrick on 15/4/11.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int re = 0;
        int multiplier = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            re += (s.charAt(i) - 'A' + 1) * multiplier;
            multiplier *= 26;
        }
        return re;
    }
}
