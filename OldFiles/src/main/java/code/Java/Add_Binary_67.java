package com.vishwaraj.OldFiles.src.main.java.code.Java;

/*
 * Given two binary strings, return their sum (also a binary string).
 * The input strings are both non-empty and contains only characters 1 or 0.
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 *  Example 2:
 *  Input: a = "1010", b = "1011"
 *  Output: "10101"
 */

public class Add_Binary_67 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String a = "101", b = "101";
        System.out.print(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        int alen = a.length() - 1, blen = b.length() - 1, carry = 0;
        while (alen >= 0 || blen >= 0) {
            int sum = carry;
            if (alen >= 0)  sum += a.charAt(alen--) - '0';
            if (blen >= 0)  sum += b.charAt(blen--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) result.append(carry);
        return result.reverse().toString();
    }

}
