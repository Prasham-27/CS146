def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
    distances = [[float('inf')] * n for _ in range(n)]
    for i in range(n):
        distances[i][i] = 0

    for u, v, w in edges:
        distances[u][v] = distances[v][u] = w

    # Floyd-Warshall
    for k in range(n):
        for i in range(n):
            for j in range(n):
                distances[i][j] = min(distances[i][j], distances[i][k] + distances[k][j])

    min_count = n
    ideal_city = 0
    for i in range(n):
        count = sum(d <= distanceThreshold for d in distances[i] if d != 0)  # Exclude distance to self
        if count <= min_count:
            min_count = count
            ideal_city = i

    return ideal_city 
