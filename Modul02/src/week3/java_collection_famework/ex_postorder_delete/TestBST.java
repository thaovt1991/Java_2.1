package week3.java_collection_famework.ex_postorder_delete;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer> Tree = new BST();
        Tree.insert(27);
        Tree.insert(35);
        Tree.insert(14);
        Tree.insert(10);
        Tree.insert(19);
        Tree.insert(42);
        Tree.insert(31);
        System.out.println("PostOder: ");
        Tree.postorder();
        System.out.println("The number of nodes is: " + Tree.getSize());

        Tree.delete(31) ;
        System.out.println("Inorder: ");
        Tree.inorder();
        System.out.println("The number of nodes is: " + Tree.getSize());

    }
}