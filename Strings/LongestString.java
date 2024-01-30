public class LongestString {

    public static void main(String[] args){
        String[] fruit = {"apple", "mango", "banana"};


        //by lexicographical order
        String largest = fruit[0];
        for (int i=1; i<fruit.length; i++){
            if(fruit[i].compareTo(largest) > 0){  //.compareTo() this treat a and A as different
                largest = fruit[i];

            }
            if(fruit[i].compareToIgnoreCase(largest) > 0){  //.compareTo() this treat a and A as same
                largest = fruit[i];

            }

        }
        System.out.println(largest);
    }
}