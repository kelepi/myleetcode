import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/22
 * Time: 9:50
 */

/*
 Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

 If the fractional part is repeating, enclose the repeating part in parentheses.

 For example,

 Given numerator = 1, denominator = 2, return "0.5".
 Given numerator = 2, denominator = 1, return "2".
 Given numerator = 2, denominator = 3, return "0.(6)".
 */
public class FractiontoRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) {
            return "";
        }
        if (numerator == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0)) {
            sb.append("-");
        }
        long nu = Math.abs((long) numerator);
        long de = Math.abs((long) denominator);

        long left = (long) (nu / de);
        putLeft(sb, left);

        if (nu % de == 0) {
            return sb.toString();
        }
        sb.append(".");
        boolean rec = false;
        int index = sb.length();
        int pos = 0;

        Map<Long, Integer> map = new HashMap<Long, Integer>();
        nu = nu % de;
        while (nu != 0) {
            if (!map.containsKey(nu)) {
                map.put(nu, index);
                nu *= 10;
                sb.append(nu / de);
                nu %= de;
                index++;
            } else {
                rec = true;
                pos = map.get(nu);
                break;
            }
        }
        if (rec) {
            sb.insert(pos, "(");
            sb.append(")");
        }
        return sb.toString();
    }

    public void putLeft(StringBuilder sb, long num) {
        if (num > 9) {
            putLeft(sb, num / 10);
        }
        sb.append(num % 10);
    }
}
