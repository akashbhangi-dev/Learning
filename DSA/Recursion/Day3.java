package DSA.Recursion;

public class Day3 {
    public static String reverseString( String str, int idx ){
        
        if(idx < 0){
            return "";
        }

        return str.charAt(idx)+reverseString(str, idx-1);
    }
    public static void main(String[] args) {

        String str = "abcde";    
        String res = reverseString( str, str.length()-1);
        System.out.println("Reversed String:" + res); 
    }
}
