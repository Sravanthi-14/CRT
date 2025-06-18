import java.util.*;
public class ConnectedComponents {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    private Set<Integer> visited = new HashSet<>();
    public void addEdge(int src, int dest) {
        graph.putIfAbsent(src, new ArrayList<>());
        graph.putIfAbsent(dest, new ArrayList<>());
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }
    private void dfs(int node) {
        visited.add(node);
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor);
            }
        }
    }
    public int countComponents() {
        int count = 0;
        for (int node : graph.keySet()) {
            if (!visited.contains(node)) {
                dfs(node);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ConnectedComponents g = new ConnectedComponents();
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        g.graph.putIfAbsent(5, new ArrayList<>());
        int components = g.countComponents();
        System.out.println("Number of connected components: " + components);
    }
}
