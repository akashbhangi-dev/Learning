package DSA.Sorting;

public class Day3 {
    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei ) return;

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

public static void merge(int arr[], int si, int mid, int ei){
    int i = si;
    int j = mid + 1;

    int newArr[] = new int[ei - si + 1]; 
    int k=0;

    while(i <= mid &&  j <= ei ){
        if( arr[i] < arr[j]){
            newArr[k] = arr[i];
            i++;
        }
        else{
            newArr[k] = arr[j];
            j++;
        }
        k++;
    }

    while( i <= mid){
        newArr[k++] = arr[i++];
    }

    while( j <=  ei){
        newArr[k++] = arr[j++];
    }

    for( int p = si, q = 0; p < si + newArr.length; p++, q++){
        arr[p] = newArr[q];
    }
}
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        mergeSort(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
