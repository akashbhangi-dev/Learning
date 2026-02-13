public class Day20 {
    public static void spiralOrder(int matrix [][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //Left to Right
            for(int j=startCol;j<=endCol;j++){
                System.out.print(" "+matrix[startRow][j]);
            }
            //Top to Bottom
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(" "+matrix[i][endCol]);
            }
            //Right to Left
            for(int j=endCol-1;j>=startCol;j--){
                System.out.print(" "+matrix[endRow][j]);
            }
            //Bottom to Top
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(" "+matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }


    }
    public static void main (String []args){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.print("Spiral order of the matirx is:");
        spiralOrder(matrix);
    }
}
