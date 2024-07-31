
public class swapNodesInPairs {
    public static void main(String[] args) {
        
        MyLinkedList swapNodesLL = new MyLinkedList();
        swapNodesLL.insertIntoLinkedList_UsingHead(1);
        swapNodesLL.insertIntoLinkedList_UsingHead(2);
        swapNodesLL.insertIntoLinkedList_UsingHead(3);
        swapNodesLL.insertIntoLinkedList_UsingHead(4);
        swapNodesLL.insertIntoLinkedList_UsingHead(5);
        swapNodesLL.insertIntoLinkedList_UsingHead(6);

        
        // for (int i=1;i<=5000000;i++){
            
        //     swapNodesLL.insertIntoLinkedList_UsingHead(2);
        // }

  
    pairsSwap(swapNodesLL.head);
    System.out.println(swapNodesLL.toString());

    }

    public static Node pairsSwap(Node head) {
		// Write your code here.
        /*
         > Approach:
         >Two pinters one head and c-> c
         >Check whether the current node is null or it is single node i.e, not a pair
         >In this case you cant swqap hence return the head
         >Call the function again from next Node of the currnt to swap the further Nodes
         >Then make c points to head 
         > and head points to the lastLInk(head returned from therecursive call)
         > return c its the new head 
         */
		if(head == null || head.nextNode == null ){
			return head;                                                  
		}
		// Node length = new Node(1);
		

		Node c = head.nextNode;
	
		Node lastLink = pairsSwap(c.nextNode);
        
        
		head.nextNode = lastLink;
		c.nextNode = head;
		return c;

		
		
	}
}