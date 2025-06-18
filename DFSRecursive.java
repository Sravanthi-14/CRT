import java.util.*;
public class DFSRecursive {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    private Set<Integer> visited = new HashSet<>();
    public void addEdge(int src, int dest) {
        graph.putIfAbsent(src, new ArrayList<>());
        graph.putIfAbsent(dest, new ArrayList<>());
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }
    public void dfs(int node) {
        if (visited.contains(node)) return;
        System.out.print(node + " ");
        visited.add(node);
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            dfs(neighbor);
        }
    }
    public static void main(String[] args) {
        DFSRecursive dfsGraph = new DFSRecursive();
        dfsGraph.addEdge(0, 1);
        dfsGraph.addEdge(0, 2);
        dfsGraph.addEdge(1, 3);
        dfsGraph.addEdge(1, 4);
        dfsGraph.addEdge(2, 5);
        dfsGraph.addEdge(2, 6);
        System.out.println("DFS Traversal starting from node 0:");
        dfsGraph.dfs(0);
    }
}
