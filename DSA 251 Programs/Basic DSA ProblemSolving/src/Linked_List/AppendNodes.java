/*
 >Approach : 
 > Iterate M times and iterate N times 
 >During N times Iteration calculate sum as well
 > connect the sum to the last Nth Node
 >if no N no. of nodes connect sum up to previous N-Node
 - Pass the parameters carefully during recursion, I ws passing (m,n) while it (n,m) 
 */

public class AppendNodes {
    public static void main(String[] args) {
        MyLinkedList firstNum = new MyLinkedList();

        firstNum.insertIntoLinkedList_UsingTail(12);
        firstNum.insertIntoLinkedList_UsingTail(-34);
        firstNum.insertIntoLinkedList_UsingTail(12);
        firstNum.insertIntoLinkedList_UsingTail(34);
        firstNum.insertIntoLinkedList_UsingTail(-21);
        firstNum.insertIntoLinkedList_UsingTail(89);
        firstNum.insertIntoLinkedList_UsingTail(80);
        firstNum.insertIntoLinkedList_UsingTail(70);

        Node y = addNodes(firstNum.head, 3, 1);
        while (y != null) {
            System.out.print(y.data + "--> ");
            y = y.nextNode;
        }

    }

    public static Node addNodes(Node head, int n, int m) {
        if (head == null) {
            return head;
        }

        System.out.println("\n\n********************");
        System.out.println("------------------");
        System.out.println("New Head: " + head.data);
        int sN = 0;
        Node current = head;
        for (int i = 1; i <= m; i++) {
            System.out.println("Current: " + current.data + "m: " + m);
            if (current.nextNode == null) {
                return head;
            }
            current = current.nextNode;

        }
        System.out.println("------------------");

        for (int i = 1; i <= n; i++) {
            sN += current.data;
            System.out.println("Current:_" + current.data + "_n:_" + n + "_i_" + i + "_sN:_" + sN);
            if (current.nextNode == null && i < n) {
                current.nextNode = new Node(sN);
                return head;
            }
            if (i == n) {
                break;
            }
            current = current.nextNode;

        }
        System.out.println("Sum to be added: " + sN);
        Node actualNextNode = current.nextNode;
        Node sumNode = new Node(sN);
        current.nextNode = sumNode;
        sumNode.nextNode = actualNextNode;

        if (actualNextNode != null) {
            addNodes(actualNextNode, n, m);
        }

        return head;

    }
}