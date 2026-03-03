package DSA.String;
class Day5 {
    public static char findNonRepeating(String str){
        char charArr[]=new char[26]; 
        for(char ch:str.toCharArray()){
             charArr[ch-'a']++;
        }
        for(char ch:str.toCharArray()){
            if(charArr[ch-'a']==1){
                return ch;
            }
        }
       
        return '$';
    }
    public static void main(String[] args) {
        String str="geeksforgeeks";
        char result=findNonRepeating(str);
        if(result=='$'){
            System.out.println("No non repeating character!");
        }else{
            System.out.println("First non repeating character:"+result);
        }
    }
}