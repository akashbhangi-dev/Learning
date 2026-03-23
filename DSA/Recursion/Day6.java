package DSA.Recursion;

public class Day6 {
    public static int firstOccurrence(int[] arr, int idx, int target) {
    if(idx == arr.length) {
        return -1;
    }

    if(arr[idx] == target) {
        return idx;
    }

    return firstOccurrence(arr, idx + 1, target);

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 6};
        int target = 3;
        int index = firstOccurrence(arr, 0, target);
        if(index != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
