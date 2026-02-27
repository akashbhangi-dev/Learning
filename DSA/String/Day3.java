package DSA.String;

class Day3 {

   public static boolean ipV6(String str){
    int segmentLength=0;
    for(int i=0;i<str.length();i++){
        char cha=str.charAt(i);
        if(cha==':'){
            if(segmentLength==0) return false;
            segmentLength=0;
        }
        else{
            if(!Character.isDigit(cha) && (!(cha>='A' && cha<='F') && !((cha>='a' && cha<='f')))){
                return false;
            }
            segmentLength++;
            if(segmentLength>4) return false;
        }

    }
    if(segmentLength==0) return false;
    return true;
   }
  public static void main (String []args){
    String str1="192.168.1.1";
    String str2=":2001:0db8:85a3:0000:0000:8a2e:0370:7334";
    int dotcount=0,coloncount=0;

    for(char ch :str2.toCharArray()){
        if(ch=='.'){
            dotcount++;
        }
        if(ch==':'){
            coloncount++;
        }
    }
        if(dotcount==3 && ipV6(str1)){
             System.out.println("Valid IPV4");
        }
        else if(coloncount==7 && ipV6(str2)){
            System.out.println("Valid IPV6");
        }
        else{
             System.out.println("Invalid");
        }
  

  }
}
