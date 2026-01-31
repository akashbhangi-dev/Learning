import java.util.ArrayList;
import java.util.Arrays;

public class Day8 {
    //Union of two sorted arrays
    public static int[] union(int arr1[],int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        ArrayList<Integer> unionList=new ArrayList<>();
        int i=0,j=0;
        System.out.print("Union of two arrays:");
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                unionList.add(arr1[i]);
                i++;
            }
            else if(arr2[j]<arr1[i]){
                unionList.add(arr2[j]);
                j++;
            }
            else{
                unionList.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<n1){
            if(arr1[i-1]!=arr1[i]){
                unionList.add(arr1[i]);
            }
            i++;
        }
        while(j<n2){
            if(arr2[j-1]!=arr2[j]){
                unionList.add(arr2[j]);
            }
            j++;
        }
        int[] result = new int[unionList.size()];
        for(int k=0;k<unionList.size();k++){
            result[k] = unionList.get(k);
        }
        return result;
    }

    //Intersection of two sorted arrays
    public static int[] intersection(int arr1[],int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        ArrayList<Integer> intersectionList=new ArrayList<>();
        int i=0,j=0;
        System.out.print("Intersection of two arrays:");
        while(i<n1 && j<n2){

            if(arr1[i]<arr2[j]){
                i++;
            }

            else if(arr2[j]<arr1[i]){
                j++;
            }

            else{
                intersectionList.add(arr1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[intersectionList.size()];
        for(int k=0;k<intersectionList.size();k++){
            result[k] = intersectionList.get(k);
        }
        return result;
    }
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 5};
        int arr2[] = { 2, 4, 5, 6};

        int unionArray[] = union(arr1,arr2);
        System.out.println("Union array: " + Arrays.toString(unionArray));

        int intersectionArray[] = intersection(arr1,arr2);
        System.out.println("Intersection array: " + Arrays.toString(intersectionArray));
    }
}