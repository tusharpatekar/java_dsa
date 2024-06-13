package queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackAndQueueUsingDeque {
    static class Stack{
        static Deque<Integer> q = new LinkedList<>();
        public static void push(int x){
            q.addLast(x);
        }
        public static int peek(){
            return q.getLast();
        }
        public static int pop(){
            return q.removeLast();
        }
    }
    static class Queue{
        static  Deque<Integer> q = new LinkedList<>();
        public static void add(int x){
            q.addLast(x);
        }
        public static int peek(){
            return q.getFirst();
        }
        public static int remove(){
            return  q.removeFirst();
        }
    }
}
