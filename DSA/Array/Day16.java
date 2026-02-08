//Longest Consecutive Sequence
import java.util.HashSet;

public class Day16 {

    public static int LongestConsecutiveSequenceBruteForce(int arr[],int n){
        //[100,4,102 ,1,3,2]
        int longestSeqLength=0;
        for(int num:arr){
            int current=num;
            int count=1;

            while(contains(arr,current+1)){
                current++;
                count++;
            }
            longestSeqLength=Math.max(count, longestSeqLength);
        }
        return longestSeqLength;
    }

    public static boolean contains(int arr[],int target){
           for(int num:arr){
                if(num==target){
                    return true;
                }
           }
        return false;
    }

    public static int LongestConsecutiveSequenceOptimised(int arr[],int n){
        //[100,4,102 ,1,3,2]
        if(n==0){
            return 0;
        }

        int longestSeqLength=0;
        HashSet<Integer>set=new HashSet<>();
       
        for(int num:arr){
            set.add(num);
        }
        //[1,2,3,4,100,102]
        for(int num:arr){
            if(!set.contains(num-1)){
                int current=num;
                int count=1;

                while(set.contains(current+1)){
                     current++;
                     count++;
                }
                longestSeqLength=Math.max(longestSeqLength,count);
            }
        }

        return longestSeqLength;
    }   
    public static void  main (String[] args){
        int arr[]={100,4,102 ,1,3,2};
        int n=arr.length;       

        System.out.println("Longest Consecutive Sequence Length Brute Force:"+LongestConsecutiveSequenceBruteForce(arr,n));
        System.out.print("Longest Consecutive Sequence Length By Optimised:"+LongestConsecutiveSequenceOptimised(arr,n));
       
    }
}
