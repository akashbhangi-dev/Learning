public class Day2 {

    // 1 Brute Force - O(N^3)
    // Checks every possible subarray and recalculates sum each time
    public static int maxSubarrayBruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j++) {
                int currentSum = 0;
                for (int k = i; k < j; k++) {
                    currentSum += arr[k];
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    // 2️ Improved Brute Force - O(N^2)
    // Avoids recomputing sum from scratch
    public static int maxSubarrayBetter(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    // 3 Optimized Approach - O(N)
    // Resets sum when it becomes harmful
    public static int maxSubarrayOptimized(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : arr) {
            currentSum += num;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Brute Force O(N^3): " + maxSubarrayBruteForce(array));
        System.out.println("Better Brute O(N^2): " + maxSubarrayBetter(array));
        System.out.println("Optimized O(N): " + maxSubarrayOptimized(array));
    }
}
