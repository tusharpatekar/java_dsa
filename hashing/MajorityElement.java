package hashing;

import java.beans.beancontext.BeanContextChild;
import java.util.LinkedHashMap;
import java.util.Set;

// Given an Integer array of size n, find all element that appear more than [n/3] times
// means return the element having n/3 frequency or appearance
public class MajorityElement {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> lm = new LinkedHashMap<>();

        int[] num = {1, 3, 2, 5, 1, 3, 1, 5, 1};

        for (int i = 0; i < num.length; i++) {
            lm.put(num[i], lm.getOrDefault(num[i], 0)+1);
        }

    //    Set<Integer> keySet = lm.keySet();
//        for (Integer key : keySet){
//            if(lm.get(key) > num.length/3){
//                System.out.print(key + " ");
//            }
//        }

        // more optimize
        for (Integer key : lm.keySet()){
            if(lm.get(key) > num.length/3){
                System.out.print(key + " ");
            }
        }
    }
}
