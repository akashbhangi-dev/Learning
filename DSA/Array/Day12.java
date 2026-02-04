//Find the starting and ending index of the maximum sub array sum using Kadanes Algorithum.
public class Day12 {
    public static int[] maxSubArrayIndexReturn(int arr[]){
      int maxSumValue=Integer.MIN_VALUE;
        int startIndex=0;
        int endIndex=0;
        int currentSum=0;
        int tempStart=0;
        for(int i=0;i<arr.length;i++){
               
            currentSum+=arr[i];

            if(currentSum>maxSumValue){
                maxSumValue=currentSum;
                startIndex=tempStart;
                endIndex=i;
            }

            if(currentSum<0){
                currentSum=0;
                tempStart=i+1;
            }
        }
        return new int []{startIndex,endIndex};
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int indexArray[]=maxSubArrayIndexReturn(arr);
        int startIndex=indexArray[0];
        int endIndex=indexArray[1];
        System.out.println("Start Index: "+startIndex+" and End Index: "+endIndex);
        System.out.println("Maximum Sub Array is: ");
        for(int i=startIndex;i<=endIndex;i++){
            System.out.print(arr[i]+" ");
    }
 }
}
