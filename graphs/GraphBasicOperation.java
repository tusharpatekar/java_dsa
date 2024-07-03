package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBasicOperation {

    public static class Edge{
        int src;
        int dist;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dist = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();  // it will initialize the empty AL at every idx
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));


    }

    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        q.add(0); // suppose 0 is starting point of graph

        while (!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                visited[curr] = true;
                System.out.print(curr + " ");
                //now it neighbour should be added in queue
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dist);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new   ArrayList[7]; // we create array of type ArrayList but it assign the NULL at every location which replicate as undefined place

        createGraph(graph);
        bfs(graph);
//        for (int i = 0; i < graph[2].size(); i++) {
//            Edge e = graph[2].get(i);
//            System.out.print(e.dist + " ");
//        }


    }
}
