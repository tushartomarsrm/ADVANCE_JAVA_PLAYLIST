package Graph;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class AdjListGraph{

   List<List<Integer>> edges;
   int V;
   int E;

   AdjListGraph(int n){
      edges = new LinkedList<>();
      V=n;
      E=0;
      for (int i=0;i<V;i++){
         edges.add(new LinkedList<>());//VERY VERY IMPORTATNT and not edges.get(i) = new ArrayList<>();
      }
   }

   public void addEdge(int n1,int n2){
      edges.get(n1).add(n2);
      edges.get(n2).add(n1);
      E++;
   }

   public String toString(){
      StringBuilder s = new StringBuilder();
      s.append("Vertex : "+V+"\n"+"Edges : "+E+"\n");
      for (int v =0;v< V;v++){
         s.append(v+" : ");
         for (int val : edges.get(v)){ //if there is no val than it returns empty space
            s.append(val+" ");
         }
         s.append("\n");
      }
      return s.toString();


   }

   //dfs using stack iterative
   public void dfs(int v){
      boolean []visited = new boolean[V]; // all values got initialized by false;
      visited[v]=true;
      Stack<Integer> st = new Stack<>();
      st.push(v);
      while(!st.isEmpty()){
         v=st.peek();
         System.out.print(st.pop()+" ");
         for (int val : edges.get(v)){//WE can apply for each loop in linked list
            if (!visited[val]){
               visited[val]=true;
               st.push(val);
            }
         }
      }
      System.out.println();
   }

   //bfs iterative
   public void bfs(int v){
      boolean []visited = new boolean[V]; // all values got initialized by false;
      visited[v]=true;
      Queue<Integer> qu = new LinkedList<>();//we cannot instantiate queue to queue bcz offer and poll return error too if not found
      qu.offer(v);
      while(!qu.isEmpty()){
         v=qu.peek();
         System.out.print(qu.poll()+" ");
         for (int val : edges.get(v)){
            if (!visited[val]){
               visited[val]=true;
               qu.offer(val);
            }
         }
      }
      System.out.println();
   }

   //dfs recursive
   public void dfsRecursive(int v, boolean[] visited) {
      visited[v] = true;
      System.out.print(v + " ");
  
      for (int val : edges.get(v)) {
          if (!visited[val]) {
              dfsRecursive(val, visited);
          }
      }
  }
  public void dfsRecursive(int v) {
   boolean[] visited = new boolean[V];
   dfsRecursive(v, visited);
   System.out.println(); // Print a new line after DFS completes
}

   //bfs recursive no use as not efficient as the iterative approach. Recursive BFS introduces additional complexity

   public static void main(String[] args) {
      
      AdjListGraph ad = new AdjListGraph(7);
      ad.addEdge(0, 1);
      ad.addEdge(1, 2);
      ad.addEdge(2, 3);
      ad.addEdge(4, 0);
      ad.addEdge(5, 0);
      ad.addEdge(6, 4);
      ad.addEdge(4, 3);
      System.out.println(ad);//toString method is called itself

      ad.dfs(2);
      ad.bfs(2);
      ad.dfsRecursive(2);
   }
}















