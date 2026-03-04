package DSA.String;

public class Day6{
    public static char earlyFirstRepeated(String str){
        int arr[]=new int[26];
        for(int i = 0;i < str.length(); i++){
            char c=str.charAt(i);

            if(arr[c-'a']>0){
                return c;
            }
            arr[c-'a']++;
        }
        return '$';
    }
    public static void main(String [] args){
    String str="abccbaacz";
    char result=earlyFirstRepeated(str);
    System.out.println(result);
    if(result=='$'){
            System.out.println("No Early first repeating character!");
    }else{
            System.out.println("Early first repeating character:"+result);
    }
}
}
