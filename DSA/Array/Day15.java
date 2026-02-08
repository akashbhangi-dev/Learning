//Next Permutation
import java.util.Arrays;

public class Day15{
    public static void nextPermutation(int arr[]){

        int n=arr.length;
        int pivot=-1;

        for(int i=n-2;n>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }

        if(pivot!=-1){
            for(int j=n-1;j>=0;j--){
                if(arr[j]>arr[pivot]){
                    swap(arr,j,pivot);
                    break;
                }
            }
        }

        reverse(arr,pivot+1,n-1);
    }

    public static void swap(int arr[],int i,int j){

        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static void reverse(int arr[],int start,int end){

        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main (String args[]){
        int arr[]={1,2,3,5,4};
        int arr2[]={4,5,3,2,1};
        nextPermutation(arr);
        nextPermutation(arr2);
        System.out.println("Next Permutation of Array [1,2,3,5,4]:"+Arrays.toString(arr));
        System.out.print("Next Permutation of Array [4,5,3,2,1]:"+Arrays.toString(arr2));
    }
}