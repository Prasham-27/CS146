class Solution(object):
    def invertTree(self, root):
        if root is None:
            return None

        right = self.invertTree(root.right)
        left = self.invertTree(root.left)
        root.left, root.right = right, left

        return root
