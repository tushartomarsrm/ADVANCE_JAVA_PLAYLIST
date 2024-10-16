package Sorting;

public class InsertionSort {

    public static void printArray(int arr[]){
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void insertionSort(int arr[]){
        int n=arr.length;
        int j;int temp;
        for (int i=1;i<n;i++){
            temp = arr[i];
            j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{9,7,8,6,4,5,3,1,2};
        printArray(arr);
        insertionSort(arr);
        printArray(arr);
    }
}
