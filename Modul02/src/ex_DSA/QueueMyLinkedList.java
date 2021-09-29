package ex_DSA;

public class QueueMyLinkedList<E> {
    private MyLinkedList queueMLL ;
    private int size ;

    public QueueMyLinkedList(){
        queueMLL = new MyLinkedList();
        this.size = 0;
    }
    public boolean isEmpty(){
        if(this.size ==0) return true ;
        return false ;
    }
    public void enQueue(E element){
        queueMLL.addFirst(element);
        size ++;
    }

    public E deQueue(){
        if (isEmpty())return null ;
        size --;
        return (E)queueMLL.removeLast();
    }
    public E peek(){
        if (isEmpty())return null ;
        return (E)queueMLL.getIndex(0);
    }

   @Override
    public String toString(){
        if (isEmpty())return "Queue Empty!";
       String str = "";
       int i = size - 1;
       int j = 1;
       while (i >=0 ) {
           str += j + ". " + queueMLL.getIndex(i) + "\n";
           i--;
           j++;
       }
       return str;
   }



}
