package Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = new int[]{3,3,3};
        int[] indexes = twoSum(arr, 3, 6);
        System.out.println(indexes[0]+", "+indexes[1]);
    }
    public static int[] twoSum(int arr[], int n,int target) {
        //. Used Approach Two Pointers
        for(int i=0;i<n-1;i++){
            int requiredNum = target-arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j] == requiredNum){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

