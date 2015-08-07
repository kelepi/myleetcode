import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/22
 * Time: 9:40
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while (!set.contains(n)) {
            set.add(n);
            int next = 0;
            while (n != 0) {
                next += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (next == 1) {
                return true;
            } else {
                n = next;
            }
        }
        return false;
    }
}
