import leetcode.ExcelSheetColumnNumber;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/11.
 */
public class TestExcelSheetColumnNumber {
    @Test
    public void testSample() throws Exception {
        ExcelSheetColumnNumber e = new ExcelSheetColumnNumber();
        assert e.titleToNumber("A") == 1;
        assert e.titleToNumber("B") == 2;
        assert e.titleToNumber("AA") == 27;
        assert e.titleToNumber("AAA") == 27;
    }
}
