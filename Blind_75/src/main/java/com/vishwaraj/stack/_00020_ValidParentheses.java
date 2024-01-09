package com.vishwaraj.stack;

import java.util.*;

public class _00020_ValidParentheses {


    /**
     * list and stack
     * @param s stirng
     * @return
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        List<Character> list = new ArrayList<>();

        for(Character c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if(!stack.isEmpty()){
                    if(c == ')' && stack.peek() == '(') stack.pop();
                    else if(c == '}' && stack.peek() == '{') stack.pop();
                    else if(c == ']' && stack.peek() == '[') stack.pop();
                    else list.add(c);
                }else list.add(c);
            }
        }

        return stack.isEmpty() && list.isEmpty();
    }


    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();

        map.put(']', '[');
        map.put(')', '(');
        map.put('}', '{');


        for(Character c : s.toCharArray()) {
            if(map.containsKey(c)){
                if(!stack.isEmpty() && map.get(c).equals(stack.peek())) stack.pop();
                else return false;
            }else stack.push(c);
        }

        return stack.isEmpty();
    }

}
