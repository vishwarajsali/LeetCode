package com.vishwaraj.OldFiles.Java.src.main.java.problems._0022GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * GenerateParentheses
 */
public class GenerateParentheses {

    public static void main(String[] args) {
        generateParenthesis(3);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateCombination(new char[n*2], 0, result);
        return result;
    }

    private static void generateCombination(char[] current,int pos, List<String>result){
        if(pos == current.length){
            if(validParenthesis(current))  result.add(new String(current));
        }else {
            current[pos] = '(';
            generateCombination(current, pos+1, result);
            current[pos] = ')';
            generateCombination(current, pos+1, result);
        }   
    }

    private static boolean validParenthesis(char[] current){
        int balance = 0;
        for (char c: current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }
}