import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Twosumproblem{

    //fn to printArray
    public void printArray(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //two sum fn return indexes of two element of an array having sum equal to a target sum
    public int[] twosum(int arr[],int targetsum){
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (!mp.containsKey(targetsum-arr[i])){
                mp.put(arr[i],i);
            }
            else {
                return new int[] {mp.get(targetsum-arr[i]),i};
            }
        }
        return new int[] {0,0};
    }

    //two sum another approach 
    public int[] twosum2nd(int arr[],int targetsum){
        int first = 0;
        int last = arr.length-1;
        Arrays.sort(arr);
        while(first<last){
            int sum = arr[first]+arr[last];
            if (sum==targetsum){
                return new int[]{arr[first],arr[last]};
            }
            else if (sum<targetsum){
                first++;
            }else {
                last--;
            }
        }
        return new int[] {0,0};
    }

    public static void main(String []args){

        //Creating Array
        int []arr= {85,9,21,4,44,45};
        int targetsum = 13;

        //Creating object of Arrays class
        Twosumproblem problem = new Twosumproblem();

        System.out.println("Array is : ");
        problem.printArray(arr);
        System.out.println("\nTarget sum : "+targetsum+"\n");

        int []indexesofelement = problem.twosum(arr,targetsum);
        System.out.println("ELEMENT INDEXES : ");
        problem.printArray(indexesofelement);

        System.out.println();
        System.out.println("ELEMENT VALUES : ");

        int []element_values = problem.twosum2nd(arr,targetsum);
        problem.printArray(element_values);
        
        //can be sone by sorting and two pointer (first and last variable method)
    }
} 
