package ex_DSA;

import java.util.LinkedList;

public class StackLinkedList<E> {
    private LinkedList<E> Stack ;
    private int size ;

    public StackLinkedList(){
        Stack = new LinkedList<>();
        size = 0;
    }


    public boolean isEmpty(){
        if(Stack.isEmpty()) return true;
        return false;
    }

    public int size(){
        return Stack.size() ;
    }

    public void push(E element) {
        Stack.add(element);
    }


    public E pop() {
      Object temp =  Stack.pollLast() ;
      return (E)temp;
    }

    public E peek(){
        return (E) Stack.peekLast();
    }

    @Override
    public String toString() {
        String str = "";
       for (int i = 0 ; i < Stack.size() ;i++){
           str +=  +(i + 1) + ". " + Stack.get(i)+ "\n";
       }
       return str ;
    }

}
