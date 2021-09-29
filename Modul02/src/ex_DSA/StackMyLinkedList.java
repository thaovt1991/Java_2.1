package ex_DSA;

public class StackMyLinkedList<E> {
    private MyLinkedList<E> stack ;
    private int size ;

    public StackMyLinkedList(){
        stack = new MyLinkedList();
        size = 0;
    }

    public void push(E element){
       stack.addLast(element);
       size++ ;
    }


    public E pop(){
        if(stack.isEmpty())return null;
        size -- ;
        return (E)stack.removeLast();
    }

    public E peek(){
       return (E) stack.getIndex(stack.size()-1);
    }

    public void printStack(){
        stack.printList();
    }

    public int size(){
       return size;
    }

    @Override
    public String toString(){
        String str ="" ;
        for (int i = 0 ; i < size ; i++){
            str += (i +1) + ". " + stack.getIndex(i) + "\n";
        }
        return str ;
    }

}
