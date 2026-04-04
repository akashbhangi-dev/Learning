package DSA.Recursion;
import java.util.ArrayList;

public class Day15 {
    public static void subString(int arr[],ArrayList<Integer> current,int idx){
        if(idx == arr.length){
            System.out.println(current);
            return;
        }

        current.add(arr[idx]);
        subString(arr, current, idx+1);

        current.remove(current.size() - 1);
        subString(arr, current, idx+1);

    }
    public static void main(String[] args) {
        subString(new int[]{1,2}, new ArrayList<Integer>(), 0);
    }
}
