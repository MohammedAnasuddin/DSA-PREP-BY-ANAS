public class kReverse {
    public static void main(String[] args) {

        MyLinkedList reverseNodesLL = new MyLinkedList();
        reverseNodesLL.insertIntoLinkedList_UsingHead(1);
        reverseNodesLL.insertIntoLinkedList_UsingHead(2);
        reverseNodesLL.insertIntoLinkedList_UsingHead(3);
        reverseNodesLL.insertIntoLinkedList_UsingHead(4);
        reverseNodesLL.insertIntoLinkedList_UsingHead(5);
        reverseNodesLL.insertIntoLinkedList_UsingHead(6);
        reverseNodesLL.insertIntoLinkedList_UsingHead(7);
        reverseNodesLL.insertIntoLinkedList_UsingHead(8);

        System.out.println(reverseNodesLL.toString());
        kReverse(reverseNodesLL.head, 4);
        System.out.println(reverseNodesLL.toString());
    }

    public static Node kReverse(Node head, int k) {
        /* 
          >Approach:
          > Iterate K times to make a group starting with kFirst and ending with kLast
          - use k>1 to iterate k times using while
          Tip: Store k in groupsize to make a recursive call for same group length
          > if kLast gets null return the the KFirst since it does not form a group cant be reversed
          > Iterate until kFirst equals to kLast with p = kFirst.next and c = p.next
          > while itrating make p.next = kFirst
          > if p or c becomes null break
          > Make a recursive call using p since p is the immediate node after the group
          >Link the result from recursive call to head(head is the last node in the group after reversed)
          >return the kLast
         */

        int groupSize = k;
        if (head == null || head.nextNode == null) {
            return head;
        }
        Node kFirst = head;
        Node kLast = head;

        while (k > 1) {
            if (kLast == null) {
                return kFirst;
            }
            kLast = kLast.nextNode;
            k--;
        }

        Node p = kFirst.nextNode;
        Node c = p.nextNode;

        while (kFirst != kLast) {

            p.nextNode = kFirst;
            kFirst = p;
            p = c;
            if (p == null) {
                break;
            } else {
                c = c.nextNode;
            }
        }
        System.out.println("After reversing");
        Node link = kReverse(p, groupSize);

        head.nextNode = link;

        return kLast;

    }
}
