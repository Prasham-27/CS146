from collections import deque

# Kahn's Algorithm
def kahns_algorithm(graph, vertices):
    indegree = [0] * vertices
    top_order = []
    # calculate indegree of all vertices
    for i in graph.values():
        for j in i:
            indegree[j] += 1
    # find all vertices with zero indegree
    zero_indegree = deque([i for i, j in enumerate(indegree) if j == 0])
    while zero_indegree:
        vertex = zero_indegree.popleft()
        top_order.append(vertex)
        # reduce indegree of all adjacent vertices
        for i in graph.get(vertex, []):
            indegree[i] -= 1
            # check if indegree became zero
            if indegree[i] == 0:
                zero_indegree.append(i)
    if len(top_order) == vertices:
        return top_order
    else:
        return []

# BFS
def bfs(graph, start):
    visited, queue = [], deque([start])
    while queue:
        vertex = queue.popleft()
        if vertex not in visited:
            visited.append(vertex)
            queue.extend([i for i in graph[vertex] if i not in visited])
    return visited

# DFS
def dfs(graph, start):
    visited, stack = [], [start]
    while stack:
        vertex = stack.pop()
        if vertex not in visited:
            visited.append(vertex)
            stack.extend([i for i in graph[vertex] if i not in visited])
    return visited

# defining the graph and vertices
graph = {0: [1, 2], 1: [3, 4], 2: [], 3: [], 4: []}
vertices = 5

print("Kahn's algorithm:", kahns_algorithm(graph, vertices))
print("BFS:", bfs(graph, 0))
print("DFS:", dfs(graph, 0))
