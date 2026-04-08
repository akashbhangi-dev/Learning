package DSA.Recursion;

public class Day19 {
    public static void parentheses(int n, int open, int close,String str){
        if(str.length() == n * 2){
            System.out.println(str);
            return;
        }

        if(open < n){
            parentheses(n, open+1, close, str + '(');
        }
        if(close < open){
            parentheses(n, open, close+1, str + ')');
        }
    }
    public static void main (String [] args){
            parentheses(3 , 0, 0, "");
    }
}
