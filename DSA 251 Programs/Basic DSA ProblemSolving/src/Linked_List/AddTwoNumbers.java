
/*
 > Approach: Dummy Node Technique
 -Whenever a problem is asked to create a new likned List create a dummy node with
 - value -1 and add all results nodes to it after that return dummyNode.next as head of the resultant list.
 >In this problem we will add the single Nodes and
 > sum % 10 -> Node Data and sum/10 is the carry 
 > this carry of previous um is added with the current sum
 >i.e, in normal ddition 7+6 = 13 then we will write 3 and take 1 as carry right same goes here.
 > the Node is append to the dummy Node
 >return dummyNode.next
 Tip: If you have 2 linked list iterated them in two diffrent if() so that one reaches null the whole loop does not terminate
 x Don't blindly return null if head.next == null since that one element is also considered in addition
 */

public class AddTwoNumbers {
  public static void main(String[] args) {
    MyLinkedList firstNum = new MyLinkedList();
    MyLinkedList secondNum = new MyLinkedList();

    firstNum.insertIntoLinkedList_UsingHead(4);
    firstNum.insertIntoLinkedList_UsingHead(8);
    firstNum.insertIntoLinkedList_UsingHead(6);

    
    secondNum.insertIntoLinkedList_UsingHead(5);
    

    addTwoNumbers(firstNum.head, secondNum.head);

  }

  public static Node addTwoNumbers(Node head1, Node head2) {

    if ((head1 == null ) || (head2 == null)) {
      return null;
    }

    Node dummyNode = new Node(-1);
    int carry = 0;
    int sum = 0;

    Node c1 = head1;
    Node c2 = head2;
    Node dummyPointer = dummyNode;
 

    while (c1 != null || c2 != null) {
      sum=0;
      if(c1!=null){
        sum = sum+c1.data;
        c1 = c1.nextNode;
      }

      if(c2!=null){
        sum = sum+c2.data;
        c2 = c2.nextNode;
      }


      sum = sum + carry;
      carry = sum / 10;

      dummyPointer.nextNode = new Node(sum % 10);
      dummyPointer = dummyPointer.nextNode;


    }

    if (carry > 0) {
      dummyPointer.nextNode = new Node(carry);
    }

    Node k = dummyNode;
    while (k != null) {
      System.out.print(k.data + "--> ");
      k = k.nextNode;
    }

    return dummyNode.nextNode;
  }
}