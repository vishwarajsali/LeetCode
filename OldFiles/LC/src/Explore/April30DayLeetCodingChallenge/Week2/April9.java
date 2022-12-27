package com.vishwaraj.OldFiles.LC.src.Explore.April30DayLeetCodingChallenge.Week2;

import java.util.Stack;

public class April9 {
    public static void main(String[] args) {
        April9 s = new April9();
        System.out.println(s.backspaceCompare("y#fo##f", "y#f#o##f"));
    }

    public boolean backspaceCompare(String S, String T) {

        return removeChar(S).equals(removeChar(T));
    }

    private String removeChar(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != '#')
                stack.push(c);
            else if (!stack.empty())
                stack.pop();

        }

        return String.valueOf(stack);
    }
}