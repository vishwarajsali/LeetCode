package com.vishwarajsali.problems.all;

import java.util.LinkedList;
import java.util.Stack;

public class _000000020_Valid_Parentheses {


    //push to stack if its a open bracket
    //pop if bracket is close
    // if close brcket is not match add to a list
    // verify id stack is empty and list is empty
    public boolean isValid(String s) {


        if (s == null || s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();
        LinkedList<Character> list = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);

            if(curr == '(' || curr == '[' || curr == '{') stack.push(curr);
            else {
                if(!stack.isEmpty()){
                    if(curr == ')' && stack.peek() == '(') stack.pop();
                    else if (curr == ']' && stack.peek() == '[') stack.pop();
                    else if (curr == '}' && stack.peek() == '{') stack.pop();
                    else list.add(curr);
                }else list.add(curr);
            }
        }

        return stack.isEmpty() && list.isEmpty();
    }
}
