1. We recursively invert the smallest subtrees first. 
2. We reach the smallest subtree by journeying as far as possible along the same path, or by looking at the same level of nodes most of the time. So we go to the bottom of the tree.
3. When we invert subtrees at a lowest level, we then invert the next higher level of subtrees where the previously inverted subtrees are the leaves, and we build the inverted tree bottom up.

In the method `invertTree()`, we first check if the root is `null` - if it is, we just return it. This is the case of a leaf node and acts as the base case for our recursion.

If the root is not `null`, we apply the method `invertTree()` to the `left` and `right` children. After that, we swap the `left` and `right` children.

The recursion then pops back up to the higher levels of the tree and by the time the execution gets back to the root node, the whole tree has been inverted.
