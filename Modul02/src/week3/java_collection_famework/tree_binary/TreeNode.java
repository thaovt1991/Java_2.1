package week3.java_collection_famework.tree_binary;

public class TreeNode <E>{
    protected E element ;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }
}
