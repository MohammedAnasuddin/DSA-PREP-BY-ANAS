// import java.util.ArrayList;

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
        // System.out.println(separateLL.toString());
    }

    public static Node separateOddEven(Node head) {
        Node odd_connect = head;
        Node p = null;
        Node first_odd = null;

        while (odd_connect.nextNode != null) {
            if ((odd_connect.data) % 2 != 0) {
                System.out.println("Found first odd Node: " + odd_connect.data);
                first_odd = odd_connect;
                if (first_odd == head)
                    p = odd_connect.nextNode; // > In case if first_odd is head p goes gor he second Node
            
                
                break;
            }
            p = odd_connect;
            odd_connect = odd_connect.nextNode;
        }

        p.nextNode = odd_connect.nextNode; // > De attached odd_connect from the list
        System.out.println("Previous" + p.data);

        Node odd = p.nextNode;
        while (p != null) {
            if ((odd.data) % 2 != 0) {
                System.out.println("Found odd Node: " + odd.data);
                p.nextNode = odd.nextNode; // > De attached odd Node
                odd_connect.nextNode = odd; // > Linked odd node to odd LL
                odd_connect = odd;
            }
            p = p.nextNode;
            odd = odd.nextNode;
        }
        System.out.println("odd list: \n" + first_odd.data);
        System.out.println("odd list: \n" + first_odd.nextNode.data);
        System.out.println("odd list: \n" + first_odd.nextNode.nextNode.data);

        odd_connect.nextNode = head; // > Connecting Segregated List

        if (first_odd != head) {
            head = first_odd; // > Re assigned the head at the beginning
        }

        return head;
    }
}