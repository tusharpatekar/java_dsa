package queue;

public class CircularQueueUsingArray {
    static class Queue{
        static int front;
        static int rear;
        static int[] arr;
        static int size;

        Queue(int n){
            arr = new int[n];
            rear = -1;
            front = -1;
            size = n;

        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        public static void add(int data){
            if(isFull()){
                return;

            }
            // when we try to add new element
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result = arr[front];

            if(front == rear){
                front = rear = -1;
            }else {
                front = (front+1) % size;
            }
            return result;
        }

        public static int peek(){
            return arr[front];
        }

    }
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

        }
    }
}
