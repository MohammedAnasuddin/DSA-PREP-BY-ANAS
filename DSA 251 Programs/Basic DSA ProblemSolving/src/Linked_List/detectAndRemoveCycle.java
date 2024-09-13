

import java.util.ArrayList;

public class detectAndRemoveCycle {
    
        public static void main(String[] args) {
        MyLinkedList cycleLL = new MyLinkedList();
        cycleLL.insertIntoLinkedList_UsingHead(1);
        cycleLL.insertIntoLinkedList_UsingHead(2);
        cycleLL.insertIntoLinkedList_UsingHead(3);
        cycleLL.insertIntoLinkedList_UsingHead(4);
        cycleLL.insertIntoLinkedList_UsingHead(5);
        cycleLL.insertIntoLinkedList_UsingHead(6);

        cycleLL.createCycle(6,3);
        System.out.println(cycleLL.toString());

            
        }
    
  public static Node removeLoop(Node head) {
    Node slow= head;
    Node fast = head.nextNode;
    boolean cycleDetected = false;

    while(slow!=null && fast.nextNode!=null){
      if(fast.nextNode==head){
        fast.nextNode = null;
        break;
      }
      if(fast == slow){
        //Cycle Detected
        // fast.nextNode.nextNode= null;
        cycleDetected= true;
        break;

         
      }
      slow = slow.nextNode;
      fast = fast.nextNode.nextNode;
    }

    if(cycleDetected){
      ArrayList<String> traversedNodes = new ArrayList<>();
      Node check= head;
      while(check!=null){
        if(traversedNodes.contains(String.valueOf(check))){
          check.nextNode=null;
          return head;
        }
        else{
          traversedNodes.add(String.valueOf(check));
        }
      }


    }

    return head;
  }
}