package DSA.String;

public class Day9 {
    public static String reverseUsingCharArray(String str){

        char[] charArray=str.toCharArray();
        int left=0;
        int right=charArray.length-1;

        while(left<right){
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static String reverseUsingStringBuilder(String str){

        StringBuilder sb=new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        String str="Hello";

        String result1=reverseUsingStringBuilder(str);
        String result2=reverseUsingCharArray(str);

        System.out.println(result1);
        System.out.println(result2);
    }
    
}