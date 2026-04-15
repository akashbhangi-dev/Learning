package DSA.Recursion;

public class Day25 {
 public static boolean checkCondition(char mat[][], int r, int c){

    for(int i = 0; i < mat.length;i++){
        if(mat[r][i] == 'Q'){
            return false;
        }
    }
    for (int i = 0; i < mat.length; i++){
        if(mat[i][c] == 'Q')
            return false;
    }
    
    for (int i = r-1, j = c-1; i >= 0 && j >= 0; i--, j--){
        if(mat[i][j] == 'Q')
            return false;
    }

    for (int i = r-1, j = c+1; i >= 0 && j < mat.length; i--, j++){
        if(mat[i][j] == 'Q')
            return false;
    }

    return true;
}
    public static void nQueen(char mat [][], int r){

        if( r >= mat.length){
            for (int i = 0; i < mat.length; i++ ){
                for(int j = 0; j < mat[0].length ; j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for( int i = 0; i < mat.length; i++){
            if(checkCondition(mat, r, i )) {
                mat[r][i] = 'Q';
                nQueen(mat, r + 1);
                mat[r][i] = '.';
            }
        }

    }
    public static void main (String args[]){
        char mat[][] = new char [4][4];
      
        for (int i = 0; i < mat.length; i++ ){
            for(int j = 0; j < mat[0].length ; j++){
                mat[i][j] = '.';
            }
        }

        nQueen(mat, 0  );

        for (int i = 0; i < mat.length; i++ ){
            for(int j = 0; j < mat[0].length ; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        

       
    }
}
