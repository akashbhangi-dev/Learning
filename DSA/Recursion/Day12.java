package DSA.Recursion;

public class Day12 {
    static String remove(String s, int i, String res) {
        if (i == s.length()) return res;
        char c = s.charAt(i);
        if (res.indexOf(c) == -1) res += c;
        return remove(s, i + 1, res);
    }

    public static void main(String[] args) {
        System.out.println(remove("akash", 0, ""));
    }
}