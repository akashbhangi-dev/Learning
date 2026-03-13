package DSA.String;
public class Day15{

    public static int[] buildLPS(String pattern){
        int n = pattern.length();
        int lps[] = new int[n];

    int i = 1;
    int len = 0;

    while(i < n){
        
        if(pattern.charAt(i) == pattern.charAt(len)){
            len++;
            lps[i] = len;
            i++;
        }
        else{
            if(len == 0){
                lps[i] = 0;
                i++;
            }
            else{
                len = lps[len - 1];
            }
        }
    }

    return lps;
}
public static boolean kmpSearch(String text, String pattern){
    int lps[] = buildLPS(pattern);

    int i = 0;
    int j = 0;
    while(i < text.length()){
        
        if(text.charAt(i) == pattern.charAt(j)){
            i++;
            j++;
        }
        else{
            if(j == 0){
                i++;
            }
            else{
                j = lps[j - 1];
            }
        }

        if(j == pattern.length()){
            return true;
        }
    }

    return false;
}
    public static void main(String []args){
        String s="ABABCABAB";
        
        boolean found=kmpSearch(s,"ABAB");
        if(found){
            System.out.println("Pattern matched Text");
        }else{
            System.out.println("Not matched");
        }
    }
}