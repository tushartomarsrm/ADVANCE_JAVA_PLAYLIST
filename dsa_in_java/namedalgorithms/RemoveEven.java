public class RemoveEven {

    int []arr;
    int oddcount;
    RemoveEven(int arr[]){
        this.arr=arr;
        this.oddcount=0;
    }

    void printArray(int arr[]){
        for (int i:arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    int [] removedEvenArray(){
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
                oddcount++;
            }
        }
        int []newArray = new int[oddcount];
        int index=0;
        for (int i:arr){
            if (i%2!=0){
                newArray[index++]=i;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        
        RemoveEven rm = new RemoveEven(new int[]{2,3,5,1,7,3,8});
        rm.printArray(rm.arr);
        int []newArray = rm.removedEvenArray();
        rm.printArray(newArray);
    }
}
