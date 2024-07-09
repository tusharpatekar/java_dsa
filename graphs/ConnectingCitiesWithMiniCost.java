package graphs;

import java.util.PriorityQueue;

public class ConnectingCitiesWithMiniCost {
    static class Info implements Comparable<Info>{   // it information of edge
        int dest;  // curr edge with destination
        int cost; // this will be the cost required to visit destination

        public Info(int d, int c){
            this.dest = d;
            this.cost = c;
        }
        @Override
        public int compareTo(Info obj){
            return this.cost - obj.cost;
        }
    }
    //prim's algorithm
    public static int connectingCities(int[][] cities){
        boolean[] visited = new boolean[cities.length];
        PriorityQueue<Info> pq = new PriorityQueue<>();

        pq.add(new Info(0, 0));
        int finalCost = 0;
        while (!pq.isEmpty()){
            Info curr = pq.remove();

            if(!visited[curr.dest]){
                visited[curr.dest] = true;
                finalCost += curr.cost;
                for (int i = 0; i < cities[curr.dest].length; i++) {
                    if(cities[curr.dest][i] != 0){
                        pq.add(new Info(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalCost;
    }
    public static void main(String[] args) {
        int[][] cities = {
                {0, 1, 2, 3, 4},
                {1, 0, 5, 0, 7},
                {2, 5, 0, 6, 0},
                {3, 0, 6, 0, 0},
                {4, 7, 0, 0, 0}
        };
        System.out.println(connectingCities(cities));

    }
}
