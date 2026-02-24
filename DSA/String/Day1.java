package DSA.String;

public class Day1 {
    public static String longestPalindrome(String str){
        int n=str.length();
        if(n==0){
            return "";
        }
        String longest="";

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(str.substring(i,j+1)) && longest.length()<str.substring(i,j+1).length()){
                     longest=str.substring(i,j+1);
                }
            }
        }
        return longest;
    }
    public static boolean isPalindrome(String str){
           int left=0;
           int right=str.length()-1;
            while(left<right){
                if(str.charAt(left)!=str.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
           return true;
    }
    public static void main(String[] args) {

        String str = "madam";
        System.out.println(longestPalindrome(str));
    }
}
