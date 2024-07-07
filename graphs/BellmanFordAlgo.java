package graphs;

import java.util.ArrayList;

public class BellmanFordAlgo {
    public static void createGraph(ArrayList<GraphBasicOperation.Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new GraphBasicOperation.Edge(0, 1, 2));
        graph[0].add(new GraphBasicOperation.Edge(0, 2, 4));

        graph[1].add(new GraphBasicOperation.Edge(1, 2, -4));

        graph[2].add(new GraphBasicOperation.Edge(2, 3, 2));

        graph[3].add(new GraphBasicOperation.Edge(3, 4, 4));

        graph[4].add(new GraphBasicOperation.Edge(4, 1, -1));


    }

    public static void bellmanFordAlgo(ArrayList<GraphBasicOperation.Edge>[] graph, int src){
        int[] dist = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length - 1;
        for (int i = 0; i < V-1; i++) {
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    GraphBasicOperation.Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }
    public static void main(String[] args) {
        ArrayList<GraphBasicOperation.Edge>[] graph = new ArrayList[5];
        createGraph(graph);
        bellmanFordAlgo(graph, 0);
    }
}
