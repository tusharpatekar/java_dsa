package priorityqueueorheap;


import java.util.Comparator;
import java.util.PriorityQueue;

/*
   We are given N points in 2D plane which are locations
   of N cars. If we are at the origin nearest K cars
 */
public class NearByCar  {

    public static class CarInfo implements Comparable<CarInfo>{
        int x;
        int y;
        String name;
        int dt;

        public CarInfo(int x, int y, String name, int dt){
            this.x = x;
            this.y = y;
            this.name = name;
            this.dt = dt;
        }

        @Override
        public int compareTo(CarInfo s1){
            return this.dt - s1.dt;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<CarInfo> pq = new PriorityQueue<>();
        pq.add(new CarInfo(3, 3, "C0", (3*3 + 3*3)));
        pq.add(new CarInfo(5, -1, "C1", (5*5 + 1)));
        pq.add(new CarInfo(-2, 4, "C2", (2*2 + 4*4)));  // dt = x*x + y*y it distance between origin and car position

        int k = 2;
        while (k >0){
            System.out.print(pq.peek().name + " ");
            pq.remove();
            k--;
        }

    }
}
