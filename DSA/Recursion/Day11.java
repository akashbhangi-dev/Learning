package DSA.Recursion;  

public class Day11 {  
    public static int countWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int oneStep = countWays(n - 1);
        int twoStep = countWays(n - 2);

        return oneStep + twoStep;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Number of ways: " + countWays(n));
    }
}
