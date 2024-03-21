public class Main {
    private int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] != newColor)  {
            dfs(image, sr, sc, image[sr][sc], newColor);
        }
        return image;
    }

    private void dfs(int[][] image, int row, int column, int color, int newColor) {
        if (row < 0 || row >= image.length || column < 0 || column >= image[0].length || image[row][column] != color) {
            return;
        }

        image[row][column] = newColor;

        for (int[] direction : DIRECTIONS) {
            dfs(image, row + direction[0], column + direction[1], color, newColor);
        }
    }
}