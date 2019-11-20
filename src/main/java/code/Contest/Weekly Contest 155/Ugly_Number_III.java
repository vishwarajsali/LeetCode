/**
 * Ugly_Number_III
 */
public class Ugly_Number_III {

    public static void main(String[] args) {
        
        Ugly_Number_III un = new Ugly_Number_III();
        System.out.println(un.nthUglyNumber(1000000000,2,217983653,336916467));
    }

    public int nthUglyNumber(int n, int a, int b, int c) {
        
        int i = 1; 
        int counter = 0;
        int num = 0;
        
        while(true){
            if(i % a == 0 || i % b == 0 || i% c == 0){
                num = i;
                System.out.println(i);
                counter ++;
            }
            
            if(counter == n) return num;
            
            i++;
        }
        
        
    }
}