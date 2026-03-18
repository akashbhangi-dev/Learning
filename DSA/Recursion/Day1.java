package DSA.Recursion;

public class Day1 {

    public static void printNumbers(int n){
        if(n == 0) return;
        printNumbers(n - 1);
        System.out.print(" " + n);
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main (String [] args){
        int n1 = 6;
        int result = factorial(n1);
        System.out.println("Factorila of "+ n1 +":"+result);

        int n2 = 10;
        System.out.print("Numbers:");
        printNumbers(n2);
    }
}
