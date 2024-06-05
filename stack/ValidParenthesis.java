package stack;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean validateParenthesis(String str){

        // stack
        Stack<Character> s = new Stack<>();
        // for loop to traverse
        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);
            //checking for opening parenthesis
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((ch == ')' && s.peek() == '(')
                        || (ch == '}' && s.peek() == '{')
                        || (ch == ']' && s.peek() == '[')) {
                    s.pop();
                } else {
                    return false;
                }
            }


        }
        if(s.isEmpty()){
            return true;
        }else
            return false;
    }

    public static void main(String[] args){
        String str = "{{}}]";
        System.out.println(validateParenthesis(str));
    }


}
