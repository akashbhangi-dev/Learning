package DSA.Recursion;

public class Day20 {
    public static void binaryString(int ld, int n, String str,int idx) {
        if( str.length() == n) {
            System.out.println(str);
            return;
        }
        binaryString(ld , n, str+'1', idx+1);
        if(ld == 1) {
            binaryString(0, n, str+'0', idx+1);
        }   
    }
    public static void main(String[] args) {
        binaryString(1,2,"",0);
    }
}
