import heapq

def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
    graph = collections.defaultdict(list)
    for i in range(n):
        graph[0].append((wells[i], i + 1))  # Connect virtual node to houses
    for house1, house2, cost in pipes:
        graph[house1].append((cost, house2))
        graph[house2].append((cost, house1))

    visited = set()
    totalCost = 0
    pq = [(0, 0)]  # Priority queue: (cost, house)

    while len(visited) < n + 1:
        cost, house = heapq.heappop(pq)
        if house in visited:
            continue
        visited.add(house)
        totalCost += cost

        for next_cost, neighbor in graph[house]:
            heapq.heappush(pq, (next_cost, neighbor))

    return totalCost
