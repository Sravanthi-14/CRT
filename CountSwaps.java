public class CountSwaps {
    public static void main(String[] args) {
        int[] arr = {5,1,4,2};
        int swapCount = 0;
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nNumber of swaps: " + swapCount);
    }
    public static int bubbleSortWithSwapCount(int[] arr) {
        int n = arr.length;
        int swapCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
}