package com.vishwaraj.array_hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



class _00271_EncodeAndDecodeStringsTest {


    _00271_EncodeAndDecodeStrings test = new _00271_EncodeAndDecodeStrings();

    @Test
    public void test_1(){
        List<String> list = Arrays.asList("Hello", "World");
        String encoded_string = "5#Hello5#World";
        Assertions.assertEquals(test.encode(list), encoded_string);
        Assertions.assertEquals(test.decode(encoded_string), list);


    }

    @Test
    public void test_2(){
        List<String> list = Arrays.asList("", "");
        String encoded_string = "0#0#";
        Assertions.assertEquals(test.encode(list), encoded_string);
        Assertions.assertEquals(test.decode(encoded_string), list);


    }

}