package com.vishwaraj.array_hashing;

import java.util.ArrayList;
import java.util.List;

public class _00271_EncodeAndDecodeStrings {// Encodes a list of strings to a single string.
    public String encode(List<String> strs) {

        StringBuilder encoded_string = new StringBuilder();

        for(String str : strs){
            encoded_string.append(str.length());
            encoded_string.append("#");
            encoded_string.append(str);
        }

        return encoded_string.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> decoded_string = new ArrayList<>();
        int i = 0;
        while(i< s.length()){
            int j = i;
            while(s.charAt(j)!= '#') j++;
            int l = Integer.valueOf(s.substring(i,j));
            i = j + 1 +l;
            decoded_string.add(s.substring(j+1, i));
        }

        return decoded_string;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));