package hashing;

//import java.util.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class DesignHashMap {
     static class HashMap<K, V>{     // Here we are using generic data type, K can be anything same for V

        public class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int N;
        private int n; // this total number of nodes
        private LinkedList<Node>[] basket;  // here we initialize the basket arr of type linked list and ll is of Node type
         //@SuppressWarnings("unchecked")
         public HashMap(){
             this.N = 4;

             this.basket = new LinkedList[4];
             // initially lets consider the array of linked list have empty node at each index of basket

             for (int i = 0; i < basket.length; i++) {
                 this.basket[i] = new LinkedList<>();
                 n++;
             }
         }
         // utility function
         private int hashFunction(K key){
             int hash = key.hashCode(); // this will return the 1223 or -1256, but we want index and abs value
             return Math.abs(hash) % N;  // here by moding with size of basket size we will get value less than size
         }

         private int searchingLinkedList(K key, int bi){
             LinkedList<Node> ll = basket[bi];

             int di = 0;  // it is index of node having match value
             for (int i = 0; i < ll.size(); i++) {
                 Node node = ll.get(i);
                 if(node.key == key){
                     return di;
                 }
                 di++;
             }
             return -1;

         }

         private void rehash(){
             LinkedList<Node>[] oldBasket = basket; //temporally taking basket data into oldBasket
             basket = new LinkedList[N*2];
             N *= 2;
             for (int i = 0; i < oldBasket.length; i++) {
                 basket[i] = new LinkedList<>();  // here now clearing the basket to new basket and initializing with empty
             }

             for (int i = 0; i < oldBasket.length; i++) {
                 LinkedList<Node> ll = oldBasket[i];
                 for (int j = 0; j < ll.size(); j++) {
                     Node node = ll.get(j);
                     put(node.key, node.value);
                 }
             }
         }
         // function or operation in HashMap

         public void put(K key, V value){
             int bi = hashFunction(key);  // bi is the basket index in which the element may be available or need to add at bi index of basket
             int di = searchingLinkedList(key, bi);

             if(di != -1){
                 LinkedList<Node> ll = basket[bi];
                 Node node = ll.get(di);
                 node.value = value;
             } else {
                 LinkedList<Node> ll = basket[bi];
                 ll.add(new Node(key, value));
                 n++;
             }

             double lambda = (double) (n/N);
             if(lambda > 2.0){
                 rehash();
             }
         }

         public V remove(K key){
             int bi = hashFunction(key);  // bi is the basket index in which the element may be available or need to add at bi index of basket
             int di = searchingLinkedList(key, bi);

             if(di != -1){
                 LinkedList<Node> ll = basket[bi];
                 Node node = ll.remove(di);
                 return node.value;

             } else {
                 return null;
             }
         }

         public V get(K key){
             int bi = hashFunction(key);  // bi is the basket index in which the element may be available or need to add at bi index of basket
             int di = searchingLinkedList(key, bi);

             if(di != -1){
                 LinkedList<Node> ll = basket[bi];
                 Node node = ll.get(di);
                 return node.value;
             } else {
                 return null;
             }
         }

         public ArrayList<K> keySet(){
             ArrayList<K> list = new ArrayList<>();
             for (int i = 0; i < basket.length; i++) {
                 LinkedList<Node> ll = basket[i];
                 for (int j = 0; j < ll.size(); j++) {
                     Node node = ll.get(j);
                     list.add(node.key);
                 }
             }
             return list;
         }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("MI", 5);
        hm.put("CSK", 5);
        hm.put("RAJ", 1);
        hm.put("KKR", 3);

        System.out.println(hm.get("MI"));
        System.out.println(hm.remove("CSK"));
        System.out.println(hm.keySet());


    }
}
