def canFinish(numCourses, prerequisites):
    G = {i:[] for i in range(numCourses)}
    for course, pre in prerequisites:
        G[course].append(pre)
    visited = [0]*numCourses
    def dfs(course):
        visited[course] = 1
        for pre in G[course]:
            if visited[pre] == 1: return True
            if visited[pre] == 0: 
                if dfs(pre): return True
        visited[course] = 2
        return False
    for course in range(numCourses):
        if visited[course] == 0:
            if dfs(course): return False
    return True