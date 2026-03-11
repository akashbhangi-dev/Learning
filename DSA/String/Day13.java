package DSA.String;

public class Day13 {
    public static boolean isRotated(String str,String roStr){
        if(str.length() != roStr.length()){
            return false;
        }
        if(str.equals(roStr)) return true;

        return (str+str).contains(roStr);
    }
    public static void main(String[] args) {
        String str="abcd";
        String roStr="cdab";
        boolean isRotated=isRotated(str,roStr);
        System.out.println("roStr is rotated version of str:"+isRotated); 
    }
}
