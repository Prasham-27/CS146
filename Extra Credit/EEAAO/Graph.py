class Graph:
    def __init__(self, V):
        self.V = V
        self.adjList = [[] for _ in range(V)]

    def addEdge(self, src, dest):
        self.adjList[src].append(dest)

    def adjacencyListToMatrix(self):
        matrix = [[0 for _ in range(self.V)] for _ in range(self.V)]
        for i in range(self.V):
            for dest in self.adjList[i]:
                matrix[i][dest] = 1
        return matrix

    def adjacencyMatrixToList(self, matrix):
        adjList = [[] for _ in range(self.V)]
        for i in range(self.V):
            for j in range(self.V):
                if matrix[i][j] == 1:
                    adjList[i].append(j)
        return adjList

    def reverseEdges(self):
        reverseGraph = Graph(self.V)
        for i in range(self.V):
            for dest in self.adjList[i]:
                reverseGraph.addEdge(dest, i)
        return reverseGraph.adjList