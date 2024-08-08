public class Detect_Cycle {
    public static void main(String[] args) {
        System.out.println(detectCycle(null));
        
    }

    public static boolean detectCycle(Node head) {
        /*
         >Approach: Turtle and Hare
         > Turtle and Hare strats fromt the head
         > Turtle movves one node and Hare Moves 2 nodes
         > If they meet again there is a cycle
         Tip: Check all nodes for null befpore moving on
         - here we have three operation turtle.nextNode and  hare.nextNode.nextNode 
         - check them all for null before entering the loop
         x don't use try and catch block it shows you have not write optimizied code for exception case
         */
        if(head == null || head.nextNode==null){
            return false;
        }
        
         Node turtle = head;
         Node hare = head;
 
 
         while(hare.nextNode!=null &&   turtle.nextNode != null){
           
             turtle = turtle.nextNode;
             if((hare.nextNode).nextNode !=null){

             hare = (hare.nextNode).nextNode;

             if(hare==turtle){
                 return true;
             }

             
             }
             
            
         }
 
         return false;
     }
}