public class ArrayLinkedList {
    static class Node {
        int data;
        int next; // index of the next node in the array

        Node(int data, int next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // Initialize array to hold nodes
        Node[] list = new Node[5];
        list[0] = new Node(10, 1);
        list[1] = new Node(20, 2);
        list[2] = new Node(30, 3);
        list[3] = new Node(40, 4);
        list[4] = new Node(50, -1); // -1 indicates end of list

        // Traverse the "linked list"
        int currentIndex = 0;
        while (currentIndex != -1) {
            System.out.print(list[currentIndex].data + " -> ");
            currentIndex = list[currentIndex].next;
        }
        System.out.println("null");
    }
}
