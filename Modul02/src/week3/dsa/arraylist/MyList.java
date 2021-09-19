package week3.dsa.arraylist;

import java.util.Arrays ;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[] ;

    public MyList (){
        this.element = new Object[DEFAULT_CAPACITY] ;
    }
    private void ensureCapacity(){
        int newSize = this.element.length *2 ;
        element = Arrays.copyOf(element,newSize) ;
    }
    public void add(E e){
         if (size == element.length){
             ensureCapacity();
         }
         element[size++] = e;
    }
    public E get(int index){
        if (index >= size|| index < 0){
//           throw new IndexOutOfBoundsException("Index : " + index + ",size : " + index);
        }
        return (E) element[index] ; // vi moi element la  1 object
    }

}
