package MyArrays;

public class reverse_Arrays {
    public static void main(String[] args) {
        int[] reversedArray = new int[]{1,2,3,4,5,6};

        for(int i =0 ,j=(reversedArray.length-1);(i<reversedArray.length && j>=0); i++,j--){
            System.out.println(i+" "+j);
            if(i!=j){

                int temp = reversedArray[i];
                System.out.println(temp);
                reversedArray[i] = reversedArray[j];
                reversedArray[j] = temp;
            }
            else{
                break;
            }
        }

        System.out.print("[");
        for(int num : reversedArray){
            System.out.print(num+" ");
        }
        System.out.print("]");
    }
}