public class ReverseLL {
    public static void main(String[] args) {
            MyLinkedList LL = new MyLinkedList();
        LL.insertIntoLinkedList_UsingHead(2);
        LL.insertIntoLinkedList_UsingHead(4);
        LL.insertIntoLinkedList_UsingHead(1);
        LL.insertIntoLinkedList_UsingHead(3);
        LL.insertIntoLinkedList_UsingHead(6);
        LL.insertIntoLinkedList_UsingHead(8);
        LL.insertIntoLinkedList_UsingHead(7);

        
        // reverseLinkedList(LL.head);
        System.out.println(reverseLinkedList(LL.head).toString());

    
    }

    public static Node reverseLinkedList(Node head){

        if(head == null || head.nextNode == null){
            return head;
        }

        Node current = head;
        Node prev = null;
        Node next = null;

        while(current!=null){
            next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;
            next = next.nextNode;
        }



        return next;

    } 
}
