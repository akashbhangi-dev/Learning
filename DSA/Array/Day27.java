public class Day27{
    public static String prefixString(String arr[]){
        if (arr.length==0){
            return "";
        }
        for(int i=0;i<arr[0].length();i++){
            char ch=arr[0].charAt(i);
            for(int j=1;j<arr.length;j++){
               if(i>arr[j].length() || arr[j].charAt(i)!=ch){
                    return arr[0].substring(0,i);
               }
            }
        }
        return arr[0];
    }
    public static void main(String args[]){
        String[] strArr={"akash","akah","akash"};
        String prefixStr=prefixString(strArr);
        System.out.println(prefixStr);
       
    }
}