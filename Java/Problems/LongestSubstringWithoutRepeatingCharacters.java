package Problems;

/**
 * LongestSubstringWithoutRepeatingCharacters
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String[] input  = {"abcabcbb","bbbbb","pwwkew"};
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();

        for(String i : input){
            
           System.out.printf("%s  %d \n" ,i ,l.lengthOfLongestSubstring(i));   
        }
    }

    public int lengthOfLongestSubstring(String s) {
        
        return 0;
    }
}