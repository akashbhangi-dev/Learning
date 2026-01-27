//Moving all zeros present in a array at end.

public class Day4 {
    //Brute Force Approach-O(N^2)
    public static void moveZerosBruteForce(int nums[]){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
            }
            nums[nums.length-1]=0;
        }
       
    }
    //Optimal Approach-O(N)
    public static void moveZerosOptimal(int nums[]){
        int nonZeroIndex=0;

        //Here we are shifting all non zero elements front of array.
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex]=nums[i];
                nonZeroIndex++;
            }
        }

        //filling remaining array elements with zero.
        while(nonZeroIndex < nums.length){
            nums[nonZeroIndex]=0;
            nonZeroIndex++;
        }
    }

    public static void main (String args[]){
        int array1[]={0,2,0,3,12};
        int array2[]={10,0,5,0,0,18};

        //Brute Force Approach
        System.out.println("Move Zero through Brute Force approach :");
        moveZerosBruteForce(array1);
        for(int i:array1){
            System.out.print(i+" ");
        } 

        System.out.println();

        //Optimal Approach
        System.out.println("Move Zero through Optimal Force approach :");
        moveZerosOptimal(array2);
        for(int i:array2){
            System.out.print(i+" ");
        } 
    }
}
