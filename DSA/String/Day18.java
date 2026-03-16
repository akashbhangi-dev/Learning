package DSA.String;

public class Day18 {
    public static String removeOccurenceOfString(String s, String p){
        
        while(s.contains(p)){
            
            int idx = s.indexOf(p);
           
            s = s.substring(0,idx)+s.substring(idx+p.length());
        }
        return s;
    }
    public static void main(String[] args) {
        String s="abcpqrabc";
        String p="abc";
        String result=removeOccurenceOfString(s,p);
        System.out.println(result);
    }    
}
