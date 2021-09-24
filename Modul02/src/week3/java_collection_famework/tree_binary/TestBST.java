package week3.java_collection_famework.tree_binary;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<String> tree = new BST<>();
        tree.insert("5");
        tree.insert("2");
        tree.insert("3");
        tree.insert("4");
        tree.insert("6");
        tree.insert("7");
        tree.insert("1");
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
