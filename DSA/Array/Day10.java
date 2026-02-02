//A array is given with n number of objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
//  with the colors in the order red, white, and blue.


public class Day10 {
    public static void sortColorNormalApproach(int arr[]){
        int count0=0;
        int count1=0;
        int count2=0;

        for(int num :arr){
            if(num==0){
                count0++;
            }
            else if(num==1){
                count1++;
            }
            else{
                count2++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(count0>0){
                arr[i]=0;
                count0--;

            }
            else if(count1>0){
                arr[i]=1;
                count1--;
            }
            else{
                arr[i]=2;
                count2--;
            }

        }
    }
    public static void sortColorWithDutchNAtionalAlgorithm(int arr[]){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;          
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void swap(int arr[],int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String []args){
        System.out.println("Sorting colors in an array:");

        int arr[]={2,0,1,0,2,1,2,1};

        System.out.println("Using Normal Approach:");
        sortColorNormalApproach(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }

        System.out.println();
        int arr2[]={2,0,1,0,2,1,2,1};

        System.out.println("Using Dutch National Algorithm:");
        sortColorWithDutchNAtionalAlgorithm(arr2);
        for(int num:arr2){
            System.out.print(num+" ");
        }

    }
}
