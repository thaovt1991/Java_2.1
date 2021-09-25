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

    @Override
    public boolean delete(E e) {
        if (root == null) return true;
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
                break;
            }
        }
///con sai
        if (current == null) return true;
        if (current.left == null) {
            if (e.compareTo(parent.element) > 0)
                parent.right = current.right;
            else parent.left = current.right;
        } else {

            // con sai loi doan noi, buon ngu qua di ngu mai lam
            TreeNode<E> temp = current.left;
            while (temp.right != null) {
                temp = temp.right;
            }
            current.element = temp.element;

            if (e.compareTo(parent.element) > 0)
                parent.right = current;
            else parent.left = current;



        }
        size--;
        return true;
    }

    public void Free(TreeNode<E> root) {
        if (root == null) return;
        Free(root.left);
        Free(root.right);
        Free(root);
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
