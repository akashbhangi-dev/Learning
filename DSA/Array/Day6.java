//Remove Duplicates from Sorted Array
public class Day6 {
    public static int removeDuplicates(int arr[]){
        int n=arr.length;
        
        int j=0;//j is a Anchor variable

        for(int i=1;i<n;i++){ //i is the explorer variable
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;//return new Length
    }
    public static void main (String []args){
        int arr[]={1,2,2,3,4,4,5};
            
        System.out.print("Original Array:");
        for(int i:arr){
            System.out.print(" "+i);
        }

        System.out.println();

        int newlength=removeDuplicates(arr);
        System.out.print("Array after removing duplicates:");
        for(int k=0;k<newlength;k++){
            System.out.print(" "+arr[k]);
        }
    }
}
