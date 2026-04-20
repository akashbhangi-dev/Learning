package DSA.Sorting;

public class Day1 {
    public  static void selectionSort(int arr []){

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
       
    }
    public static void main(String[] args) {
        int arr [] = {7, 2 , 5, 3, 8, 6, 4, 1};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
