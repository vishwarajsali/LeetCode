package com.vishwaraj.OldFiles.Java.src.main.java.problems._0155MinStack;

import java.util.Stack;

/**
 * MinStack
 */
class MinStack {
    /** initialize your data structure here. */
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();
    public MinStack() {

    }

    public void push(final int x) {
        if(x <= min){          
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.pop() == min) min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

}