package Heap;


public class MinHeap {

    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void insert(int val) {
        if (size == capacity) {
            resize(2 * capacity);
        }

        size++;
        heap[size] = val;
        swim(size);
    }

    private void resize(int newCapacity) {
        int[] newHeap = new int[newCapacity + 1];
        System.arraycopy(heap, 1, newHeap, 1, size); //Very important
        heap = newHeap;
        capacity = newCapacity;
    }

    private void swim(int k) {
        while (k > 1 && heap[k / 2] > heap[k]) {
            swap(k / 2, k);
            k = k / 2;
        }
    }

    public int deleteMin() {
        if (isEmpty()) {
            System.out.println("Heap is empty. Cannot delete.");
            return -1;
        }

        int min = heap[1];
        heap[1] = heap[size];
        size--;
        sink(1);

        return min;
    }

    private void sink(int k) {
        while (2 * k <= size) {
            int j = 2 * k;
            if (j < size && heap[j] > heap[j + 1]) {
                j++;
            }
            if (heap[k] <= heap[j]) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    public void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(4);
        minHeap.insert(5);
        minHeap.insert(2);
        minHeap.insert(6);
        minHeap.insert(1);
        minHeap.insert(3);

        System.out.println("Min Heap:");
        minHeap.printHeap();

        minHeap.deleteMin();
        System.out.println("After deleting min element:");
        minHeap.printHeap();
    }
}
