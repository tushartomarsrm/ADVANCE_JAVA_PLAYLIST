package Graph;
public class AdjMatrixGraph{

    int [][]adjM ;
    int V;
    int E;
    AdjMatrixGraph(int V){
        this.V=V;
        this.E=0;
        adjM = new int[V][V];
    }

    public void addEdge(int n1,int n2){
        E++;
        adjM[n1][n2]=1;
        adjM[n2][n1]=1;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Vertex : "+V+"\n"+"Edges : "+E+"\n    ");
        for (int v=0;v<V;v++){
            s.append(v+" ");
        }
        s.append("\n    ");
        for (int v=0;v<V;v++){
            s.append(". ");
        }
        s.append("\n");
        for (int v=0;v<V;v++){
            s.append(v+" : ");
            for (int w=0;w<V;w++){
                s.append(adjM[v][w]+" ");
            }  
            s.append("\n");          
        }
        return s.toString();
        
    }


    public static void main(String[] args) {
        
        AdjMatrixGraph ad = new AdjMatrixGraph(5);
        ad.addEdge(0, 1);
        ad.addEdge(0, 2);
        ad.addEdge(0, 3);
        ad.addEdge(0, 4);
        ad.addEdge(1, 2);
        ad.addEdge(1, 3);
        ad.addEdge(1, 4);
        ad.addEdge(2, 3);
        ad.addEdge(2, 4);
        ad.addEdge(3, 4);
        System.out.println(ad);//toString method is called itself
    }
}