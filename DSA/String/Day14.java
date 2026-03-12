package DSA.String;

public class Day14{
    public static boolean patternMatch(String text,String pattern){
        text=text+text;
        int n=text.length();
        int m=pattern.length();

        for(int i=0; i<n-m;i++){
            char c=pattern.charAt(0);
            if(text.charAt(i)==c){
                int j=1,k=i+1;
                while( j<m && k<n){
                    if(text.charAt(k)!=pattern.charAt(j)){
                        break;
                    }
                    j++;
                    k++;
                }
                if(j==m) return true;   
            }
        }
        return false;
    }
    public static void main(String [] args){
        String text="aabcdabcd";
        String pattern="abcd";
        boolean result=patternMatch(text,pattern);
        System.out.println("Pattern found: "+result);
    }
}