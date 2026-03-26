package DSA.Recursion;

import java.util.ArrayList;

public class Day9 {
   public static void subsets(int[] arr, int idx, ArrayList<Integer> current) {
    if(idx == arr.length) {
        System.out.println(current);
        return;
    }
    current.add(arr[idx]);

    subsets(arr, idx + 1, current);

    current.remove(current.size() - 1);

    subsets(arr, idx + 1, current);
}
    public static void main(String[] args) {
        subsets(new int[]{1, 2, 3}, 0, new ArrayList<>());      
    }
}
