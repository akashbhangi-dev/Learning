//Basic operations on 2D array
import java.util.Scanner;

public class Day19 {
    public static int maxValueIn2DArray(int matrix[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j]; 
                }
            }
        } return max;
    }

    public static int minValueIn2DArray(int matrix[][]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j]; 
                }
            }
        } 
        return min;
    }
    public static void insertIn2DArray(int matrix[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }

    public static void  print2DArray(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" "); 
            }
            System.out.println(); 
        }
    }

    public static boolean searchIn2DArray(int matrix[][],int target){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();

        System.out.print("Enter the number of columns:");
        int m=sc.nextInt();

        int matrix[][]=new int[n][m];

        insertIn2DArray(matrix);
        print2DArray(matrix);

        System.out.println("Max value: "+maxValueIn2DArray(matrix));
        System.out.println("Min value: "+minValueIn2DArray(matrix));

        System.out.print("Enter the target value to search:");
        sc.nextLine();

        int target=5; 
        if(searchIn2DArray(matrix, target)){ 
            System.out.println(target+" found in the matrix.");
        }
        else{
            System.out.println(target+" not found in the matrix.");
        }
        sc.close();
   }
}