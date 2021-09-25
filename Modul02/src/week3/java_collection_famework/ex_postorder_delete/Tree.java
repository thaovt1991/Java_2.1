package week3.java_collection_famework.ex_postorder_delete;

public interface Tree<E>  {
    public boolean insert(E e);

    public void postorder();

    public void inorder();

    public int getSize();

    public boolean delete(E e);


}
