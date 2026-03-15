package DSA.String;
class Day17 {
    public static boolean issubSequence(String s1,String s2){
        int i = 0;
        int j = 0;
        
        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
            i++;
        }
        
        return j==s2.length();
    }
    public static void main(String[] args) {
        String str1 = "ABCDE";
        String str2 = "ACE";
        boolean ans = issubSequence(str1,str2);
        System.out.println("Is subsequence:" +ans);
    }
}