import leetcode.MinStack;

/**
 * Created by Patrick on 15/3/10.
 */
public class TestMinStack {
    @org.junit.Test
    public void testSimple() throws Exception {
        MinStack minStack = new MinStack();
        assert (minStack.getMin() == 0);
        assert (minStack.top() == 0);
        minStack.push(3);
        assert (minStack.getMin() == 3);
        assert (minStack.top() == 3);
        minStack.push(5);
        assert (minStack.getMin() == 3);
        assert (minStack.top() == 5);
        minStack.push(1);
        assert (minStack.getMin() == 1);
        assert (minStack.top() == 1);
        minStack.push(7);
        assert (minStack.getMin() == 1);
        assert (minStack.top() == 7);
        minStack.pop();
        assert (minStack.getMin() == 1);
        assert (minStack.top() == 1);
        minStack.pop();
        assert (minStack.getMin() == 3);
        assert (minStack.top() == 5);
        minStack.push(2);
        assert (minStack.getMin() == 2);
        assert (minStack.top() == 2);
        minStack.pop();
        assert (minStack.getMin() == 3);
        assert (minStack.top() == 5);
        minStack.pop();
        assert (minStack.getMin() == 3);
        assert (minStack.top() == 3);
        minStack.pop();
        assert (minStack.getMin() == 0);
        assert (minStack.top() == 0);
    }
}
