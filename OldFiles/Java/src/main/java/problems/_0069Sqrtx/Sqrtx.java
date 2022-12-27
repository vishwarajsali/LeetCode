package com.vishwaraj.OldFiles.Java.src.main.java.problems._0069Sqrtx;

/**
 * Sqrtx
 */
public class Sqrtx {

    public static void main(String[] args) {
        Sqrtx x = new  Sqrtx();
        System.out.println(x.mySqrt(8));
    }
    public int mySqrt(int x) {
    
     
        double num = 0;
        while(power(num++,2) <= x);
        
        double upper = num,
                lower = 0;
        
        while(lower< upper ){
            double mid = (lower + upper)/2; 
            double root = power(mid,2);
            if( root == (double)x || Math.abs(root - x) == 0.001){
                return (int)mid;
            } else if(root < x){
                lower = mid;
            }else {
                upper = mid;
            }
        }
        
        return 0;
    }
    
    private double power(double x, int e){
        if(e == 0)  return 1; 
        return x * power(x, e-1);
    }
}