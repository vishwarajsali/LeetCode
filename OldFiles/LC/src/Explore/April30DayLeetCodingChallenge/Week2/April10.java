package com.vishwaraj.OldFiles.LC.src.Explore.April30DayLeetCodingChallenge.Week2;

import java.util.Stack;

public class April10 {
    public static void main(String[] args) {

        MinStack obj = new MinStack();
        obj.push(1);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();

    }
}

class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack = new Stack();
    Stack<Integer> minStack = new Stack();

    public MinStack() {
        
    }
    
    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()&& x <= minStack.peek()){
            minStack.push(x);
        }
    }
    
    public void pop() {
        if( stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
