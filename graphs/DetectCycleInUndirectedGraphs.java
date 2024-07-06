package graphs;

import java.util.ArrayList;

public class DetectCycleInUndirectedGraphs {

    public static boolean detectCycle(ArrayList<GraphBasicOperation.Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                if(detectCycleUtil(graph, visited, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<GraphBasicOperation.Edge>[] graph, boolean[] visited, int curr, int par){
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            GraphBasicOperation.Edge e = graph[curr].get(i);

            //case 3 ->  if neighbour is not visited and detect Cycle return true for neighbour then curr also return true
            if(!visited[e.dest]){
                if (detectCycleUtil(graph, visited, e.dest, curr))
                    return true;
            }
            // case 2 -> if neighbour is visited but neighbour is not parent paren in sense 1 - > 2 then 1 is parent of 2
            else if (visited[e.dest] && e.dest != par) {
                return true;
            }
            //case 1 do nothing -> if visited and parent
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<GraphBasicOperation.Edge>[] graph = new ArrayList[7];
        GraphBasicOperation.createGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
