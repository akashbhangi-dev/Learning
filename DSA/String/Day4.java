package DSA.String;

public class Day4 {
    public static boolean isValide(String str){
        int colonCount=0,segmentLength=0;
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch==':'){
            if(segmentLength==0)return false;
            colonCount++;
            if(colonCount>7){
                return  false;
            }
            segmentLength=0;
        }
        else{
            if(!Character.isDigit(ch) && !(ch>='a' && ch<='f') && !(ch>='A' &&ch<='F')){
               return false;
            }
            segmentLength++;
            if(segmentLength>4){
                return false;
            }
           }
        }
        if(segmentLength==0 || colonCount!=7){
            return false;
       }
    return true;
    }
    public static void main(String[] args) {
        String str="2456:8956:000:3567:5689:7964:000:369";
        boolean res=isValide(str);
        System.out.println("Is given String is Valid IP Address:"+res);

    }
}
