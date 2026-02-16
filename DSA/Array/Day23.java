// Trapping Rain water (Brute Force).

class Day23 {
    public static int rainwater(int arr[]){
        int count=0;
        for(int i=1;i<arr.length-1;i++){
            int leftMax=maxArray(0,i,arr);
            int rightMax=maxArray(i,arr.length-1,arr);
            
            int minimum=Math.min(leftMax,rightMax);
            count+=minimum-arr[i];
        }
        return count;
    }
    
    public static int maxArray(int si,int ei,int arr[]){
        int max=0;
        for(int i=si;i<=ei;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int arr1[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int arr2[]={4,2,0,3,2,5};
        System.out.println("Number of units of rainwater:"+rainwater(arr1));
        System.out.println("Number of units of rainwater:"+rainwater(arr2));
    }
}