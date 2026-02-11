import java.util.HashMap;;
public class Day18 {
    public static int countSubArraySumEqualtoK(int arr[],int n,int k){
        int count=0;
        int prefixArr[]=new int[n];

        prefixArr[0]=arr[0];

        for(int i=1;i<n;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            if(prefixArr[i]==k){
                count++;
            }

            int diff=prefixArr[i]-k;
            if(map.containsKey(diff)){
                count=count+map.get(diff);
            }
            
            map.put(prefixArr[i],map.getOrDefault(prefixArr[i],0)+1);
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int k=5;

        System.out.println("Count of SubArrays with sum equal to K: "+countSubArraySumEqualtoK(arr, n, k));
    }
    
}
