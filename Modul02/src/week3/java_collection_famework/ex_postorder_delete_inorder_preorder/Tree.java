package week3.java_collection_famework.ex_postorder_delete_inorder_preorder;

public interface Tree<E> {
    public boolean insert(E e);

    public void postorder();

    public void inorder();

    public void preorder();

    public int getSize();

    public boolean delete(E e);

    public boolean search(E e);

}
