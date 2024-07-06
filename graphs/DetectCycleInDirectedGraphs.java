package graphs;

import java.util.ArrayList;

public class DetectCycleInDirectedGraphs {

    public static void createGraph(ArrayList<GraphBasicOperation.Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();  // it will initialize the empty AL at every idx
        }
        graph[0].add(new GraphBasicOperation.Edge(0, 2, 0));
        graph[1].add(new GraphBasicOperation.Edge(1, 0, 0));
        graph[2].add(new GraphBasicOperation.Edge(2, 3, 0));
        graph[3].add(new GraphBasicOperation.Edge(3, 0, 0));


    }

    public static boolean isCycle(ArrayList<GraphBasicOperation.Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                if(isCycleUtil(graph, i, visited, stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<GraphBasicOperation.Edge>[] graph, int curr, boolean[] visited, boolean[] stack){
        visited[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            GraphBasicOperation.Edge e = graph[curr].get(i);
            if(stack[e.dist]){  // if neighbour is in stack
                return true;
            }
            if(!visited[e.dist] && isCycleUtil(graph, e.dist, visited, stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        ArrayList<GraphBasicOperation.Edge>[] graph = new ArrayList[4];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}
