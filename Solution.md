We can use the breadth-first search algorithm here. Use a queue to handle the nodes in a level by level manner; after pushing a node to the queue, continue to push its left and right child nodes to the end of the queue. In each step, pop a node from the front of the queue, get its value, and keep trying to push its children nodes. The process stops when the queue becomes empty. 