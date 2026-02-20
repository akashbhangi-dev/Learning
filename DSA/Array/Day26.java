public class Day26 {
    public static  boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        int count[]=new int[26];
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)-'a']++;
            count[str2.charAt(i)-'a']--;
        }
        for(int i:count){
            if(i!=0){
                return false;
            }
        }
    return true;
    }
    public static void main(String [] args){
        String str1="aab";
        String str2="aba";
        System.out.println("String str1 and str2 are anagram:"+isAnagram(str1,str2));
    }
}
