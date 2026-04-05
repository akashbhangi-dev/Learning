package DSA.Recursion;
import java.util.ArrayList;

public class Day16 {
    public static void subSet(int arr [], ArrayList<Integer> current, int idx){
        if(idx == arr.length){
            System.out.println(current);
            return;
        }

        current.add(arr[idx]);
        subSet(arr, current, idx+1);

        current.remove(current.size()-1);
        int i=idx+1;

        while(i < arr.length && arr[i-1] == arr[i++]){
            continue;
        }

        subSet(arr, current, i);
    }
    public static void main (String[] args){
        subSet(new  int []{1,2,2,2,3,5}, new ArrayList<>(),0);
    }
}

