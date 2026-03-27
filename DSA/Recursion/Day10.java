package DSA.Recursion;

public class Day10 {
    public static int power(int a,int n){
        if(n == 0) return 1;

        int halfPower = power(a,n/2);

        int powerSquare = halfPower * halfPower;

        if(n % 2 !=0){
            powerSquare = a * powerSquare;
        }
        
        return powerSquare;
    }
    public static void main(String[] args) {
        int a=2;
        int n=5;
        System.out.println(power(a,n));
    }
}
