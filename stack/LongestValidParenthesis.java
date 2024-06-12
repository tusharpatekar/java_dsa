package stack;

import java.util.Stack;

public class LongestValidParenthesis {

    public static int countOfLongestValidParenthesis(String str){
        Stack<Character> s = new Stack<>();
        int count = 0;
        int max = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){

                s.push(ch);
            }else{
                if(s.isEmpty()){
                    continue;
                }
                if(ch == ')' && s.peek() == '(' ||
                ch == ']' && s.peek() == '[' ||
                ch == '}' && s.peek() == '{'){
                    s.pop();
                    count += 2;
                    max = Math.max(max, count);
                }
            }
        }

        return count;
    }

    public static void main(String[] args){

        String str = "(()";
        System.out.println(countOfLongestValidParenthesis(str));

    }
}
