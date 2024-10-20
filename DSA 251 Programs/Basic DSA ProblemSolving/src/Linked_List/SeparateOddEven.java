import java.util.ArrayList;

public class SeparateOddEven {
    public static void main(String[] args) {
        MyLinkedList separateLL = new MyLinkedList();
     separateLL.insertIntoLinkedList_UsingHead(1);
     separateLL.insertIntoLinkedList_UsingHead(2);
     separateLL.insertIntoLinkedList_UsingHead(3);
     separateLL.insertIntoLinkedList_UsingHead(4);
     separateLL.insertIntoLinkedList_UsingHead(5);
     separateLL.insertIntoLinkedList_UsingHead(6);


     separateOddEven(separateLL.head);
    //  System.out.println(separateLL.toString());
    }

    public static Node separateOddEven(Node head){
        Node p = head;
        Node op = head.nextNode;
        ArrayList<Node> oddNodes = new ArrayList<Node>();
        if(head.data%2 !=0 ){
            System.err.println("HEAD is ODD adding it Array");
            oddNodes.add(head);
        }

        while(p.nextNode!=null){
            System.out.println("--------------------------------------");
            System.out.println("p: "+p.data);
            System.out.println("op: "+op.data+" op.next: "+op.nextNode.data);

            if(op.data%2 !=0){
                System.out.println("Found Odd: "+op.data);
                System.out.println("Before: "+p.data+"------>"+p.nextNode.data);
                // p.nextNode = op.nextNode;
                System.out.println("After: "+p.data+"------>"+p.nextNode.data);
                oddNodes.add(op);
            }
            p = p.nextNode;
            op = op.nextNode;
        }

        return head;
    }
}