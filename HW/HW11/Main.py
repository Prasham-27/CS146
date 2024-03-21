class Solution:
    def floodFill(self, image, sr, sc, newColor):
        color = image[sr][sc]
        if color == newColor: 
            return image
        def dfs(r, c):
            if image[r][c] == color:
                image[r][c] = newColor
                if r >= 1: dfs(r-1, c)
                if r+1 < len(image): dfs(r+1, c)
                if c >= 1: dfs(r, c-1)
                if c+1 < len(image[0]): dfs(r, c+1)

        dfs(sr, sc)
        return image