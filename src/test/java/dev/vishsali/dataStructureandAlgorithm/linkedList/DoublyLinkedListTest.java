package dev.vishsali.dataStructureandAlgorithm.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DoublyLinkedListTest {
    DoublyLinkedList test = null;

    @Test
    public void test_1(){
        test = new DoublyLinkedList();
        test.addAtHead(1);
        test.printDoublyLinkedList();;
        test.isSize();
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        test.deleteAtIndex(1);
        test.printDoublyLinkedList();;
        test.isSize();
        System.out.println(test.get(0));
        System.out.println(test.get(1));


    }

    @Test
    public void test_2(){

    }

    @Test
    public void test_3(){


    }

}