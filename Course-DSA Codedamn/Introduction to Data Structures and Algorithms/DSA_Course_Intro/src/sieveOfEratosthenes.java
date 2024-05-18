
import java.util.Arrays; 
public class sieveOfEratosthenes {
    public static void main(String[] args) {
        int n =15;
        boolean[] primes = new boolean[n];
        Arrays.fill(primes,true);

        //Since we are not considering 0 and 1
        primes[0] = false;
        primes[1] = false;
        
        int count=0;
        int i=2;
        while(i<n){
            // System.out.println("-----------------------------");
            // System.out.println("i ="+i);
            if(primes[i]==true)
                count++;
                // if number boolean is true increment it since it is visited first time
                // and  not canceleld yet


            // System.out.println(i+" status: "+primes[i]);
            for(int j  =i+1; j<(n); j++){
                // System.out.println("-----------------------------");
                // System.out.println("j ="+j);
                // System.out.println(j+"%"+i+" = "+j%i);
                
                    if(j%i == 0){
                        // System.out.println("j= "+j+"Non cancelled number: "+i);
                        primes[j] = false; 
                        // System.out.println(j+" status: "+primes[j]);
                    }
                
                else{
                    continue;
                }
            }


                i++;


        }
        
        for(int p =0;p<primes.length;p++){
            System.out.println(p+" "+primes[p]);
        }
        System.out.println("No. of Primes: "+count);


    }
}