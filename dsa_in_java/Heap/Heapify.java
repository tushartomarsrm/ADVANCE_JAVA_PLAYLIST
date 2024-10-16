package Heap;

public class Heapify {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[1] = 4;
        array[2] = 2;
        array[3] = 9;
        array[4] = 6;
        array[5] = 5;
        array[6] = 1;
        array[7] = 8;
        array[8] = 3;
        array[9] = 7;

        System.out.println("Original Array:");
        printArray(array);

        heapify(array);

        System.out.println("Heapified Array:");
        printArray(array);
    }

    public static void heapify(int[] array) {
        int n = array.length - 1; // exclude index 0
        for (int i = n / 2; i >= 1; i--) {
            heapifyDown(array, n, i);
        }
    }

    // recursive method
    public static void heapifyDown(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;

        if (left <= n && array[left] > array[largest]) {
            largest = left;
        }

        if (right <= n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest);
            heapifyDown(array, n, largest);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
