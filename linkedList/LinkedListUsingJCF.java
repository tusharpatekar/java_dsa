package linkedList;
import java.util.LinkedList;

public class LinkedListUsingJCF {
    public static void main(String[] args){
        //Create LinkedList
        LinkedList<Integer> ll = new LinkedList<>();

        // Add in linkedList

        ll.addLast(2);
        ll.addLast(1);
        ll.addFirst(0);

        System.out.println(ll);

        // remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);


    }
}
