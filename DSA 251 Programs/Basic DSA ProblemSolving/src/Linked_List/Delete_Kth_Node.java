
public class Delete_Kth_Node {
    public static void main(String[] args) {
        // 18 22 16 32 10 7 35 18 35

        MyLinkedList KdeleteList = new MyLinkedList();
        // KdeleteList.insertIntoLinkedList_UsingHead(18);
        // KdeleteList.insertIntoLinkedList_UsingHead(22);
        // KdeleteList.insertIntoLinkedList_UsingHead(16);

        // KdeleteList.insertIntoLinkedList_UsingHead(32);
        // KdeleteList.insertIntoLinkedList_UsingHead(10);
        // KdeleteList.insertIntoLinkedList_UsingHead(7);
        // KdeleteList.insertIntoLinkedList_UsingHead(35);
        // KdeleteList.insertIntoLinkedList_UsingHead(18);
        // KdeleteList.insertIntoLinkedList_UsingHead(35);

        KdeleteList.insertIntoLinkedList_UsingHead(1);
        KdeleteList.insertIntoLinkedList_UsingHead(2);
        KdeleteList.insertIntoLinkedList_UsingHead(3);

        KdeleteList.insertIntoLinkedList_UsingHead(4);
        KdeleteList.insertIntoLinkedList_UsingHead(5);
        KdeleteList.insertIntoLinkedList_UsingHead(6);
        System.out.println(KdeleteList.toString());

        removeKthNode(KdeleteList.head, 3);

        System.out.println("Linked List after deletion");
        System.out.println(KdeleteList.toString());

    }

    public static Node removeKthNode(Node head, int K) {

        /* 
        > FAST and SLOW Pointers
         > Define three pointers fast,previous,curent
         > Move the fast pointer K times ahead
         > if fast reaches null then it indicates first element to be removed hence 
         > re asssign head
         > else start moving previous and current until fast reaches last node(fast,nextNode!=null)

         - This works by creating a gap of K elements betwen fast and current
         - hence when fast is reached end the current is k times behind i.e, the Node to be deleted
         - we use previous here to not loose the left of the Linked List and connect it after deleting Kth      element
          
         */
    Node fast=head;
        Node previous= null;
        Node current = head;

        while(K>=1){
            fast = fast.nextNode;
            K--;
        }

        if(fast==null){
            previous=head;
            current=head;
            head = head.nextNode;
        }
        else{
            previous = head;
            current = head.nextNode;
            while(fast.nextNode!=null){
                fast = fast.nextNode;
                previous = previous.nextNode;
                current = current.nextNode;
            }
            previous.nextNode = current.nextNode;
            current.nextNode=null;
        }


        return head;
    }
}