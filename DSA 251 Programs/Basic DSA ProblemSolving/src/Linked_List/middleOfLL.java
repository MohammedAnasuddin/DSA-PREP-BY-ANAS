public class middleOfLL {
    public static void main(String[] args) {
        MyLinkedList demoLL = new MyLinkedList();
        demoLL.insertIntoLinkedList_UsingHead(1);
        demoLL.insertIntoLinkedList_UsingHead(2);
        demoLL.insertIntoLinkedList_UsingHead(3);
        demoLL.insertIntoLinkedList_UsingHead(4);
        demoLL.insertIntoLinkedList_UsingHead(5);
        // demoLL.insertIntoLinkedList_UsingHead(6);


        findMiddle(demoLL.head);
        
    }

    public static Node findMiddle(Node head)
    {
        /*
         >Approach: FAST and SLOW POinters
         >slow is intialzed with head and fast with the nextNode of head
         >Move slow one node and fast node 2 Nodes until fast is not equal to null(i.e until end)
         >Check if fast nextNode is null then just move slow pointer since they asked for 2nd Mid in case of even
         >else just move them as usual
         >at last return the slow pointer
         */
        // Write your code here.
        if(head== null || head.nextNode==null) return head;
		Node slow = head;
		Node fast = head.nextNode;
		
		while(fast!=null){
            System.out.println("-------------------------------------------");
            System.out.println("Slow: "+slow.data);
            System.out.println("Fast: "+fast.data);

		    if(fast.nextNode == null){
                System.out.println("Fast one before NULL breaking the LOOP Just Moving Slow");
                slow = slow.nextNode;
                break;
		    }
            
		    slow = slow.nextNode;
		    fast = (fast.nextNode).nextNode;
		    
		}
        
        
        System.out.println("Returning Node: "+slow.data);
        return slow;

    }


}