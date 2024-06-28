package priorityqueueorheap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueWithStudentClass {
    public static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s1){
            return this.rank - s1.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 2));
        pq.add(new Student("F", 4));
        pq.add(new Student("B", 8));
        pq.add(new Student("C", 22));
        pq.add(new Student("D", 1));

        while (!pq.isEmpty()){
            System.out.println(pq.peek().name + " " + pq.peek().rank + " ");
            pq.remove();
        }

    }
}
