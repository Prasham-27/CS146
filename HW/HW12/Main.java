public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
    // Create a list to store all edges (both wells and pipes)
    List<int[]> edges = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        edges.add(new int[]{0, i + 1, wells[i]}); // Connect virtual node '0' to houses
    }
    edges.addAll(Arrays.asList(pipes));

    // Sort edges by cost (ascending)
    Collections.sort(edges, Comparator.comparingInt(a -> a[2]));

    // Union-Find for tracking connected components
    UnionFind uf = new UnionFind(n + 1); // Include the virtual node

    int totalCost = 0;
    for (int[] edge : edges) {
        int house1 = edge[0], house2 = edge[1], cost = edge[2];
        if (uf.union(house1, house2)) {
            totalCost += cost;
        }
    }
    return totalCost;
}
class UnionFind {
    private int[] root; // Stores the root of each component (house) 
    private int[] rank; // Stores the rank (tree height) of each component

    public UnionFind(int size) {
        root = new int[size];
        rank = new int[size];
        // Initialize each house as its own component
        for (int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 1; 
        }
    }

    // Find the root of a component (house)
    public int find(int x) {
        if (x == root[x]) {
            return x;
        }
        // Path compression optimization: Update the root as we traverse
        return root[x] = find(root[x]);
    }

    // Union two components by merging the trees
    public boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            // Merge based on rank for optimization
            if (rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                root[rootX] = rootY;
            } else {
                root[rootY] = rootX;
                rank[rootX] += 1;
            }
            return true; // Successfully merged
        } else {
            return false; // Already belong to the same component
        }
    }
}
