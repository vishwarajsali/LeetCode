package dev.vishsali.dataStructureandAlgorithm.linkedList;


import dev.vishsali.dataStructureandAlgorithm.linkedList.doubly.Node;


public class DoublyLinkedList {
    private Node head;
    private int size;
    public DoublyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if(index <= 0 || index > size) return -1;
        Node dummy = head;
        while(--index > 0) dummy = dummy.next;
        return dummy == null ? -1 : dummy.val;

    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if(!isEmpty()){
            head.prev = node;
            node.next = head;
        }

        head = node;
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        Node dummy = head;
        if(!isEmpty()) {
            while (dummy.next != null) {
                dummy = dummy.next;
            }
            node.prev = dummy;
            dummy.next = node;
        }else {
            head = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        } else if (index == size) {
            addAtTail(val);
            return;
        }
        Node dummy = head;
        while(--index > 0) dummy = dummy.next;
        Node node = new Node(val);
        node.next = dummy.next;
        node.prev = dummy;
        dummy.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index > size || index <= 0) return ;
        Node dummy = head;
        if(index == 1) {
            head.prev = null;
            size--;
            return;
        }
        while(--index > 0){
            dummy = dummy.next;
        }
        Node prev = dummy.prev;
        Node next = dummy.next;
        prev.next = next;
        next.prev = prev;
        size--;

    }

    public void printDoublyLinkedList() {
        Node dummy = head;
        System.out.print("Null");
        while(dummy != null){
            System.out.print(" --->> " + dummy.val);
            dummy = dummy.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void isSize() {
        System.out.println("size is --->> " + size);
    }

}

