
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayStackTest {
    @Test
    public void pushTest() {
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        assertEquals(1, stack.size());
        assertEquals(5, stack.peek());
    }

    @Test
    public void popTest(){
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertEquals(7, stack.pop());
    }

    @Test
    public void peekTest(){
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertEquals(7, stack.peek());
    }

    @Test
    public void isEmptyTest(){
        ArrayStack stack = new ArrayStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void sizeTest(){
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertEquals(3, stack.size());
    }
}
