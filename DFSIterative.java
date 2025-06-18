import java.util.*;
public class DFSIterative {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    public void addEdge(int src, int dest) {
        graph.putIfAbsent(src, new ArrayList<>());
        graph.putIfAbsent(dest, new ArrayList<>());
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }
    public void dfsIterative(int start) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited.contains(node)) {
                System.out.print(node + " ");
                visited.add(node);
                List<Integer> neighbors = graph.getOrDefault(node, new ArrayList<>());
                Collections.reverse(neighbors); // Optional
                for (int neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        DFSIterative dfsGraph = new DFSIterative();
        dfsGraph.addEdge(0, 1);
        dfsGraph.addEdge(0, 2);
        dfsGraph.addEdge(1, 3);
        dfsGraph.addEdge(1, 4);
        dfsGraph.addEdge(2, 5);
        dfsGraph.addEdge(2, 6);
        System.out.println("DFS (Iterative) Traversal starting from node 0:");
        dfsGraph.dfsIterative(0);
	}
}