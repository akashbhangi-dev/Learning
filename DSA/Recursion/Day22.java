package DSA.Recursion;

public class Day22 {

    public static void maizePath(int r, int c,int mat[][], String ans){
        int n=mat.length;

        if(r < 0 || c < 0 || r >= n || c >= n || mat[r][c] == 0 || mat[r][c] == -1){
            return;
        }

        if(r == n-1 && c == n-1){
            System.out.println(ans);
            return;
        }

        mat[r][c]=-1;

        maizePath(r+1, c, mat, ans+'D');
        maizePath(r, c+1, mat, ans+'R');
        maizePath(r, c-1, mat, ans+'L');
        maizePath(r-1, c, mat, ans+'U');

        mat[r][c]=1;
    }
    
    public static void main(String args[]){
        int[][] mat = {{1, 0, 1}, {1, 1, 0}, {1, 1, 1}};
        maizePath(0 , 0 , mat ,"");
    }
}
