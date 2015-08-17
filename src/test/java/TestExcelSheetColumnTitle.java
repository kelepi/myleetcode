import leetcode.ExcelSheetColumnTitle;
import org.junit.Test;

/**
 * Created by Patrick on 15/4/11.
 */
public class TestExcelSheetColumnTitle {
    @Test
    public void testSample() throws Exception {
        ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();
        assert e.convertToTitle(1).equals("A");
        assert e.convertToTitle(2).equals("B");
        assert e.convertToTitle(27).equals("AA");
        assert e.convertToTitle(28).equals("AB");
        assert e.convertToTitle(26).equals("Z");
    }

    @Test
    public void testError() throws Exception {
        ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();
        assert e.convertToTitle(52).equals("AZ");
    }

    @Test
    public void testError2() throws Exception {
        ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();
        assert e.convertToTitle(78).equals("BZ");
    }

    @Test
    public void testError3() throws Exception {
        ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();
        assert e.convertToTitle(2029).equals("BZA");
    }

    @Test
    public void testError4() throws Exception {
        ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();
        assert e.convertToTitle(2054).equals("BZZ");
    }
}
