package DSA.String;

class Day7 {
    public static String reverseWord(String str){
        StringBuilder sb=new StringBuilder();
        int i=str.length()-1;
        
        while(i>=0){
            char c=str.charAt(i);
            
            if(c=='.'){
                i--;
                continue;
            }
            
            int end=i;
            
            while(i>=0 && str.charAt(i)!='.'){
                i--;
            }
            
            int start=i+1;
            
            
            String word=str.substring(start,end+1);
        
            sb.append(word);
            
            int temp=i;
            while(temp>=0 && str.charAt(temp)=='.'){
                temp--;
            }
            if(temp>=0){
                sb.append('.');
            }
        
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="...i.like.....this...program.very.much";
        String result=reverseWord(str);
        System.out.println(result);
    }
}