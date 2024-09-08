public class factorial {
    public static void main(String[] args) {
    int n =15;
    int fact=1;
    
    for(int i=1;i<=n;i++){
        fact = fact*i;
        System.out.println("current factorial "+i+": "+fact);
    }
    System.out.println(n+"!= "+fact);



    
    /* 
        - from 13 value = 1,932,053,504 expected =6,227,020,800 
        - this is because overflow 32-bit integer can store only from 
        > -2,147,483,648 to 2,147,483,647
        x don't use int for large number calculations 
        tip use long or BigInt to avoid overflow


        > Explanation:
        > To avoid overflow the large number is modulo with the max value 
        > the datatype could have 
        > Here  
        > 1,932,053,504 = 6,227,020,800 % 2,147,483,647(2^31 : Max value of 32-bit integer)
        > Same if the large number is negative too modulo it 2^31

    


    */

    // > Fixing the overflow using long datatype
    System.out.println();
    System.out.println("----------------------------------");

    System.out.println("After fixing overflow:");
    long factorial=1;
    
    for(int i=1;i<=n;i++){
        factorial = factorial*i;
        System.out.println("current factorial "+i+": "+factorial);
    }
    System.out.println(n+"!= "+factorial);
    }
}