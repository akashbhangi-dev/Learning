package DSA.Recursion;

public class Day7 {
    public static boolean isSorted(int arr[], int idx){
        if(arr.length == 0 || idx == arr.length-1) return true;

        if(arr[idx] > arr[idx+1]) return false;

        return isSorted(arr, idx+1);
    }
    public static void main(String[] args){

        int arr[] = {100,200,300,400,500};

        boolean result=isSorted(arr, 0);
        System.out.println("Array is sorted:"+result); 
    }
}
