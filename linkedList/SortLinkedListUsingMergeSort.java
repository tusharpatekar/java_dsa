package linkedList;

public class SortLinkedListUsingMergeSort {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Instance variables for head and tail
    private Node head;
    private Node tail;

    // add Element in list
    public void addLast(int data) {
        // step 1 - create new Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            // step 2 - tail of next to newNode
            tail.next = newNode;
            // step 3 - tail to newNode
            tail = newNode;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            System.out.print("->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Merge sort of Linked list

    // Mid-finder function
    private Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Function for combining two sorted lists
    private Node merge(Node head1, Node head2) {
        Node temp = new Node(-1);
        Node curr = temp;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        curr.next = head1 != null ? head1 : head2;
        return temp.next;
    }

    public Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // find Middle of linked list
        Node mid = findMid(head);
        Node leftList = head;
        Node rightList = mid.next;
        mid.next = null;

        Node leftHead = mergeSort(leftList);
        Node rightHead = mergeSort(rightList);

        return merge(leftHead, rightHead);
    }

    public static void main(String[] args) {
        SortLinkedListUsingMergeSort ll = new SortLinkedListUsingMergeSort();
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(2);
        ll.addLast(1);
        ll.head = ll.mergeSort(ll.head); // Assigning the sorted head to ll.head
        ll.printList(); // Print the sorted linked list
    }
}
