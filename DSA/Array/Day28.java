import java.util.Arrays;
public class Day28 {

    public static String prefixString(String[] arr) {
        if(arr.length == 0){
            return "";
        }
        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length - 1];

        int i = 0;
        while (i < first.length() &&  i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] strArr = {"flower", "flow", "flight"};
        System.out.println(prefixString(strArr)); 
    }
}