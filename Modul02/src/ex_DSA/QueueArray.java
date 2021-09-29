package ex_DSA;

import java.util.Arrays;

public class QueueArray<E> {
    private final int CAPACITY = 5;
    private Object[] queueArr;
    private int head = 0;
    private int tail = 0;
    private int currentSize = 0;

    public QueueArray() {
        queueArr = new Object[CAPACITY];
    }

    private boolean isQueueFull() {
        if (currentSize == queueArr.length) {
            return true;
        }
        return false;
    }

    private void resizeArr() {
        if (isQueueFull()) {
            int newSize = queueArr.length * 2;
            queueArr = Arrays.copyOf(queueArr, newSize);
        }
    }

    public boolean isQueueEmpty() {
        if (currentSize == 0) {
           return true ;
        }
        return false;
    }

    public void enqueue(Object item) {
        if (isQueueFull()) {
            resizeArr();
        }
        queueArr[tail] = item;
        tail++ ;
        currentSize++;
    }

    public E dequeue() {
        if (isQueueEmpty())
            return null;
        E temp = (E) queueArr[head];
        head++;
        currentSize--;
        return temp;
    }
    public E peek(){
        if (isQueueEmpty())
            return null;
       return  (E) queueArr[head];
    }

    @Override
    public String toString(){
        String str ="";
        for (int i = head , j = 1;i< head +currentSize ; i++,j++){
            str += j + ". " + queueArr[i] + "\n" ;
        }
        return str ;
    }

}