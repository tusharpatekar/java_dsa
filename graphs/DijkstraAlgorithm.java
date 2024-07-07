package graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    public static void createGraph(ArrayList<GraphBasicOperation.Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new GraphBasicOperation.Edge(0, 1, 2));
        graph[0].add(new GraphBasicOperation.Edge(0, 2, 4));

        graph[1].add(new GraphBasicOperation.Edge(1, 3, 7));
        graph[1].add(new GraphBasicOperation.Edge(1, 2, 1));

        graph[2].add(new GraphBasicOperation.Edge(2, 4, 3));

        graph[3].add(new GraphBasicOperation.Edge(3, 5, 1));

        graph[4].add(new GraphBasicOperation.Edge(4, 3, 2));
        graph[4].add(new GraphBasicOperation.Edge(4, 5, 5));

    }
    // pair class to store value and min distance from src
    static class Pair implements Comparable<Pair>{
        int n;
        int path; //minimum distance from src

        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(Pair obj){
            return this.path - obj.path;
        }
    }

    public static void dijkstra(ArrayList<GraphBasicOperation.Edge>[] graph, int src){
        int[] dist = new int[graph.length]; // this array shows distance between src to i
        for (int i = 0; i < graph.length; i++) {
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean[] visited = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visited[curr.n]){
                visited[curr.n] = true;
                // neighbours
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    GraphBasicOperation.Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        //print all src to vertices shortest distance
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<GraphBasicOperation.Edge>[] graph = new ArrayList[6];
        createGraph(graph);
        dijkstra(graph, 0);
    }
}
