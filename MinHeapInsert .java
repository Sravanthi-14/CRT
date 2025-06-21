import java.util.ArrayList;
public class MinHeapInsert {
    private ArrayList<Integer> heap;
    public MinHeap() {
        heap = new ArrayList<>();
    }
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    public void insert(int val) {
        heap.add(val); // add at end
        int i = heap.size() - 1;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(i) < heap.get(parent)) {
                swap(i, parent);
                i = parent;
            } else {
                break;
            }
        }
    }
    public void printHeap() {
        System.out.println("Min Heap:");
        for (int val : heap) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(12);
        minHeap.insert(7);
        minHeap.insert(15);
        minHeap.insert(3);
        minHeap.insert(10);
        minHeap.printHeap(); // Print the heap
    }
}
