
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Minimum_Absolute_Difference
 */
public class Minimum_Absolute_Difference {

    public static void main(String[] args) {
       int[] arr = {4,2,1,3};

       Minimum_Absolute_Difference mad = new Minimum_Absolute_Difference();
       System.out.println(mad.minimumAbsDifference(arr));
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<Integer> subList;
        List<List<Integer>> list = new LinkedList<>();
        if(arr.length == 0) return list;

        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;

        for(int i = 0; i< arr.length- 1; i++){
                int temp = Math.abs(arr[i] - arr[i+1]);
                if(temp < diff) {
                    diff = temp;
                }
            
        }

        for(int i = 0; i< arr.length- 1; i++){
                subList = new LinkedList<>();
                int temp = Math.abs(arr[i] - arr[i+1]);
                if(temp == diff){
                        subList.add(arr[i]);
                        subList.add(arr[i+1]);
                    
                }    
                
                if(!subList.isEmpty()){
                    list.add(subList);
                }
                
            
        }

        


        return list;
    }
    
   
}