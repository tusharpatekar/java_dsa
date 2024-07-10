package graphs;

import java.util.ArrayList;
import java.util.Collections;

public class KruskalMST {    //O(V + E logE)

    public static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        @Override
        public int compareTo(Edge obj){
            return this.wt - obj.wt;
        }
    }
    public static void createGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    static int n = 4;
    static int[] par = new  int[n];
    static int[] rank = new int[n];

    public static void init(){
        for (int i = 0; i < par.length; i++) {
            par[i] = i;
        }
    }
    public static int find(int x){
        if(x == par[x])
            return x;
        return par[x] = find(par[x]);  // path compression
    }
    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] > rank[parB]) {
            par[parB] = parA;
        } else {
            par[parA] = parB;
        }

    }

    public static void kruskalMST(ArrayList<Edge> edges, int V) {
        init();
        Collections.sort(edges);
        int minCost = 0;
        int count = 0;

        for (int i = 0; i < edges.size() - 2; i++) {
            Edge e = edges.get(i);

            int parA = find(e.src);
            int parB = find(e.dest);

            if(parA != parB){
                union(e.src, e.dest);
                minCost += e.wt;
                count++;
            }
        }
        System.out.println(minCost);

    }

    public static void main(String[] args) {
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        kruskalMST(edges, n);
    }
}
