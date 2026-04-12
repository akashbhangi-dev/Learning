package DSA.Recursion;

public class Day23 {

    public static void floodFill(int[][] grid, int sr, int sc, int newColor, int originalColor) {

        if (sr < 0 || sc < 0 || sr >= grid.length || sc >= grid[0].length) {
            return;
        }

        if (grid[sr][sc] != originalColor) {
            return;
        }

        grid[sr][sc] = newColor;

        floodFill(grid, sr - 1, sc, newColor, originalColor);
        floodFill(grid, sr + 1, sc, newColor, originalColor);
        floodFill(grid, sr, sc - 1, newColor, originalColor);
        floodFill(grid, sr, sc + 1, newColor, originalColor);
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int sr = 1, sc = 1;
        int newColor = 2;

        int originalColor = grid[sr][sc];

        if (originalColor != newColor) {
            floodFill(grid, sr, sc, newColor, originalColor);
        }

        for (int[] row : grid) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}