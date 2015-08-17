/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/26
 * Time: 10:42
 */
public class IntegertoRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] ints = {10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] strs = {"X", "XL", "L", "XC", "C", "XD", "D", "CM", "M"};
        while (num != 0) {
            if (num < 10) {
                if (num == 9) {
                    sb.append("IX");
                } else if (num >= 5) {
                    sb.append("V");
                    for (int j = 5; j < num; j++) {
                        sb.append("I");
                    }
                } else if (num == 4) {
                    sb.append("IV");
                } else {
                    for (int j = 0; j < num; j++) {
                        sb.append("I");
                    }
                }
                break;
            }
            for (int i = ints.length - 1; i >= 0; i--) {
                if (num > ints[i]) {
                    int a = num / ints[i];
                    for (int j = 0; j != a; j++) {
                        sb.append(strs[i]);
                    }
                    num = num % ints[i];
                    break;
                } else if (num == ints[i]) {
                    sb.append(strs[i]);
                    num = num % ints[i];
                    break;
                }
            }
        }
        return sb.toString();
    }
}
