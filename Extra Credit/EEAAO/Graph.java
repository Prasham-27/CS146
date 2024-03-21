import java.util.ArrayList;

public class Graph {
    private ArrayList<ArrayList<Integer>> adjList;
    private int V;
    
    // Initialize a graph with V vertices
    Graph(int V) {
        this.V = V;
        adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add an edge from src to dest
    void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
    }

    int[][] adjacencyListToMatrix() {
        int[][] matrix = new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int dest : adjList.get(i)) {
                matrix[i][dest] = 1;
            }
        }
        return matrix;
    }

    ArrayList<ArrayList<Integer>> adjacencyMatrixToList(int[][] matrix) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < V; j++) {
                if (matrix[i][j] == 1) list.add(j);
            }
            adjList.add(list);
        }
        return adjList;
    }

    Graph reverseEdges() {
        Graph reverseGraph = new Graph(V);
        for (int i = 0; i < V; i++) {
            for (int dest : adjList.get(i)) {
                reverseGraph.addEdge(dest, i);
            }
        }
        return reverseGraph;
    }
}
