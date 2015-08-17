import org.junit.Test;
import utils.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/5/18
 * Time: 17:30
 */
public class TestRestoreIPAddresses {
    RestoreIPAddresses r = new RestoreIPAddresses();

    @Test
    public void testSample() throws Exception {
        Utils.printStringList(r.restoreIpAddresses("25525511135"));
        System.out.println();
        Utils.printStringList(r.restoreIpAddresses("255255255255"));
        System.out.println();
        Utils.printStringList(r.restoreIpAddresses("11121314"));
        System.out.println();
        Utils.printStringList(r.restoreIpAddresses("121"));
        System.out.println();
        Utils.printStringList(r.restoreIpAddresses("1212"));
        System.out.println();
        Utils.printStringList(r.restoreIpAddresses("12121"));
        System.out.println();
        Utils.printStringList(r.restoreIpAddresses("13579"));
        System.out.println();
    }

    /*

Input:	"010010"
Output:	["0.1.0.10","0.1.0.10","0.1.1.0","0.10.0.10","0.10.1.0","0.100.1.0","1.0.0.10","1.0.1.0","1.0.1.0","10.0.1.0"]
Expected:	["0.10.0.10","0.100.1.0"]
     */
    @Test
    public void testWA() throws Exception {
        Utils.printStringList(r.restoreIpAddresses("010010"));
    }
}
