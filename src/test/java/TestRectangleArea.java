import leetcode.RectangleArea;
import org.junit.Test;

/**
 * Created by Patrick on 15/6/13.
 */
public class TestRectangleArea {
    RectangleArea r = new RectangleArea();

    @Test
    public void testSample() throws Exception {
        assert r.computeArea(-2, -2, 2, 2, -2, 2, 2, 4) == 24;
    }
}
