//Rotate an array of n elements to the right by k steps.
public class Day5 {
    public static void rotateArray(int arr[],int k){
        int n=arr.length;
        k%=n; //In case k is greater then n

        //Reverse first n-k elements
        reverseArray(0,n-k-1,arr);

        //Reverse last k elements
        reverseArray(n-k, n-1, arr);

        //Reverse whole array
        reverseArray(0,n-1,arr);
    }
    public static void reverseArray(int start,int end,int arr[]){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main (String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int k=3; 

        System.out.println("Original Array:");
         for(int i:arr){
            System.out.print(i+" ");
        }

        System.out.println();

        rotateArray(arr,k);
        System.out.println("Array after rotation:");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
