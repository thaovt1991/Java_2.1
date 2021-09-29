package ex_DSA;

import java.util.Arrays;

public class QueueArrayLevelMax<E> {
    private int capacity = 5;
    private Object[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public QueueArrayLevelMax() {
        queueArr = new Object[capacity];
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
            this.capacity = newSize;
            if (head == 0) {
                queueArr = Arrays.copyOf(queueArr, newSize);
            } else {
                Object[] temp = new Object[newSize];
                for (int i = head, j = 0; i < queueArr.length - 1; i++, j++) {
                    temp[j] = queueArr[i];
                }
                for (int i = head, j = 0; i < queueArr.length - 1; i++, j++) {
                    temp[j] = queueArr[i];
                }
                for (int i = head - 1, j = queueArr.length - head; i >= 0; i--, j++) {
                    temp[j] = queueArr[i];
                }
                head = 0;
                tail = queueArr.length - 1;
                queueArr = Arrays.copyOf(temp, newSize);

            }
        }
    }

    public boolean isQueueEmpty() {
        if (currentSize == 0) {
            return true;
        }
        return false;
    }

    public void enQueue(Object item) {
        if (isQueueFull()) {
            resizeArr();
        }
        if (tail == queueArr.length - 1) {
            tail = 0;//chi dung sau khi full va xoa pt,
        } else {
            tail++;
        }
        queueArr[tail] = item;
        currentSize++;
    }

    public E deQueue() {
        if (isQueueEmpty())
            return null;
        E temp = (E) queueArr[head];

        if (head == queueArr.length - 1) {
            head = 0;
        } else {
            head++;
        }
        currentSize--;
        return temp;
    }

    public E peek() {
        if (isQueueEmpty())
            return null;
        return (E) queueArr[tail];
    }

    @Override
    public String toString() {
        if(isQueueEmpty()) return "Queue empty!";
        String str = "";

        int j = 1;
        if (head == 0) {
            for (int i = 0; i < currentSize; i++) {
                str += j + ". " + queueArr[i] + "\n";
                j++;
            }
        } else {
            if (tail < head) {
                for (int i = head; i < queueArr.length; i++) {
                    str += j + ". " + queueArr[i] + "\n";
                    j++;
                }
                for (int i = tail; i >= 0; i--) {
                    str += j + ". " + queueArr[i] + "\n";
                    j++;
                }
            } else
                for (int i = head; i <= tail; i++) {
                    str += j + ". " + queueArr[i] + "\n";
                    j++;
                }

        }
        return str;
    }
}
