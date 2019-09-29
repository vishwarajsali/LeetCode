package Contest.WeeklyContest156;

import java.util.HashMap;
import java.util.Map;

/**
 * UniqueNumberofOccurrences
 */
public class UniqueNumberofOccurrences {

    public static void main(String[] args) {
        
        UniqueNumberofOccurrences u = new UniqueNumberofOccurrences();
        System.out.print(u.uniqueOccurrences());
    }

    public boolean uniqueOccurrences() {
        int[] arr = {1,2};
        Map<Integer, Integer> map = new HashMap();
        
        for (int i : arr) {
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else {
                map.put(i, map.get(i)+1);
            }
        }

        
        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            int count = 0;
            for(Map.Entry<Integer, Integer> j : map.entrySet()){
                if(i.getValue() == j.getValue()) count++;
            }
            if(count != 1) return false;
        }

        return true;

    }
}