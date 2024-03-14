import java.util.* ;
import java.io.*; 
public class Array_missingPositiveNumber {


    public static void main(String[] args) {

       
        int tc = 0;
        Scanner iscan = new Scanner(System.in);
        tc = iscan.nextInt();

        for (int c = 1; c <= tc; c++) {
            int[] ARR = new int[10000];
            int n = 0;
            n = iscan.nextInt();

            // Reading Inputs
            for (int i = 0; i < n; i++) {

                ARR[i] = iscan.nextInt();
            }

            firstMissing(ARR, n);

        }

    }





	public static int firstMissing(int[] arr, int n) {
		

        Arrays.sort(arr,0,n);
System.out.println("Sorted Array: ");
        for(int p = 0; p<n;p++){
            System.out.print(arr[p]+" ");
        }
        System.out.println();
        
        for(int i=0;i<n;i++){
            System.out.println("----------------------------");
            System.out.println("i ="+i);
            System.out.printf("arr[%d] = %d\n",i,arr[i]);


        
            if(arr[i]<0)
            continue;

            else{
                System.out.println("Found positive integer");
            if(i==(n-1)){
                System.out.println("Iteration at last index haence return increment of postive integer = "+arr[i]);
                System.out.println(arr[i]+1);
                return (arr[i]+1);
            }
            
            else{
                if((arr[i]+1) == arr[i+1]){
                    System.out.println("Next most integer of arr[i] is present continuing");
                    }
                    else{
                        System.out.println(arr[i]+ " is minimum element and "+(arr[i]+1)+" is not present returning it" );
                        System.out.println(arr[i]+1);
                        return arr[i]+1;
        
                    }
            }




        }
        
        
        
        
        
	}
    
    return 1;		


}
}
