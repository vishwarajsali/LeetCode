package com.vishwaraj.stack;


public class Stack<T> {

//    pop ->
//    push - >
//    peek ->
//    isEmpty ->

    private Node<T> top;


    /**
     *
     * @return first item for stack
     */
    public T pop(){
        if(top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item){
        Node<T> t = new Node<T>(item);
        t.next = top;
        top = t;
    }

    public T peek(){
        if(top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    /**
     * Node class for stack
     * @param <T>
     */
    private static class Node<T>{
        private T data;
        private Node<T> next;
        private Stack(T data){
            this.data = data;
        }
    }
}
