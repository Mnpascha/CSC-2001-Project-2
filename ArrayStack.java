import java.util.NoSuchElementException;

import static jdk.xml.internal.Utils.isEmpty;

public class ArrayStack {

    private Object[] items;
    private int size;


    public ArrayStack(){
        items = new Object[10];
        size = 0;
    }

    //Purpose: add an object o to the end of our stack:
    // stack = [1, 2, 3] -- stack.push(5) -> stack = [1, 2, 3, 5]
    public void push(Object o){
        if (size == items.length) {
            Object[] newitems = new Object[items.length * 2];
            for (int i = 0; i < items.length; i++){
                newitems[i] = items[i];
            }

            items = newitems;
        }

        items[size] = o;

        size++;
    }

    //Purpose: to remove the last object in our stack and return it
    //stack = [1, 2, 3] -- v = stack.pop() -> v = 3, stack = [1, 2]
    public Object pop(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }

        size--;
        Object value = items[size];
        items[size] = null;
        return value;
    }

    //Purpose: to return the last object in a stack:
    //stack = [1, 2, 3] -- v = stack.peek() -> v = 3
    public Object peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }

        return items[size - 1];
    }

    //Purpose: check if our stack is empty
    //stack = [1, 2, 3] -- stack.isEmpty() -> false
    public boolean isEmpty(){return size == 0;}

    //Purpose: check the size of our stack:
    //stack = [1, 2, 3] -- v = stack.size() -> v = 3
    public int size(){return size;}
}

