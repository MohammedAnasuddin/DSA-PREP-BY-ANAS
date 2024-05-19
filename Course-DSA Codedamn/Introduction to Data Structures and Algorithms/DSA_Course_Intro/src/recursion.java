public class recursion {
    public static int seriesPrint(int n){
        if(n==1){ // - "Base Condition"
            
        // System.out.print(1+",");
            return 1;
        }else{

            System.out.print(n+",");
            return seriesPrint(n-1);
        }
    }

    public static int seriesSum(int n){
        if(n==1){
            return 1; // - "Base Condition"
        }

        // x not all operands should be recursive func(n)+func(n-1) 
        //x it would be recursion error the correct is value and function call
        //- n +/* function(n)
        
        // tip if you cant understand recursion flow then draw he recursion tree
    return (n+seriesSum(n-1));
}
    public static void main(String[] args) {
        /* 
        - when you pass the input manually without user input it's
        - called "HardCoding the Scanner"
        */ 
        int n =5;
        // System.out.println("The sum of the series is: "+seriesSum(n));
        System.out.print("series is: ");
        System.out.print(seriesPrint(n)+"\n");
        int num=5;
        System.out.println("series sum: "+seriesSum(num));

    }
}
