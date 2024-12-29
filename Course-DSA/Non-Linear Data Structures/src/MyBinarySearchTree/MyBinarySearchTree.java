package MyBinarySearchTree;

class TreeNode{

    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public String toString(){
        return "Value: "+this.data;
    }
}


public class MyBinarySearchTree {
  private TreeNode root;

    public MyBinarySearchTree(){
         this.root = null;
    } 

    public  void insertTreeNode(int value){
        TreeNode node = new TreeNode(value);
        if(root == null){
            root = node;
            return;
        }
        TreeNode current = root;
        while(true){
            if(value<= current.data){ //> Goes to Left child
                if(current.leftChild ==null){ 
                    current.leftChild = new TreeNode(value);
                    break;
            }
            current = current.leftChild;
         }
            else{ //> Goes to Right Child
                if(current.rightChild == null){
                    current.rightChild = new TreeNode(value);
                    break;
                }
                current = current.rightChild;
            }
        }

    }
}





