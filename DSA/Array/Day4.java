//Moving all zeros present in a array at end.

public class Day4 {
    public static void moveBruteForce(int nums[]){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
            }
            nums[nums.length-1]=0;
        }
          for(int i:nums){
            System.out.print(i+" ");
        } 
    }

    public static void main (String args[]){
        int array1[]={0,2,0,3,12};
        int array2[]={10,0,5,0,0,18};
        System.out.println("Move Zero through Brute Force approach :");
        moveBruteForce(array1);
        
    }
}
