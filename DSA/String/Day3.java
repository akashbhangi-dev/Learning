package DSA.String;

public class Day3 {
    public static boolean isIPAddress(String str){
        int num=0,segmentLength=0,dotCount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='.'){
                if(segmentLength==0)return false;
                dotCount++;
                if(dotCount>3){
                    return false;
                }
                num=0;
                segmentLength=0;
            }
            else{
                if(!Character.isDigit(ch)){
                    return false;
                }
                if(num==0 && segmentLength==1){
                    return false;
                }
                num=num*10+(ch-'0');
                if(num<0 || num>255){
                    return false;
                };
                segmentLength++;
            }
        }
        if(segmentLength==0 || dotCount!=3){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="1.01.1.1";
        boolean res=isIPAddress(str);
        System.out.println(res);
    }
}
