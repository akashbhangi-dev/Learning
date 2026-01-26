class CheckSorted{
    public boolean isSorted(int array[]){
        for(int i=1;i<array.length;i++){
            if(array[i]<array[i-1]){
                return false;
            }
        }
        return true;
    }
}
public class Day3 {
    public static void main(String[] args) {
        CheckSorted cs=new CheckSorted();
        int array1[]={1,2,3,4,5};
        int array2[]={3,5,2,1,4};
        System.out.println("IS array1 sorted? "+cs.isSorted(array1));
        System.out.println("Is array2 sorted? "+cs.isSorted(array2));
    }
}