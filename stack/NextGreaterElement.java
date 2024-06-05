package stack;


import java.util.Stack;

// very important

// same for right greater just need to change for loop direction
// same for left/right smaller just change for loop and arr[s.peek()] <= arr[i]  <=
public class NextGreaterElement {

    public static void nextGreater(Stack<Integer> s, int[] arr, int[] nxtGreater){
        for(int i=arr.length-1; i>=0; i--){

            // check for element peek is small then arr element
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // if stack is empty
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else {
                nxtGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static void main(String[] args){
        int[] arr = {20, 10, 0, 3, 11};
        int[] nxtGreater = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        nextGreater(s, arr, nxtGreater);
        int idx = 0;
        while (idx <= nxtGreater.length - 1){
            System.out.print(nxtGreater[idx]+ " ");
            idx ++;
        }
    }
}
