package leetcode;

/**
 * Created by Patrick on 15/4/11.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        recursive(sb, n);
        return sb.toString();
    }

    private void recursive(StringBuilder sb, int n) {
        n--;
        if (n < 26) {
            char c = (char) (n + 'A');
            sb.append(c);
        } else {
            recursive(sb, n / 26);
            sb.append((char) (n % 26 + 'A'));
        }
    }
}
