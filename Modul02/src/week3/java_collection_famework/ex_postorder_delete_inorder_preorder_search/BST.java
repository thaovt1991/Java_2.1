package week3.java_collection_famework.ex_postorder_delete_inorder_preorder_search;


public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }


    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            /*locate the parent node*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    protected void postorder(TreeNode<E> root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.element + " ");
    }


    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }

    @Override
    public void preorder() {
        preorder(root);
    }

    protected void preorder(TreeNode<E> root) {
        if (root == null) return;
        System.out.println(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }


//    protected TreeNode<E> deleteNode(TreeNode<E> root, E e) {
//        if (root == null) return root;
//        if (e.compareTo(root.element) < 0)
//            root = deleteNode(root.left, e);
//        else if (e.compareTo(root.element) > 0)
//            root = deleteNode(root.right, e);
//        else {
//            if (root.left == null) {
//                root = root.right;
//            } else if (root.right == null) {
//                root = root.left;
//            } else {
//                TreeNode<E> temp = root.right;
//                while (temp.left != null) {
//                    temp = temp.left;
//                }
//                root.element = temp.element;
//                root.right = deleteNode(root.right, temp.element);
//            }
//        }
//        return root;
//    }

    protected TreeNode<E> getSuccessor(TreeNode<E> p) {
        while (p.left != null) p = p.left;
        return p;
    }

    protected TreeNode<E> deleteNode(TreeNode<E> root, E e) {
        if (root == null) return root;
        if (e.compareTo(root.element) < 0) root = deleteNode(root.left, e);
        else if (e.compareTo(root.element) > 0) root = deleteNode(root.right, e);
        else {
            if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            } else {
                TreeNode<E> temp = getSuccessor(root.right);
                root.element = temp.element;
                root.right = deleteNode(root.right, temp.element);
            }
        }
        return root;
    }

    @Override
    public boolean delete(E e) {
        deleteNode(this.root, e);
        size--;
        return true;
    }

    @Override
    public boolean search(E e) {
        if (root == null)
            return false;
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

}
