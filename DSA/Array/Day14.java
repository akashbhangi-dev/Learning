//Rearrange Array Elements by Sign
public class Day14 {
    
    public static void rearrangeOptimsiedWay1(int arr[]){
        int i=0;//tracking even index
        int j=1;//tracking odd index
        for(int k=0;k<arr.length;k++){
            if(k%2==0){
                if(arr[k]>0){
                    i=i+2;
                }
                else{
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    k--;
                }
            }
            else{
                if(arr[k]<0){
                    j=j+2;
                }
                else{
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    k--;
                }
            }
        }
    }
    public static int[] rearrangeBruteForce(int arr[]){
        int pos=0;
        int neg=1;
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos=pos+2;
            }
            else{
                ans[neg]=arr[i];
                neg=neg+2;
            }
        }
        return ans;
    }
    public static void main (String []args){

        int arr[]={3,1,-2,4,-5,-8,9,-10};

        int ans[]=rearrangeBruteForce(arr);
        for(int i:ans){
            System.out.print(" "+i);
        } 

        rearrangeOptimsiedWay1(arr);
        System.out.println();
        for(int i:arr){
            System.out.print(" "+i);
        }
    }
}   

    
    

