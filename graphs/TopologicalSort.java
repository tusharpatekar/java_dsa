package graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    public static void createGraph(ArrayList<GraphBasicOperation.Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();  // it will initialize the empty AL at every idx
        }
        graph[2].add(new GraphBasicOperation.Edge(2, 3, 0));

        graph[3].add(new GraphBasicOperation.Edge(3, 1, 0));

        graph[4].add(new GraphBasicOperation.Edge(4, 0, 0));
        graph[4].add(new GraphBasicOperation.Edge(4, 1, 0));

        graph[5].add(new GraphBasicOperation.Edge(5, 0, 0));
        graph[5].add(new GraphBasicOperation.Edge(5, 2, 0));



    }

    public static void topLogicalSort(ArrayList<GraphBasicOperation.Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                topLogicalSortUtil(graph, i, visited, stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
    public static void topLogicalSortUtil(ArrayList<GraphBasicOperation.Edge>[] graph, int curr, boolean[] visited, Stack<Integer> stack){
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            GraphBasicOperation.Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                topLogicalSortUtil(graph, e.dest, visited, stack);
            }
        }
        stack.push(curr);
    }
    public static void main(String[] args) {
        ArrayList<GraphBasicOperation.Edge>[] graph = new ArrayList[6];
        createGraph(graph);
        topLogicalSort(graph);
    }
}
