def levelOrder(self, root):
    if not root:
        return []

    result, current_level = [], [root]
    while current_level:
        result.append([node.val for node in current_level])
        current_level = [child for node in current_level for child in (node.left, node.right) if child]
    return result