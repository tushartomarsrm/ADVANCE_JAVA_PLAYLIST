public class SortedSquares{

    //fn to printArray
    public void printArray(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    //fn to convert sorted array to sorted sq array
    public int []sortedsqarr(int arr[]){
        int first = 0;
        int last = arr.length-1;
        int []sortedarr = new int [arr.length];//here arr.length
        for (int i=arr.length-1;i>=0;i--){
            if (Math.abs(arr[first])<Math.abs(arr[last])){
                sortedarr[i]=arr[last]*arr[last];
                last--;
            }else{ //includes first = last case
                sortedarr[i]=arr[first]*arr[first];
                first++;
            }
        }
    
        return sortedarr;
    }
    public static void main(String []args){
        
        //Creating Array
        int []arr= {-3,-1,0,2,32};

        //Creating object of Arrays class
        SortedSquares problem = new SortedSquares();

        //sortedarray
        int []sortedarr = problem.sortedsqarr(arr);

        //printing sorted array
        problem.printArray(sortedarr);

    }
}