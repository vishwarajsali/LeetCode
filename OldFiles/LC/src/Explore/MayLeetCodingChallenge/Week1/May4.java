package com.vishwaraj.OldFiles.LC.src.Explore.MayLeetCodingChallenge.Week1;

/**
 * May4
 */
public class May4 {

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
        int bit = 1, temp = num;
        while(temp!= 0){
            num = num ^ bit;
            bit = bit << 1;
            temp = temp >> 1;
            System.out.println(num);
        }
        return num;
    }
}
