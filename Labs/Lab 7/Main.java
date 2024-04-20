public int findTheCity(int n, int[][] edges, int distanceThreshold) {
    int[][] distances = new int[n][n];
    for (int i = 0; i < n; i++) {
        Arrays.fill(distances[i], 10001); // Large value for 'infinity'
        distances[i][i] = 0; // Distance to itself is 0
    }

    // Initial distances
    for (int[] edge : edges) {
        distances[edge[0]][edge[1]] = edge[2];
        distances[edge[1]][edge[0]] = edge[2]; // Bidirectional 
    }

    // Floyd-Warshall
    for (int k = 0; k < n; k++) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distances[i][j] = Math.min(distances[i][j], distances[i][k] + distances[k][j]);
            }
        }
    }

    int minCount = n; 
    int idealCity = 0;
    for (int i = 0; i < n; i++) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (i != j && distances[i][j] <= distanceThreshold) {
                count++;
            }
        }
        if (count <= minCount) {
            minCount = count;
            idealCity = i;
        }
    }

    return idealCity;
}
