package DSA.Recursion;

public class Day18 {
    public static void permutationNonDuplicates(int arr [],int idx){
        if(idx == arr.length){
            System.out.println(java.util.Arrays.toString(arr));
            return;
        }
        java.util.Set<Integer> used = new java.util.HashSet<>();
        for(int i = idx; i < arr.length; i++){
            if(used.contains(arr[i])) {
                continue;
            }
            used.add(arr[i]);

            swap(arr, idx, i);
            permutationNonDuplicates(arr, idx + 1);
            swap(arr, idx, i);
        }
    }
    public static void swap(int arr [],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }   
    public static void main (String [] args){
        permutationNonDuplicates(new int[]{3 , 5 , 5}, 0);
    }
}
