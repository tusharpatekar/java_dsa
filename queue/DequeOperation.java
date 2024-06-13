package queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeOperation {
    public static void main(String[] args){
        Deque<Integer> q = new LinkedList<>();

        q.addFirst(1);
        q.addLast(2);
        System.out.println(q);
        q.removeFirst();
        System.out.println(q);
        System.out.println(q.getFirst());
        q.addLast(3);
        System.out.println(q.getLast());


    }
}
