import java.util.*;
public class CycleDetectionUndirected {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    public void addEdge(int src, int dest) {
        graph.putIfAbsent(src, new ArrayList<>());
        graph.putIfAbsent(dest, new ArrayList<>());
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }
    private boolean hasCycleDFS(int node, int parent, Set<Integer> visited) {
        visited.add(node);
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                if (hasCycleDFS(neighbor, node, visited)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }
    public boolean containsCycle() {
        Set<Integer> visited = new HashSet<>();
        for (int node : graph.keySet()) {
            if (!visited.contains(node)) {
                if (hasCycleDFS(node, -1, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        CycleDetectionUndirected g = new CycleDetectionUndirected();
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        if (g.containsCycle()) {
            System.out.println("Cycle detected in the graph.");
        } else {
            System.out.println("No cycle in the graph.");
        }
    }
}
