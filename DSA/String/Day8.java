package DSA.String;
public class Day8 {
    public static String replaceWord(String s){
        char[] chars = s.toCharArray();

        reverseArr(chars, 0, chars.length-1);

        int i=0;
        
        for(int l = 0; l < chars.length; l++){
            if(chars[l] != '.'){
                if(i != 0){
                    chars[i++]='.';
                }
                int r=l;
                while(r < chars.length && chars[r] != '.'){
                     chars[i++]=chars[r++];
                }
                reverseArr(chars, i-(r-l), i-1);
                l=r;
            }
        }
        return new String(chars, 0, i);
    }
    public static void reverseArr(char chars [],int start,int end){
        int left=start;
        int right=end;
        while(left < right){
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
    }
    public static void main(String[] args) {
        String s = "..Hello...World......Java";
        String result=replaceWord(s);
        System.out.println(result);
    }
}