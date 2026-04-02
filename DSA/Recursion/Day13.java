package DSA.Recursion;

public class Day13 {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2) return n;

        int single=friendsPairing(n-1);

        int pair=(n-1)*friendsPairing(n-2);

        return single+pair;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(friendsPairing(n));
    }
}
