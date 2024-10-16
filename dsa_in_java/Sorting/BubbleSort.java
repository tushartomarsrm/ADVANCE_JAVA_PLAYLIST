package Sorting;

public class BubbleSort {

    public static void printArray(int arr[]){
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int arr[]){
        boolean isSwapped = false;
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
                if (isSwapped==false) {System.out.println("Already Sorted");return;}
            }
        }
    }
public static void main(String[] args) {
    int arr[] = new int[]{9,7,8,6,4,5,3,1,2};
    printArray(arr);
    bubbleSort(arr);
    printArray(arr);

}
    
}
