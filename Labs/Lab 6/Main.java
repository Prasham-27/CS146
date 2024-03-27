import java.util.*; 
public class Main {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++)
            graph[i] = new ArrayList<Integer>();
    
        boolean[] visited = new boolean[numCourses];
        boolean[] stack = new boolean[numCourses];
        for(int i=0; i<prerequisites.length;i++)
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
    
        for(int i=0; i<numCourses; i++) {
            if(!visited[i] && isCyclic(i, visited, stack, graph)) 
                return false;
        }
        return true;
    }
    private boolean isCyclic(int v, boolean[] visited, boolean[] stack, ArrayList<Integer>[] graph) {
        if(stack[v])
            return true;
        if(visited[v])
            return false;
        visited[v] = true;
        stack[v] = true;
        for(int i=0; i<graph[v].size(); i++) {
            if(isCyclic(graph[v].get(i), visited, stack, graph))
                return true;
        }
        stack[v] = false;
        return false;
    }
}