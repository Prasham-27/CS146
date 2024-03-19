1) We need to check if the left child of each node has a value that's less than its parent node's value and the right child of each node has a value that's greater than its parent node's value in the Binary Tree.

2) We can perform the above task by following either an iterative approach or recursive approach.

3) In the recursive approach, we initially set lower bound as negative infinity and upper bound as positive infinity and then for each node we update these bounds.

4) In in-order traversal, we keep track of the previously visited node and check if it violates the BST property. 

5) We adjust these bounds as we go by setting the root's value as new bound while traversing left or right.

6) If any node's value is not within these bounds we return false.

7) If we reach a null node (leaf node) in the traversal, we return true as it is the base case for end point nodes or root with no subtree.

8) If we traverse all nodes following the above rules, BST is valid. If we find a rule is violated for any node, BST is not valid.
