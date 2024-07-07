package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortUsingBFS {
    public static void createGraph(ArrayList<GraphBasicOperation.Edge>[] graph){
        int i = 0;
        while (i < graph.length) {
            graph[i] = new ArrayList<>();
            i++;
        }

        graph[2].add(new GraphBasicOperation.Edge(2, 3, 0));

        graph[3].add(new GraphBasicOperation.Edge(3, 1, 0));

        graph[4].add(new GraphBasicOperation.Edge(4, 0, 0));
        graph[4].add(new GraphBasicOperation.Edge(4, 1, 0));

        graph[5].add(new GraphBasicOperation.Edge(5, 0, 0));
        graph[5].add(new GraphBasicOperation.Edge(5, 2, 0));

    }
    public static void calIndeg(ArrayList<GraphBasicOperation.Edge>[] graph, int[] indeg){
        for (int i = 0; i < graph.length; i++) {
            int v = i;  //it is vertex ex 0 1 2 3 4 5
            for (int j = 0; j < graph[v].size(); j++) {
                GraphBasicOperation.Edge e = graph[v].get(j);
                indeg[e.dest]++;  // if any e's destination is there then for dest it is an incoming edge or in-degree

            }
        }
    }
    public static void topologicalSortUsingBFS(ArrayList<GraphBasicOperation.Edge>[] graph){
        int[] indeg = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();
        calIndeg(graph, indeg);
        for (int i = 0; i < graph.length; i++) {
            if(indeg[i] == 0)
                q.add(i);   // intial add those in degree is zero
        }

        while (!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");
            for (int i = 0; i < graph[curr].size(); i++) {
                GraphBasicOperation.Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0)
                    q.add(e.dest);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<GraphBasicOperation.Edge>[] graph = new ArrayList[6];
        createGraph(graph);
        topologicalSortUsingBFS(graph);

    }
}
