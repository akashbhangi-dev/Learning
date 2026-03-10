package DSA.String;

public class Day12 {
    public static boolean isIsomorphic(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int arr1[]=new int[256];
        int arr2[]=new int[256];

        for (int i=0; i<str1.length(); i++){
            char c1=str1.charAt(i);
            char c2=str2.charAt(i);

            if(arr1[c1] != arr2[c2]){
                return false;
            }
            arr1[c1]=i+1;
            arr2[c2]=i+1;
        }

        return true;
    }
    public static void main(String[] args) {
        String str1="abcde";
        String str2="edcbc";
        boolean isIsomorphic=isIsomorphic(str1,str2);
        System.out.println("Str1 and Str2 are Isomorphic:"+isIsomorphic);
    }
}
