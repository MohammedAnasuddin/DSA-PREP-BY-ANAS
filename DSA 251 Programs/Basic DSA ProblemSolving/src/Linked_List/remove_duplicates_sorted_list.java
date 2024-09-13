public class remove_duplicates_sorted_list {
    public static void main(String[] args) {
        MyLinkedList duplicateLL = new MyLinkedList();
        duplicateLL.insertIntoLinkedList_UsingHead(1);
        duplicateLL.insertIntoLinkedList_UsingHead(2);
        duplicateLL.insertIntoLinkedList_UsingHead(2);
        duplicateLL.insertIntoLinkedList_UsingHead(2);
        duplicateLL.insertIntoLinkedList_UsingHead(3);
        duplicateLL.insertIntoLinkedList_UsingHead(4);
        duplicateLL.insertIntoLinkedList_UsingHead(4);
        duplicateLL.insertIntoLinkedList_UsingHead(5);
        duplicateLL.insertIntoLinkedList_UsingHead(6);
        duplicateLL.insertIntoLinkedList_UsingHead(6);

        deleteDuplicates(duplicateLL.head);
        System.err.println(duplicateLL.toString());

    }
    public static Node deleteDuplicates(Node head) {
        /*
         >Apprach: 
         >Check the current and next node
         > If same , update the next of teh current to the next of the next node
         */
        if(head==null || head.nextNode==null){
            return head;
        }
        // Node prev = null;
        Node current = head;
    
        Node nextNodeNode = null;

        while(current.nextNode!=null){
            if(current.data == current.nextNode.data){
                nextNodeNode = current.nextNode;
                current.nextNode = nextNodeNode.nextNode;
            }
            else{
                current = current.nextNode;
            }
        }

        return head;
        
    }
}