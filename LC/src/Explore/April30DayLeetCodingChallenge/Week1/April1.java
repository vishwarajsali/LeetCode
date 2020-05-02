package Explore.April30DayLeetCodingChallenge.Week1;


import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.parser.Entity;
 

/**
 * April1
 */
public class April1 {

    public static void main(String[] args) {
        
    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }

        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue() == 1){
                return e.getKey();
            } 
        }
        return -1;
    }
}