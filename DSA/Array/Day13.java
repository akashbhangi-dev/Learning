//Best Time to Buy and Sell Stock
public class Day13{
    public static int maxProfitOptimised(int arr[]){
        if(arr.length==0){
            return 0;
        }

        int minValue=Integer.MAX_VALUE;;
        int maxProfit=0;

        for(int currentValue:arr){

            if(currentValue<minValue){
                minValue=currentValue;
            }

            else{
                int profit=currentValue-minValue;
                if(maxProfit<profit){
                    maxProfit=profit;
                }
            }
        }

        return maxProfit;
    }
    public static void main (String[]args){
        int[] arr1={7,1,5,3,6,4};
        int [] arr2={12,5,9,8,5,6};

        System.out.println("Maximum Profit produced:"+maxProfitOptimised(arr1));
        System.out.println("Maximum Profit produced:"+maxProfitOptimised(arr2));
    }
}