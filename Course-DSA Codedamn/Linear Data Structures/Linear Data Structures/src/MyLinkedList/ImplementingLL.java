package MyLinkedList;

public class ImplementingLL {
    public static void main(String[] args) {
        MyLinkedList LL1 = new MyLinkedList();

        LL1.insertIntoLinkedList_UsingHead(1);
        LL1.insertIntoLinkedList_UsingHead(2);
        LL1.insertIntoLinkedList_UsingHead(3);
        LL1.insertIntoLinkedList_UsingHead(4);

        System.out.println(LL1);
        //Tip: Debug Code at above print and See the Linked List Structure at Top Left
    
        MyLinkedList LL2 = new MyLinkedList();
        LL2.insertIntoLinkedList_UsingTail(5);
        LL2.insertIntoLinkedList_UsingTail(6);
        LL2.insertIntoLinkedList_UsingTail(7);
        LL2.insertIntoLinkedList_UsingTail(8);
        
        System.out.println();
        System.out.println(LL2);
    }
}
