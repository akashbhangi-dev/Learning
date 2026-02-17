public class Day24 {
    public static int rainwaterOptimised(int height[]){
        if(height.length==0){
            return 0;
        }

        int waterTraped=0;
        int left=0;
        int right=height.length-1;
        int leftMax=0,rightMax=0;

        while(left<=right){
            if(leftMax<rightMax){
                if(height[left]>leftMax){
                    leftMax=height[left];
                }
                else{
                    waterTraped+=leftMax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>rightMax){
                    rightMax=height[right];
                }
                else{
                    waterTraped+=rightMax-height[right];
                }
                right--;
            }
        }
        return waterTraped;
    }
    public static void main(String[] args) {
        int height1[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int height2[]={4,2,0,3,2,5};
        System.out.println("Number of units of rainwater:"+rainwaterOptimised(height1));
        System.out.println("Number of units of rainwater:"+rainwaterOptimised(height2));
    
    }
}
