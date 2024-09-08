public class powerOfTwo {
    public static void main(String[] args) {
        int n =-29358;
        // boolean one_occurred_once = false;
        int power =-1;

    // ["302c3c","f25f5c","ffe066","247ba0","70c1b3"]
    // ["302c3c","f25f5c","ffe066","44cf6c","00a7e1"]

        while(n!=0){
            System.out.println("---------------------------------------------");
            System.out.println("n= "+n);
            System.out.println("n: "+String.format(Integer.toBinaryString(n)));
            System.out.println("current last digit = "+(n&1));
            if(   ( ((n&1)==1)  && (n>1) ) ){
                // System.out.println("The NUmber is not a power of 2");
                System.out.println("false");
                System.exit(0);
            }
            else{
                if(n>=-1){
                    System.out.println("false");
                    System.exit(0);
                }
                else{
                    n=n>>1;
                }
            }



            //* Lesson : Simplify the approach : Try to covert your apprach conditions into
            //  least coditions possible 


// My approach            
        //     else{
        //         System.out.println("1 has occured  status of one_ocur: "+one_occurred_once);
                
        //         if(one_occurred_once){
        //             System.out.println("The Number "+n+" is not a power of 2");
        //             System.exit(0);
                    
        //         }
        //         else{
        //             System.out.println("first 1 hs occured and turning one_occurred_once to true");
        //             one_occurred_once = true;
        //             n=n>>1;
                    
    

        //     }
        // }
        power++;



        }
        System.out.println("true");
        // System.out.println("Yes the number "+((int)Math.pow(2,power))+" is power of 2: 2^"+power);
    }
}