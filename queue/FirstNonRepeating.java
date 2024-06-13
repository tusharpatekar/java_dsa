package queue;

import java.util.*;

public class FirstNonRepeating {
    public static void firstNonRepeating(String str){
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println("Queue is Empty -1 ");
            }else {
                System.out.println(q.peek());
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        String str = "abbcadc";

        firstNonRepeating(str);
    }
}
