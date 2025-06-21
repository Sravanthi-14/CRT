import java.util.PriorityQueue;
public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(3);
        minHeap.add(15);
        System.out.println("Min-Heap values:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll()); // poll() removes and returns the smallest element
        }
    }
}
