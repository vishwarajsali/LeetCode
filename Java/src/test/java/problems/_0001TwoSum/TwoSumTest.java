package problems._0001TwoSum;

import org.junit.jupiter.api.Test;
import problems._0001TwoSum.TwoSum;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {


    @Test
    void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[][] input = {
            {2,7,11,15},
            {3,2,4}

    };

    int[] target = {9,6};
    String[] excpected = {"[0, 1]","[1, 2]"};

    for(int i = 0; i < input.length; i++){
        String actual = Arrays.toString(twoSum.twoSum(input[i], target[i]));
        String message = "input : " + Arrays.toString(input[i]) + "\n Target : "+ target[i] ;
        assertEquals(excpected[i], actual, message);
    }
    }
}