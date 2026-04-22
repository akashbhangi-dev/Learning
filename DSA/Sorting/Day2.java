package DSA.Sorting;

public class Day2 {
    public static void countingSort(int [] arr){

        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }

        int countArr [] = new int [max+1];

        for(int i=0;i<arr.length;i++){
            countArr[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<countArr.length;i++){
            while(countArr[i]>0){
                arr[j]=i;
                j++;
                countArr[i]--;
            }
        }
    }
    public static void main(String [] args){
        int arr [] = {4, 2, 6, 1 ,3 };
        countingSort(arr);
        for( int  i : arr){
            System.out.print(i+" ");
        }

    }
}
