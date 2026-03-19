package DSA.Recursion;

public class Day2 {

    public static int sumOfDigits(int n){

        if( n == 0 )  return 0;

        int rem = n % 10;
        n = n / 10;

        return rem+sumOfDigits(n);
    }

    public static void main (String [] args){

        int n=2156;
        int result=sumOfDigits(n);

        System.out.print("Sum of digits in "+ n + " is :" +result);
    }
}
