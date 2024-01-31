package dev.vishsali.dataStructureandAlgorithm.linkedList.doubly;

import dev.vishsali.dataStructureandAlgorithm.linkedList.DoublyLinkedList;

public class Node {
    public int val;
    public Node next;
    public Node prev;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
