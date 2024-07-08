package graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MSTPrimsAlgo {

    public static void createGraph(ArrayList<GraphBasicOperation.Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new GraphBasicOperation.Edge(0, 1, 10));
        graph[0].add(new GraphBasicOperation.Edge(0, 3, 30));
        graph[0].add(new GraphBasicOperation.Edge(0, 2, 15));

        graph[1].add(new GraphBasicOperation.Edge(1, 0, 10));
        graph[1].add(new GraphBasicOperation.Edge(1, 3, 40));

        graph[2].add(new GraphBasicOperation.Edge(2, 0, 15));
        graph[2].add(new GraphBasicOperation.Edge(2, 3, 50));
        graph[3].add(new GraphBasicOperation.Edge(3, 0, 30));
        graph[3].add(new GraphBasicOperation.Edge(3, 1, 40));
        graph[3].add(new GraphBasicOperation.Edge(3, 2, 50));
    }
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        public Pair(int v, int cost){
            this.v = v;
            this.cost = cost;
        }
        @Override
        public int compareTo(Pair obj){
            return this.cost - obj.cost;
        }
    }

    public static void primsMST(ArrayList<GraphBasicOperation.Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalMinCost = 0;
        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visited[curr.v]){
                visited[curr.v] = true;
                finalMinCost += curr.cost;
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    GraphBasicOperation.Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }
        System.out.println("Final min cost is : " + finalMinCost);
    }
    public static void main(String[] args) {
        ArrayList<GraphBasicOperation.Edge>[] graph = new ArrayList[4];
        createGraph(graph);
        primsMST(graph);
    }
}
