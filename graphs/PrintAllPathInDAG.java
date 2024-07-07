package graphs;

import java.util.ArrayList;

public class PrintAllPathInDAG {
    public static void createGraph(ArrayList<GraphBasicOperation.Edge>[] graph){
        int i = 0;
        while (i < graph.length) {
            graph[i] = new ArrayList<>();
            i++;
        }
        graph[0].add(new GraphBasicOperation.Edge(0, 3, 0));
        graph[2].add(new GraphBasicOperation.Edge(2, 3, 0));

        graph[3].add(new GraphBasicOperation.Edge(3, 1, 0));

        graph[4].add(new GraphBasicOperation.Edge(4, 0, 0));
        graph[4].add(new GraphBasicOperation.Edge(4, 1, 0));

        graph[5].add(new GraphBasicOperation.Edge(5, 0, 0));
        graph[5].add(new GraphBasicOperation.Edge(5, 2, 0));

    }
    public static void printAllPath(ArrayList<GraphBasicOperation.Edge>[] graph, int src, int dest, String path){
        if(src == dest){
            System.out.print(path+dest);
            return;
        }
        for (int i = 0; i < graph[src].size(); i++) {
            GraphBasicOperation.Edge e = graph[src].get(i);
            printAllPath(graph, e.dest, dest, path+src);
        }

    }
    public static void main(String[] args) {
        ArrayList<GraphBasicOperation.Edge>[] graph = new ArrayList[6];
        createGraph(graph);
        printAllPath(graph, 5, 1, " ");
    }
}
