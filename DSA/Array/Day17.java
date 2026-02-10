//Sum of SubArrays Equal to K
import java.util.HashMap;
public class Day17 {
    public static int SumOfSubArraysEqualTOK(int arr[],int k){
        if(arr.length==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=i;j<arr.length;j++){
                currentSum+=arr[j];
                if(currentSum==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static int SumOfSubArraysEqualTOKOptimised(int arr[],int k){
        if(arr.length==0){
            return 0;
        }
        int count=0;
        int currentSum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(map.containsKey(currentSum-k)){
                count+=map.get(currentSum-k);
            }
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }
        return count;   
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int k=5;
        System.out.println("BruteForce: "+SumOfSubArraysEqualTOK(arr, k));
        System.out.println("Optimised: "+SumOfSubArraysEqualTOKOptimised(arr, k));
      

    }
}
