/*
 >Approach: Dummy Node technique
 >mantain 2 LL even and odd
 >if node even connect to evenlist similarly odd to oddList
 >Also Maintain pointers for both list
 >connect next of odd_pointer to the next of evenList(i.e first element of evenList)
 >here is the catch a loop will be formed since last element of even list will still pointing to
 >to any other node hence make it null to break the loop


 */

public class SeparateOddEven {
    public static void main(String[] args) {
        MyLinkedList separateLL = new MyLinkedList();
        separateLL.insertIntoLinkedList_UsingHead(2);
        separateLL.insertIntoLinkedList_UsingHead(4);
        separateLL.insertIntoLinkedList_UsingHead(1);
        separateLL.insertIntoLinkedList_UsingHead(3);
        separateLL.insertIntoLinkedList_UsingHead(6);
        separateLL.insertIntoLinkedList_UsingHead(8);
        separateLL.insertIntoLinkedList_UsingHead(7);

        
        separateOddEven(separateLL.head);
        
    }

    public static Node separateOddEven(Node head) {
       Node oddList = new Node(-1);
       Node evenList = new Node(-1);

       Node op = oddList;
       Node ep = evenList;


       Node current = head;

       while(current!=null){
        System.out.println("Current: "+current.data);
        if(current.data % 2 ==0){
            ep.nextNode = current;
            ep = ep.nextNode;
        } 
        else{
            op.nextNode = current;
            op = op.nextNode;
        }
        current = current.nextNode;
       }
       ep.nextNode = null;
       op.nextNode = evenList.nextNode;

        return oddList.nextNode;
    }
}