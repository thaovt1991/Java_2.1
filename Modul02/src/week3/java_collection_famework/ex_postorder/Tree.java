package week3.java_collection_famework.ex_postorder;

public interface Tree<E>  {
    public boolean insert(E e);

    public void postorder();

    public int getSize();
}
