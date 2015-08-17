import leetcode.LRUCache;
import org.junit.Test;

import java.util.PriorityQueue;

/**
 * Created by Patrick on 15/3/10.
 */
public class TestLRUCache {
    @Test
    public void testSimple() throws Exception {
        LRUCache cache = new LRUCache(3);
        cache.set(1, 1);
        cache.set(2, 2);
        cache.set(3, 3);
        cache.set(4, 4);
        assert (cache.get(1) == -1);
        assert (cache.get(2) == 2);
        cache.set(5, 5);
        assert (cache.get(1) == -1);
        assert (cache.get(2) == 2);
        assert (cache.get(3) == -1);
        cache.set(6, 6);
        cache.set(7, 7);
        assert (cache.get(2) == 2);
        assert (cache.get(4) == -1);
        assert (cache.get(5) == -1);
        cache.set(8, 8);
        assert (cache.get(6) == -1);
        assert (cache.get(7) == 7);
        cache.set(9, 9);
        assert (cache.get(2) == -1);
        assert (cache.get(8) == 8);
        assert (cache.get(9) == 9);
    }

    @Test
    public void testQ1() throws Exception {
        /*
        Input:	2,[get(2),set(2,6),get(1),set(1,5),set(1,2),get(1),get(2)]
        Output:	[-1,-1,2,-1]
        Expected:	[-1,-1,2,6]
         */
        LRUCache cache = new LRUCache(2);
        assert (cache.get(2) == -1);
        cache.set(2, 6);
        assert (cache.get(1) == -1);
        cache.set(1, 5);
        cache.set(1, 2);
        assert (cache.get(1) == 2);
        assert (cache.get(2) == 6);
    }
}
