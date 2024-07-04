package MyLinkedList;

//> This my Custom LinkedList Class to Implement Linked List Manually
class Node {
    // > This Class is responsible for constructing a Node.
    int data; // > Stores the value of node
    Node nextNode = null; // > Points to nextNode(intially node does not point to nextNode )
    // - DataType Node since it points to nextNode of same type

    // > A Node should be created with a value
    public Node(int newData) {
        this.data = newData;
        // > This creates a Node with new data passed in constructor

    }
}

public class MyLinkedList {
    public Node head;
    public Node tail; // > Every LinkedList Starts with a Head

    public MyLinkedList() {
        // > This is the constructor
        head = null; // > intially head does not point

    }

    void insertIntoLinkedList_UsingHead(int newData) {
        // > Inserting a new value is insert new Node

        Node newNode = new Node(newData);
        // > Successfully Created a Node but its not linked yet

        // >Linking has two situations
        // > 1. If LinkedList is empty
        // - Here, we need to link head to the newNode
        if (head == null) {
            head = newNode;
        }
        // > 2. If LinkedList is not empty
        // - Here, we need to link newNode to the head by traversing whole Linkedlist
        // until null is found

        else {
            // > Travesal by a Node, which starts from head
            Node traversingNode = head;

            // > Now Traverse until traversing's nextNode is not equal to null

            // x Don't use loop condition as nextNode of traversing is equal to
            // x since head does not point to null and loop will never start

            while (traversingNode.nextNode != null) {
                traversingNode = traversingNode.nextNode;
            }

            // > After the loop is execute the nextNode of traversingNode is null

            // >Now make the traversingNode's nextNode as newNode we are creating

            traversingNode.nextNode = newNode;

            // Tip: Go to ImplemetinLL.java Impelement the MyLinkedlist

            // - All new Inserted nodes will point to null since nextNode is intialized to
            // - null in Node Class Constructor

        }

    }


    void insertIntoLinkedList_UsingTail(int newData) {
        //  Time Complexity : O(1)
        Node newNode = new Node(newData);

        if (head == null) {
            head = tail = newNode;
            // > For First Element both points to same Node
        } else {
            // > 1.Point the previous last node to newNode
            tail.nextNode = newNode;
            // > 2.Now point tail to the newNode
            tail = newNode;

            // x Tail Insertion should be done in above order only
        }

    }


    public String toString() {
        // Tip: Whenver a object of a class is printed using print methods,these
        // Tip: methods call .toString() method of that
        // Tip: class and print the return value of that method.
        // - If we create our own .toString() we can custom print rather than memory
        // - addresses

        StringBuilder nodeString = new StringBuilder();
        Node traversingNode = head; // > Traversing from start
        while (traversingNode != null) {
            nodeString.append("|").append(traversingNode.data + ", ");
            if (traversingNode.nextNode != null) {
                nodeString.append(traversingNode).append("|");
                nodeString.append("-->");
            } else {
                nodeString.append("null").append("| --> null");
            }

            traversingNode = traversingNode.nextNode;

        }

        return nodeString.toString();

    }

    boolean isLinkedListEmpty(){
        return (head == null) && (tail==null);
    }

    void insertAtStart(int newValue){
        Node newNode = new Node(newValue);
        if(isLinkedListEmpty()) {
            head = tail = newNode;
        }
        else{
            newNode.nextNode = head; //> Point the next of newNode to head
            head =newNode; //>  make newNode as head
        }
    }

    int sumNodes(){
        int sum = 0;
        Node traversingNode = head;
        if(isLinkedListEmpty()){
            return 0;
        }

        while(traversingNode !=null){
            sum+=traversingNode.data;
            traversingNode = traversingNode.nextNode; //- This enables traversingNode to move across Linked List
        }

        return sum;
    }

    int indexOfNode(int toFind){
        Node traversingNode = head;
        int index = 0;

            while(traversingNode !=null){
                if(traversingNode.data == toFind){
                    return index;
                }
                index++;
                traversingNode = traversingNode.nextNode;
            }
            return -1;
    
    }

    void insertAtIndex(int value, int atIndex){
        Node newNode = new Node(value);
        Node currentNode = head;
        Node previousNode = null;

        for(int i=0;i<atIndex && currentNode!=null;i++){
            previousNode=currentNode;
            currentNode = currentNode.nextNode;
        }

        previousNode.nextNode= newNode;
        newNode.nextNode=currentNode;
    }

}