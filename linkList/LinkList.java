package linkList;

public class LinkList {



    public static class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data = data;
            this.next = null;

        }

    }
    public static Node head;
    public static Node tail;

    public static int size;
    public  void addFirst(int data){   //O(n)
        // step 1 - create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }

        //step 2 - assign next equal to head
        newNode.next = head;

        //step 3 - assign head equals to newNode
        head = newNode;
    }

    public void addLast(int data){
        //step 1 - create new Node
        Node newNode = new Node(data);
        size++;
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

        System.out.println("Size of linklist is :" + size);
    }

    // insert at index

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;


        while (i < idx-1){
            temp =  temp.next;
            i++;
        }

        // i = idx -1 which prev of index
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args){
        LinkList ll = new LinkList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(3,6);
        ll.printList();
    }
}
