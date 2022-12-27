package com.vishwaraj.OldFiles.LC.src.Explore.MayLeetCodingChallenge.Week2;

import java.util.Arrays;

public class May11 {

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        May11 s = new May11();
        System.out.println(Arrays.deepToString(s.floodFill(image, 1, 1, 2)));
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) {
            dfs(image, sr, sc, newColor, color);
        }

        return image;
    }

    private void dfs(int[][] image, int row, int col, int newColor, int color) {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] == newColor
                || image[row][col] != color) {
            return;
        }

        image[row][col] = newColor;

        dfs(image, row + 1, col, newColor, color);
        dfs(image, row - 1, col, newColor, color);
        dfs(image, row, col + 1, newColor, color);
        dfs(image, row, col - 1, newColor, color);

    }

}
