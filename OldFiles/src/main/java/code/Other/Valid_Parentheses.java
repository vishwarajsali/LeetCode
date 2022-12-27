package com.vishwaraj.OldFiles.src.main.java.code.Other;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Valid_Parentheses
 */
public class Valid_Parentheses {

    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        LinkedList<Character> list = new LinkedList<>();
        int i = 0;
        if (s == null || s.length() == 0) return true;

        while (i < s.length()) {
            char pare = s.charAt(i);

            if (pare == '(' || pare == '{' || pare == '[') stack.push(pare);

            else {
                if (!stack.isEmpty()) {
                    if ((char) stack.peek() == '(' && pare == ')') stack.pop();
                    else if ((char) stack.peek() == '[' && pare == ']') stack.pop();
                    else if ((char) stack.peek() == '{' && pare == '}') stack.pop();
                    else  list.add(pare);
                } else list.add(pare);
            }

            i++;
        }

        return stack.isEmpty() && list.isEmpty();
    }
}