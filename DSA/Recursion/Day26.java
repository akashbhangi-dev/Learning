package DSA.Recursion;
import java.util.ArrayList;
import java.util.Arrays;

class Day26 {
    public static void combination(int arr[], ArrayList<Integer> newArr, int preEle, int t) {

        if (t == 0) {
            System.out.println(newArr);
            return;
        }

        if (t < 0) return;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < preEle) continue;
            if (t < arr[i]) break;

            newArr.add(arr[i]);

            combination(arr, newArr, arr[i], t - arr[i]);

            newArr.remove(newArr.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] arr = {8, 12, 5, 13};
        Arrays.sort(arr); 

        ArrayList<Integer> newArr = new ArrayList<>();

        combination(arr, newArr, 0, 13);
    }
}