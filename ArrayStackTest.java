import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayStackTest {
    @Test
    public void pushAddsOneItem() {
        ArrayStack stack = new ArrayStack();
        stack.push(5);

        assertEquals(1, stack.size());
        assertEquals(5, stack.peek());
    }

    @Test
    public void pushMaintainsLastInFirstOutOrder() {
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);

        assertEquals(7, stack.pop());
        assertEquals(6, stack.pop());
        assertEquals(5, stack.pop());
    }

    @Test
    public void pushResizesFullArray() {
        ArrayStack stack = new ArrayStack();

        for (int value = 0; value < 15; value++) {
            stack.push(value);
        }

        assertEquals(15, stack.size());
        assertEquals(14, stack.peek());
    }

    @Test
    public void popReturnsTopItem() {
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);

        assertEquals(7, stack.pop());
    }

    @Test
    public void popRemovesTopItem() {
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        stack.push(6);

        stack.pop();

        assertEquals(1, stack.size());
        assertEquals(5, stack.peek());
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void popThrowsExceptionWhenEmpty() {
        ArrayStack stack = new ArrayStack();

        stack.pop();
    }

    @Test
    public void peekReturnsTopItem() {
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);

        assertEquals(7, stack.peek());
    }

    @Test
    public void peekDoesNotRemoveTopItem() {
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        stack.push(6);

        assertEquals(6, stack.peek());
        assertEquals(2, stack.size());
        assertEquals(6, stack.peek());
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void peekThrowsExceptionWhenEmpty() {
        ArrayStack stack = new ArrayStack();

        stack.peek();
    }

    @Test
    public void isEmptyReturnsTrueForNewStack() {
        ArrayStack stack = new ArrayStack();

        assertTrue(stack.isEmpty());
    }

    @Test
    public void isEmptyReturnsFalseAfterPush() {
        ArrayStack stack = new ArrayStack();
        stack.push(5);

        assertFalse(stack.isEmpty());
    }

    @Test
    public void isEmptyReturnsTrueAfterRemovingAllItems() {
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    public void sizeReturnsZeroForNewStack() {
        ArrayStack stack = new ArrayStack();

        assertEquals(0, stack.size());
    }

    @Test
    public void sizeIncreasesAfterPushes() {
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);

        assertEquals(3, stack.size());
    }

    @Test
    public void sizeDecreasesAfterPop() {
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        stack.push(6);

        stack.pop();

        assertEquals(1, stack.size());
    }
}
