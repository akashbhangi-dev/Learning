package DSA.Recursion;

public class Day17 {
    public static void permutation(int arr [],int idx){
        if(idx == arr.length){
            System.out.println(java.util.Arrays.toString(arr));
            return;
        }
        for(int i = idx; i < arr.length; i++){
            swap(arr, idx, i);
            permutation(arr, idx + 1);
            swap(arr, idx, i);
        }
    }
    public static void swap(int arr [],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }   
    public static void main (String [] args){
        permutation(new int[]{1, 2, 3}, 0);
    }
}
