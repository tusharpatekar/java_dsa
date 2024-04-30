package linkedList;

public class DetectLoop {

    // Create LinkedList
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // add Element in list
    public static Node head;
    public static Node tail;
    public void addLast(int data){
        //step 1 - create new Node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }

        //step 2 - tail of next to newNode
        tail.next = newNode;

        //step 3 - tail to newNode
        tail = newNode;
    }
    public  void printList(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            System.out.print("->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    // function for detecting loop or cycle
    // Floyd's CFA
    public boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        DetectLoop ll = new DetectLoop();
       head =  new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
      // head.next.next.next = head;
        ll.printList();

        if(ll.detectLoop(head)){
            System.out.println("Loop detected ");
        }else {
            System.out.println("Loop Not found");
        }

    }

}
