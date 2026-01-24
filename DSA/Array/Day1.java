
public class Day1 {
    //calculateSum
    public static int calculateSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
    //findMinAndMax
    public static void findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
    //MaxPrefixSum
    public static int maxPrefixSum(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : arr) {
            currentSum += num;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, -2, 5, -1};
        System.out.println("MaxPrefixSum:"+maxPrefixSum(arr));
        findMinAndMax(arr);
        System.out.println("CalulateSum:"+calculateSum(arr));
    }
    
}
