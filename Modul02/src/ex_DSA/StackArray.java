package ex_DSA;

import java.util.Arrays;

public class StackArray<E> {
    private Object[] arrayStack;
    private int sizeArr;
    private int index ;
    private final int CAPACITY = 5;

    public StackArray() {
        sizeArr = CAPACITY;
        arrayStack = new Object[CAPACITY];
        index = 0;
    }

    private void resizeArray() {
        if (isFull()) {
            int newSize = sizeArr * 2 ;
            arrayStack = Arrays.copyOf(arrayStack, newSize);
        }
    }

    public void push(Object element) {
        resizeArray();
        arrayStack[index] = element;
        index++;
    }

    public E pop() {
        if (isEmpty()) return null;
        Object temp ;
        temp = arrayStack[index - 1];
        arrayStack[index - 1] = null;
        index--;
        return (E)temp;
    }

    public E peek() {
        if (isEmpty()) return null;
        return (E) arrayStack[index - 1];
    }

    public int size() {
        return index;
    }


    public boolean isEmpty() {
        if (index == 0) return true;
        return false;
    }

    private boolean isFull() {
        if (index == sizeArr) return true;
        return false;
    }

    @Override
    public String toString() {
        if(isEmpty())return "Stack empty!" ;
        String str = "";
        for (int i = 0; i < index ; i++) {
            str += (i + 1) + ". " + (E) arrayStack[i].toString() + "\n";
        }
        return str;
    }

}
