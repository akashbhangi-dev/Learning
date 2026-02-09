//Sum of SubArrays Equal to K
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
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int k=5;
        System.out.println(SumOfSubArraysEqualTOK(arr, k));
      

    }
}
