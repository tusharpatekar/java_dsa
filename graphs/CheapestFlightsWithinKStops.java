package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightsWithinKStops {

    public static void createGraph(ArrayList<GraphBasicOperation.Edge>[] graph, int[][] flights){
        for (int i = 0; i < graph.length; i++) {
            graph[i] =new ArrayList<>();
        }
        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];
            GraphBasicOperation.Edge e = new GraphBasicOperation.Edge(src, dest, wt);
            graph[src ].add(e);
        }
    }

    static class Info{
        int v;
        int cost; // it is src to dest
        int stops; //at which number current node is
        public Info(int v, int c, int s){
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }
    public static int cheapestFlights(int[][] flights, int src, int dest, int k){
        ArrayList<GraphBasicOperation.Edge>[] graph = new ArrayList[flights.length];
        createGraph(graph, flights);
        int[] dist = new int[flights.length];
        Arrays.fill(dist, Integer.MAX_VALUE);

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(0, 0, 0));
        while (!q.isEmpty()){
            Info curr = q.remove();
            if(curr.stops > k){
                break;
            }
            for (int i = 0; i < graph[curr.v].size(); i++) {
                GraphBasicOperation.Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v =e.dest;
                int wt = e.wt;
                if(curr.cost + wt < dist[v] && curr.stops <= k){
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }
        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }else {
            return dist[dest];
        }

    }

    public static void main(String[] args) {
        int[][] flights = {
                {0, 1, 100},  // src dest wt
                {1, 2, 100},
                {2, 0, 100},
                {1, 3, 600},
                {2, 3, 200}
        };
        System.out.println(cheapestFlights(flights, 0, 3, 1));

    }
}
