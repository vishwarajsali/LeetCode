/**
 * K-Concatenation_Maximum_Sum
 */
public class K_Concatenation_Maximum_Sum {

    public static void main(String[] args) {
        K_Concatenation_Maximum_Sum k = new K_Concatenation_Maximum_Sum();
        int[] arr = {1,-2,1};
        int k1 = 5;
       System.out.println(k.kConcatenationMaxSum(arr, k1));
        
    }

    public int kConcatenationMaxSum(int[] arr, int k) {
    

        int sum = 0;
        
        for(int i = 0; i < k; i++){
            for(int num : arr){
                if(num < 0) sum = 0;
                else sum += num;
            }
        }

        return sum;
    }
}