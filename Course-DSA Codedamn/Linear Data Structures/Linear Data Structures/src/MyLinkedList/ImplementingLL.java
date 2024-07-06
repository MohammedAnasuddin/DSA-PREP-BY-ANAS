package MyLinkedList;

public class ImplementingLL {
    public static void main(String[] args) {
        MyLinkedList LL1 = new MyLinkedList();

        LL1.insertIntoLinkedList_UsingHead(1);
        LL1.insertIntoLinkedList_UsingHead(2);
        LL1.insertIntoLinkedList_UsingHead(3);
        LL1.insertIntoLinkedList_UsingHead(4);


        // System.out.println(LL1);
        // // Tip: Debug Code at above print and See the Linked List Structure at Top Left

        MyLinkedList LL2 = new MyLinkedList();
        LL2.insertIntoLinkedList_UsingTail(5);
        LL2.insertIntoLinkedList_UsingTail(6);
        LL2.insertIntoLinkedList_UsingTail(7);
        LL2.insertIntoLinkedList_UsingTail(8);
        
        System.out.println("LL1 don't have a Tail and LL2 has a tail");
        // System.out.println();
        // System.out.println(LL2);

        // System.out.println("Is LL2 Empty: " + LL2.isLinkedListEmpty());

        // MyLinkedList LL3 = new MyLinkedList();
        // System.out.println("Is LL3 Empty: " + LL3.isLinkedListEmpty());

        // LL3.insertAtStart(0);
        // System.out.println();
        // System.out.println(LL3);

        // System.out.println();
        // System.out.println("Is LL3 Empty: " + LL3.isLinkedListEmpty());

        // System.out.println("\n Sum of Nodes of LL1: " + LL1.sumNodes());
        // System.out.println("\n Sum of Nodes of LL2: " + LL2.sumNodes());
        // System.out.println("\n Sum of Nodes of LL3: " + LL3.sumNodes());

        // System.out.println("\n Index of 6 in LL2:" + LL2.indexOfNode(6));
        // System.out.println("\n Index of 7 in LL3:" + LL3.indexOfNode(7));

        // LL2.insertAtIndex(200, 2);
        // LL2.insertAtIndex(100, 3);

        // System.out.println();
        // System.out.println(LL2);

        // LL1.reverseLinkedList();

        // LL1.deleteFirstNode();
    
        System.out.println(LL1);
        LL1.deleteLastNode();
        System.out.println(LL1);

           System.out.println(LL2);
        LL2.deleteLastNodeUsingTail();
        System.out.println(LL2);


        
    }
}
