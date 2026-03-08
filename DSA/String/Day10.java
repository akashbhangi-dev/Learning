package DSA.String;

public class Day10 {
    public static void subStringIndex(String s1,String s2) {
        String str1=s1;
        String str2=s2;

        for(int i=0;i<str1.length();i++){
            int j=0;
            while(j<str2.length() && str1.charAt(i+j)==str2.charAt(j)){
                j++;
            }
            if(j==str2.length()){
                System.out.println("Found at index: "+i);

            }
        }

    }
    public static void main(String[] args) {
        String str1="abcdefgh";
        String str2="ef";
        subStringIndex(str1, str2);
    }
  
}
