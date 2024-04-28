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

    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for (int i=0; i<size-2; i++){
            prev= prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        size -- ;
        tail = prev;
        return val;
    }

    public int itrSearch(int key){    //O(n)
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }


    public void removeNthFormEnd(int n){
        // calculate size of linked list
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz ++;
        }

        //if head is to remove
        if(n == sz){
            head = head.next;
            return;
        }

        // traverse to prev node
        Node prev = head;
        int i = 1;
        while(i < sz-n){
            prev = prev.next;
            i++;
        }
        // delete the nth node
        prev.next = prev.next.next;
        size = size - 1;
        return;
    }

    //function for finding middle node using fast - slow approach
    public Node midNode(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next; //+2
            slow = slow.next;      //+1
        }
        return slow;
    }

    //function for finding palindrome

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step - 1 find midNode

        Node midNode = midNode(head);

        //step - 2 reverse half list
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =  next;
        }

        Node right = prev;
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;

    }

    // break for today

    public static void main(String[] args){
        LinkList ll = new LinkList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
       // ll.add(3,6);
        ll.printList();

        //  System.out.println(ll.removeFirst());
        // System.out.println(ll.removeLast());
        //  ll.printList();
        // System.out.println("key found at " + ll.itrSearch(4));
        // System.out.println("key found at " + ll.recSearch(4));
        // ll.reverse();

        //ll.removeNthFormEnd(3);
        //ll.printList();

        if(ll.checkPalindrome()){
            System.out.println("Linked list is palindrome");
        }else {
            System.out.println("Linked list is not palindrome");
        }


    }
}
