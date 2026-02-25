package DSA.String;
public class Day2{
    public static void stringToInteger(String str){
        int res=0 ;
        int n=str.length();
        int sign=1;
        int idx=0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        while(idx<n && str.charAt(idx)==' '){
            idx++;
        }
        if(idx<n && (str.charAt(idx)=='-' || str.charAt(idx)=='+')){
            sign=(str.charAt(idx)=='-')?-1:1;
            idx++;
        }
        while(idx<n && (Character.isDigit(str.charAt(idx)))){
            int digit=str.charAt(idx)-'0';
            if(res>(max-digit)/10){
                res=(sign==-1)?min:max;
                System.out.println(res);
                return;
            }
            res=10*res+digit;
            idx++;
        }
        System.out.println(res*sign);
    }
    public static void main (String []args){
        String str="  +0012g04";
        stringToInteger(str);
    }

}