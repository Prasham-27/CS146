1) Converting an adjacency list to an adjacency matrix:
   An adjacency matrix is a 2D matrix of size V x V (where V is the number of vertices) such that the entry at i-th row and j-th column is 1 if there is an edge between vertex 'i' and 'j', 0 otherwise. An adjacency list is an array of linked lists where i-th linked list contains the nodes that are adjacent to the i-th node.

    Pseudocode:
    - Initialize a 2D matrix of V x V with all entries as 0. (Call it adjMatrix)
    - For each list in the adjacency list:
        - For each node in the list:
            - Set adjMatrix[i][node] as 1, where 'i' is the index of the list and 'node' is the value of the node in the list.

2) Converting an adjacency matrix to an adjacency list:
    Pseudocode:
    - Initialize an array of lists (Call it adjList) of size V.
    - For each 'i' from 0 to V:
        - For each 'j' from 0 to V:
            - If adjMatrix[i][j] equals 1 then adjList[i].add(j).

3) Reversing the direction of each edge in a directed graph:
    Pseudocode:
    - Initialize an empty graph (Call it reverseGraph) with V vertices.
    - For each 'i' from 0 to V:
        - For each node adjacent to 'i':
            - Add an edge from 'node' to 'i' in the reverseGraph.
