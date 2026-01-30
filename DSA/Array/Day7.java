//Find the leader element in an array

public class Day7 {
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
    public static void leaderElement(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    break;
                }
                if(j==arr.length-1){
                    System.out.print(arr[i]+" ");
                }   
            }
            if(i==arr.length-1){
                System.out.print(arr[i]+" ");
            }
    }
 }
 //Time Complexity: O(n)
 //Space Complexity: O(1)
 public static void leaderElementOptimised(int arr[]){
    int maxFromRight=Integer.MIN_VALUE;

    for(int i=arr.length-1;i>=0;i--){
        if(arr[i]>maxFromRight){
            System.out.print(arr[i]+" ");
            maxFromRight=arr[i];
        }
   }
 }
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        int arr1[]={1,2,3,4,5};

        //Brute Force Approach
        leaderElement(arr);
        System.out.println();
        leaderElement(arr1);

        System.out.println();

        //Optimised Approach
        leaderElementOptimised(arr);
        System.out.println();
        leaderElementOptimised(arr1);

    }
}

