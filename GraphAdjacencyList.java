import java.util.ArrayList;
import java.util.List;
public class GraphAdjacencyList {
    private int numVertices;
    private List<List<Integer>> adjList;
    public GraphAdjacencyList(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); 
    }
    public void printGraph() {
        System.out.println("Adjacency List Representation:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer neighbor : adjList.get(i)) {
                System.out.print(" -> " + neighbor);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numVertices = 5;
        GraphAdjacencyList graph = new GraphAdjacencyList(numVertices);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
    }
}