package DSA.String;

public class Day4 {
    public static String reverse(String str){
        StringBuilder sb=new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str1 = "akash";
        String rev=reverse(str1);
        System.out.println(rev);
    }
}
