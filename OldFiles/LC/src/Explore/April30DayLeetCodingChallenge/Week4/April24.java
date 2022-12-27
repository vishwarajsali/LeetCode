package com.vishwaraj.OldFiles.LC.src.Explore.April30DayLeetCodingChallenge.Week4;


import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 * April24
 */
public class April24 {

    public static void main(String[] args) {
        
    }
}

/**
 * LRUCache
 * 
 */
class LRUCache {
    int capacity;
    Map<Integer, Integer> cache;
    LinkedList<Integer> list;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new TreeMap<>();
        list = new LinkedList<>();
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)) return -1;
        return cache.get(key);
    }
    
    public void put(int key, int value) {
        if(capacity == cache.size()) cache.get(list.pollLast());
        cache.put(key, value);
        list.addFirst(key);
    }
}