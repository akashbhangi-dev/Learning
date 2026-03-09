package DSA.String;
import java.util.HashMap;

public class Day11 {
    public static boolean isIsomorphic(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character,Character>map=new HashMap<>();
        int used[]=new int[26];

        for(int i=0 ; i<str1.length() ; i++){
            char c1=str1.charAt(i);
            char c2=str2.charAt(i);

            if(map.containsKey(c1)){
                if(!(map.get(c1).equals(c2))){
                    return false;
                }
            }
            else{
                if(used[c2-'a']!=0){
                    return false;
                }
                map.put(c1,c2);
                used[c2-'a']=1;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="accd";
        String str2="wxyz";
        boolean result=isIsomorphic(str1,str2);
        System.out.println("Str1 and Str2 are Isomorphic:"+result);
    }
}