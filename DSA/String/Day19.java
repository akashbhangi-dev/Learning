package DSA.String;

public class Day19 {
    public static int compressString(char arr[]){
        int n = arr.length;
        int index = 0;

        
        for(int i = 0; i < n; i++){
            int count = 1;

            while(i < n-1 && arr[i] == arr[i+1]){
                i++;
                count++;
            }

            arr[index++] = arr[i];

            if(count>1){
                int start = index;

                while(count>0){
                    arr[index++] = (char) ('0' + (count % 10));
                    count /= 10;
                }

                reverse(arr,start,index-1);

            }

        }
        return index;
    }
    
    public static void reverse(char arr[], int si, int ei){
        
        while(si<ei){
            char temp = arr[si];
            arr[si++] = arr[ei];
            arr[ei--] = temp;
        }
    }

    public static void main(String[] args) {
        String str = "aaabbbcccc";
        char arr[]=str.toCharArray();

        int newLength = compressString(arr);
        
        for(int i = 0; i < newLength; i++){

            System.out.print(arr[i]);
        }
        
    }



}
