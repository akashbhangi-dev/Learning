package DSA.Sorting;        
public class Day4{
    public static void bubbleSort(int arr[]){
        int n = arr.length;

        boolean sorted;
        for(int i = 0; i < n-1; i++){
            sorted = true;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    sorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(sorted) break;
        }
    }
    public static void main(String [] args){
        int arr [] = {1, 5, 3, 2, 4};
        bubbleSort(arr);
        for( int i : arr){
            System.out.print(i+" ");
        }
    }
}