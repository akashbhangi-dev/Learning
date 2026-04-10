package DSA.Recursion;
import java.util.ArrayList;
import java.util.List;

public class Day21 {
   
    public static List<String> combinationOfString(String str, int idx) {
        if(str.length() == 0){
            return new ArrayList<>();
        }

        if(idx >= str.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        } 

        String arr[]={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> newAns = new ArrayList<>();
        List<String>recAns=combinationOfString(str, idx+1);
        
        
        String s=arr[str.charAt(idx)-'0'];
        
        for(String st:recAns){
            for(int i=0;i<s.length();i++){
                newAns.add(s.charAt(i)+st);
            }
        }
       
        return newAns;
    }
    public static void main (String [] args){
        List<String> res= combinationOfString("123",0);
        System.out.println(res);
    }
}
