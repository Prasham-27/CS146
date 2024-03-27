- This problem can be solved by checking for a cycle in a Directed Graph. If there exists a cycle in Graph, then it is a deadlock situation (i.e., to take a course A you have to first take B, but to take course B you first have to take A).

- For this purpose, we create a Graph, where each course points to its prerequisites. 

- Then we will run a Depth First Search (DFS) from every unvisited node. 

- During running the DFS, we will keep a track of visited nodes in two arrays i.e., visited[] and inStack[]. If a given node is reaching itself during the DFS, then there exists a cycle. 

- In this situation, it indicates that there exists a deadlock.

- If there is no cycle in the Graph for all the nodes, then return true. 

- So basically we are looking for a back edge in DFS traversal.
