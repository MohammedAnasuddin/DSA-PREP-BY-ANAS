package MyBinarySearchTree;

public class Implementing_BST {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insertTreeNode(7);
        tree.insertTreeNode(8);
        tree.insertTreeNode(1);
        tree.insertTreeNode(3);
        tree.insertTreeNode(2);
        tree.insertTreeNode(5);
        tree.insertTreeNode(10);

        System.out.println(tree.toString());
    }
}    