public class HeapCheck {
    public static boolean isMaxHeap(int[] heap) {
        int n = heap.length;
        for (int i = 0; i <= (n - 2) / 2; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < n && heap[i] < heap[left]) return false;
            if (right < n && heap[i] < heap[right]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] heap = {90, 15, 10, 7, 12, 2};
        if (isMaxHeap(heap)) {
            System.out.println("Heap property is maintained (Max-Heap).");
        } else {
            System.out.println("Heap property is NOT maintained.");
        }
    }
}
