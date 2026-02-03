//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

import java.util.HashMap;

public class Day11 {

    public static int majorityElementOptimal(int arr[]){
        int count=0;
        int candidate=-1;

        for(int i=0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
            }
            if(arr[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }

    public static int majorityElementUsingMap(int arr[]){
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        int majorityCount=arr.length/2;

        for(Integer key:map.keySet()){

            if(map.get(key)>majorityCount){
                return key;
            }
        }    

        return -1;
    }
    public static int majorityElement(int arr[]){
        int prevCount=0;
        int Value=0;

        for(int i=0;i<arr.length;i++){

            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>prevCount){
                prevCount=count;
                Value=arr[i];
            }
        }
        return Value;
    }

  
    public static void main (String []args){
        int arr[]={2,0,2,1,1,1,2,2,2,2,2};

        System.out.println("Majority Element is: "+majorityElement(arr));
        System.out.println("Majority Element using HashMap approach is: "+majorityElementUsingMap(arr));
        System.out.println("Majority Element using Optimal approach is: "+majorityElementOptimal(arr));
}}
