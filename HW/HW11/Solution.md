Using Depth First Search:
- We keep track of the original color of the starting pixel.
- Then, with the help of Depth First Search, we traverse to each of the 4-directionally connected pixels.
- For each new pixel, we check if the color is the same as our starting pixel's original color. If yes, we change its color to the new color, if no we just skip it.
- During the recursion, we also take care that we neither overflow the array, nor we visit the same pixel more than once to avoid an infinite loop.
