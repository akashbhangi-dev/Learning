package DSA.Recursion;
public class Day24 {
    public static boolean word(int r ,int c ,String str ,int idx ,char mat[][]){
        int n = mat.length;

      
        
        if(r < 0 || c < 0  || r >= n || c >= n || mat[r][c] == '*') return false;

        if(  mat[r][c] != str.charAt(idx)) return false;

        idx++;
        
        if(idx == str.length()){
            return  true;
        }
       
        char ch=mat[r][c];
        mat[r][c] = '*';

        boolean found = word(r + 1 , c , str , idx , mat) ||
                        word(r - 1 , c , str , idx , mat) ||
                        word(r , c + 1 , str , idx , mat) ||
                        word(r , c - 1, str , idx , mat);

        mat[r][c] = ch;
        return found;
    }
    public static void main(String[] args) {
        char mat[][]={
            {'A','B','C'},
            {'D','E','F'},
            {'G','H','I'}
        };
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(word(i,j,"HI",0,mat)){
                    System.out.println("String found starting at (" + i + ", " + j + ")");
                }
            }
        }
    }
}
