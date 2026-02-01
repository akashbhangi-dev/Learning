//Two Sum (Pair sum Problem).
import java.util.HashMap;
public class Day9 {
    public static int[] twoSum(int arr[],int target){

        //Map to store 'Number:index'
        HashMap <Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];

            git reset HEAD <file>
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

            //If not,then we will add to the memory.
            map.put(arr[i],i);
        }
        //No paired numbers obtain then return empty array.
        return new int[] {};
    }
    public static void main (String [] args){
        int arr1[]={ 2, 5, 7, 12, 15 };
        int target=9;

        int arrIndex[]=twoSum(arr1, target);

        System.out.print("Index of Paired numbers to get target:");
        for(int idx:arrIndex){
            System.out.print(" "+idx);
        }

    }
    
}
