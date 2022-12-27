package com.vishwaraj.OldFiles.LC.src.Explore.April30DayLeetCodingChallenge.Week1;

import java.util.ArrayList;
import java.util.List;

/**
 * April2
 */
public class April2 {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        int temp = n;
        List<Integer> list = new ArrayList<>();
        while (temp != 1) {
            if (list.contains(temp))
                return false;
            list.add(temp);
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += (digit * digit);
                temp /= 10;
            }

        }
        return true;
    }
}
