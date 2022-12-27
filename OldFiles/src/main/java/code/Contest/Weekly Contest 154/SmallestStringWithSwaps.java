import java.util.List;

/**
 * SmallestStringWithSwaps
 */
public class SmallestStringWithSwaps {

    public static void main(String[] args) {
        SmallestStringWithSwaps ssws = new SmallestStringWithSwaps();
        String s = "abc";
        
    }

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        
        for (List<Integer> sub : pairs) {
            s = swap(s, sub.get(0), sub.get(1));
        }


        return s;
    }

    
    public String swap(String s, int a, int b){
        
        s = "abc";
        char[] res = s.toCharArray();
        if(res[a] < res[b]){
        char temp = res[a];
        res[a] = res[b];
        res[b] = temp;
        }

        System.out.println(res.toString());
        return res.toString();
    }
}