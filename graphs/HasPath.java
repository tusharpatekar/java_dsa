package graphs;

import java.util.ArrayList;

public class HasPath {
    public static boolean hasPath(ArrayList<GraphBasicOperation.Edge>[] graph, int src, int dist, boolean[] visited) {
        if(src == dist){
            return true;
        }
        visited[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            GraphBasicOperation.Edge e = graph[src].get(i);
            if(!visited[e.dist] && hasPath(graph, e.dist, dist, visited)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<GraphBasicOperation.Edge>[] graph = new ArrayList[7]; // we create array of type ArrayList but it assign the NULL at every location which replicate as undefined place

        GraphBasicOperation.createGraph(graph);


        System.out.println(hasPath(graph, 0, 10, new boolean[graph.length]));
    }

}

