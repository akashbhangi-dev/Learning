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
        boolean result=isRotated(str,roStr);
        System.out.println("Str and roStr are rotated:"+result);
    }
}
