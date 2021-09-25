package week3.java_collection_famework.ex_postorder_delete_inorder_preorder_search;

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
        Tree.insert(45);
        Tree.insert(46);
        Tree.insert(11);




        System.out.println("Inorder: ");
        Tree.inorder();
        System.out.println("The number of nodes is: " + Tree.getSize());

        System.out.println("PostOder: ");
        Tree.postorder();
        System.out.println("The number of nodes is: " + Tree.getSize());

        System.out.println("Preorder: ");
        Tree.preorder();
        System.out.println("The number of nodes is: " + Tree.getSize());

        // Delete e have in tree ;
//        System.out.println("Delete 35");
//        if (Tree.search(35)){
//            System.out.println("Tree have 35");
//        } else System.out.println("Tree have not 35");

        Tree.delete(11) ;
        System.out.println("Inorder: ");
        Tree.inorder();
        System.out.println("The number of nodes is: " + Tree.getSize());
//       //after delete 35
//        System.out.println("After delete, search 35");
//        if (Tree.search(35)){
//            System.out.println("Tree have 35");
//        } else System.out.println("Tree have not 35");




//
//        // Delete e not have in tree ;
//        System.out.println("Delete 15");
//
//        if (Tree.search(15)){
//            System.out.println("Tree have 15");
//        } else System.out.println("Tree have not 15");
//
//        Tree.delete(15) ;
//        System.out.println("Inorder: ");
//        Tree.inorder();
//        System.out.println("The number of nodes is: " + Tree.getSize());

    }
}
