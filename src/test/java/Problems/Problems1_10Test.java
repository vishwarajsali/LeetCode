package Problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Problems1_10Test {

    Problems1_10 problems1_10 = new Problems1_10();
    @Test
    void twoSum() {

        int[][] input = {
                {2,7,11,15},
                {3,2,4}

        };

        int[] target = {9,6};
        String[] excpected = {"[0, 1]","[1, 2]"};

        for(int i = 0; i < input.length; i++){
            String actual = Arrays.toString(problems1_10.twoSum(input[i], target[i]));
            String message = "input : " + Arrays.toString(input[i]) + "\n Target : "+ target[i] ;
            assertEquals(excpected[i], actual, message);
        }

    }

    @Test
    void isMatch() {

        String[] s = {"aa"},
                p = { "a"};
        boolean[] excpected = {false};


        for(int i = 0; i < s.length; i++){
            boolean actual = false;
            String message = "s : " + s[i] + "\n p : "+ p[i] ;
            assertEquals(excpected[i], actual, message);
        }
    }
}