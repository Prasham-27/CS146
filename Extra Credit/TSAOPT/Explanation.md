1. Importing necessary libraries: We import `collections.deque` in order to use the `deque` data structure, which lets you efficiently add and remove elements from both ends.

2. Kahn's Algorithm: The `kahns_algorithm` function implements Kahn's Algorithm for topological sorting. 

   - First, the function computes the in-degree (number of incoming edges) for each vertex in the graph. This is stored in an array called `indegree`.

   - Next, it creates a `deque` that initially contains all vertices with a in-degree of zero.

   - The while loop continues while there is at least one vertex with in-degree of zero. 
   
     - In each iteration, it deques a vertex and adds it to `top_order` list. 
     
     - Then it updated in-degree for all adjacent vertices of the dequeued vertex. If in-degree of adjacent vertices become zero, then add it to queue.
   
   - After the loop terminates, it checks if the length of `top_order` is equal to the number of vertices, which means all vertices are included in the topological sort order.
   
   - If not, it means there was a cycle in the graph and no valid topological sort exists.


3. BFS: The `bfs` function is roughly analogous to Kahn's algorithm above.
   
   - We start at a given vertex, add it to a queue, and mark it as visited.
   
   - Then, in a loop, we dequeue a vertex and, for all its unvisited neighbors, add them to the queue and mark them as visited, essentially "exploring" the graph in all breadth directions.
   
   - As we visit each vertex, we add it to our list of visited nodes, which will be our output


4. DFS: In the `dfs` function, we are again exploring the graph but in a depth-first style. 

     - We start at a given vertex, add it to a stack, and mark it as visited.
   
     - We then begin a loop that continues as long as our stack is not empty.
   
     - In each iteration, we pop a vertex from the stack. For all its unvisited neighbors, we add them to the stack and mark them as visited. 
   
     - Remember that we are effectively "diving" as far into the graph as we can before "backtracking" and exploring alternate routes.
   

5. Defining the graph and vertices: We define a dictionary (`graph`) where each key-value pair represents a node and its corresponding connected nodes. We also define a list (`vertices`) that contains all the nodes of our graph. These are going to be the inputs for our topological sorting functions.

6. The results of each of the topological sorting approaches are then printed on the screen – for our starting vertex which is node 0 in this case.
