package queue;

import java.util.Stack;

public class QueueUsingTwoStack {

    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }
        public static void add(int data) {
            if (isEmpty()){
                s1.push(data);
            }else{
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                s1.push(data);
                while (!s2.isEmpty()){
                    s1.push(s2.pop());
                }
            }
        }
        public static int remove(){
            if (isEmpty()){
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if (isEmpty())
                return -1;
            return s1.peek();
        }
    }

    public static void main(String[] args){
        Queue q = new Queue();

        q.add(1);
        q.remove();
        System.out.println(q.isEmpty());

/*
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

 */
    }
}
