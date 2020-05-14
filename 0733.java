class Solution {
    private void helper(int[][] image, int r, int c, int n, int o) {
        if (0 <= r && r < image.length 
           && 0 <= c && c < image[0].length 
           && image[r][c] == o) {
            image[r][c] = n;
            helper(image, r+1, c, n, o);
            helper(image, r-1, c, n, o);
            helper(image, r, c+1, n, o);
            helper(image, r, c-1, n, o);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        int oldColor = image[sr][sc];
        helper(image, sr, sc, newColor, oldColor);
        return image;
    }
}
