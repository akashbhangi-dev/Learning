package DSA.Recursion;

public class Day4 {
    public static int minofArr(int arr[], int idx){

        if(idx >= arr.length-1){
            return arr[idx];
        }

        int newMin = minofArr(arr, idx+1);

        if(arr[idx] < newMin){
            newMin = arr[idx];
        }
        return newMin;
    }
    public static int maxofArr(int arr[], int idx){

        if(idx >= arr.length-1){
            return arr[idx];
        }

        int newMax = maxofArr(arr, idx+1);

        if(arr[idx] > newMax){
            newMax = arr[idx];
        }
        return newMax;
    }

    public static void main(String[] args) {
        int arr[] = {2,8,3,6,105};

        int max = maxofArr(arr, 0);
        System.out.println("Max: " + max);

        int min = minofArr(arr, 0);
        System.out.println("Min: " + min);
    }
}
