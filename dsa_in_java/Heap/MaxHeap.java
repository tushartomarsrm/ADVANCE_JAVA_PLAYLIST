package Heap;
/*
swim Operation:

When you insert an element into a binary max-heap (or min-heap), it might violate the heap property (the parent is larger than root for a max-heap, smaller for a min-heap).
swim is the process of moving the newly inserted element up the heap to its correct position.
It starts at the index where the element was inserted and keeps swapping it with its parent until the heap property is satisfied.

sink Operation:

When you remove the maximum element from a binary max-heap (or the minimum from a min-heap), it leaves a gap at the root position.
sink is the process of moving an element down the heap to its correct position.
It starts at the root and repeatedly swaps it with its larger (max-heap) or smaller (min-heap) child until the heap property is satisfied.

Index 0 is kept empty in a binary heap (like the one used in priority queues) to make the math of finding parent and child nodes easier.

In a binary heap, for any node at index i, its left child is at index 2*i and its right child is at index 2*i + 1. Also, the parent of a node at index i is at index i/2.

If we start indexing from 1, these formulas work perfectly. However, if we start from 0, we need to use slightly more complex formulas (2*i + 1 for the left child and 2*i + 2 for the right child) which are less intuitive.
 */


public class MaxHeap {

    private int[] heap;
    private int size;// size of max heap
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1]; // index 0 is kept as empty //VERY important
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void insert(int val) {
        if (size == capacity) {
            resize(2 * capacity);   //very important
        }

        size++;
        heap[size] = val;
        swim(size);
    }

    private void resize(int newCapacity) {
        int[] newHeap = new int[newCapacity + 1]; //very imortant
        System.arraycopy(heap, 1, newHeap, 1, size);
        heap = newHeap;
        capacity = newCapacity;
    }

    private void swim(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            swap(k / 2, k);
            k = k / 2;// bcoz we need to continue shifting up till new value inserted is at correct
                      // position
        }
    }

    public int deleteMax() {
        if (isEmpty()) {
            System.out.println("Heap is empty. Cannot delete.");
            return -1;
        }

        int max = heap[1];
        heap[1] = heap[size];
        size--; //got delete with minus very important
        sink(1);

        return max;
    }

    private void sink(int k) {
        while (2 * k <= size) { //This loop continues as long as the index k has at least one child node. If 2 * k > size, it means k is a leaf node (it has no children), so the loop terminates.
            int j = 2 * k;
            if (j < size && heap[j] < heap[j + 1]) { //left or right which child node is smaller is taken
                //j<size is used bcz last bottom most is escaped bcz there is only one child
                j++;
            }
            if (heap[k] >= heap[j]) { //if parent greater than child than correct
                break;
            }
            swap(k, j); // swap parent with child of greater value
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
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(4);
        maxHeap.insert(5);
        maxHeap.insert(2);
        maxHeap.insert(6);
        maxHeap.insert(1);
        maxHeap.insert(3);

        System.out.println("Max Heap:");
        maxHeap.printHeap();

        maxHeap.deleteMax();
        System.out.println("After deleting max element:");
        maxHeap.printHeap();
    }
}
