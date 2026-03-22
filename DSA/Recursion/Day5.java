package DSA.Recursion;

public class Day5 {
    public static int countChar(String str, int idx, char target) {
    if(idx == str.length()) {
        return 0;
    }

    int count = 0;
    if(str.charAt(idx) == target) {
        count = 1;
    }

    return count + countChar(str, idx + 1, target);
}

    public static void main(String[] args) {
        String str = "hello world";
        char target = 'o';
        int count = countChar(str, 0, target);
        System.out.println("Number of occurrences of '" + target + "': " + count);
     }
}
