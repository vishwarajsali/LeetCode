import java.util.HashMap;

/**
 * Maximum_Number_of_Balloons
 */
public class Maximum_Number_of_Balloons {

    public static void main(String[] args) {
        Maximum_Number_of_Balloons mx = new Maximum_Number_of_Balloons();
        System.out.println(mx.maxNumberOfBalloons2("krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw"));
    }

    public int maxNumberOfBalloons1(String text) {
        

        HashMap<Character, Integer> map = new HashMap<>(){
            {
                put('b',0);
                put('a', 0);
                put('l', 0);
                put('o', 0);
                put('n', 0);
            }

        };

        for(char c : text.toCharArray()){
            if(map.containsKey(c)){
                map.replace(c, map.get(c)+1);
            }
        }

        int minCount = Integer.MAX_VALUE;

        for (char key : map.keySet()) {
            int value = map.get(key);
            if(key == 'l' || key == 'o'){
                value /= 2;
            }
            minCount = Math.min(minCount, value);
        }
      
        return minCount;
    }

    public int maxNumberOfBalloons(String text) {
        int[] dict = new int[128];


        for(char c : text.toCharArray()){
            dict[c]++;
        }

        int countmin =Integer.MAX_VALUE;
       
        for(int i = 0; i< dict.length; i++){
            
            if(i == 'b' || i == 'a'|| i == 'n'|| i == 'l'|| i =='o'){
                if(i == 'l'|| i =='o'){
                    dict[i] = dict[i]/2;
                }
                countmin = Math.min(countmin, dict[i]);
            }
        }

        return countmin;
    }

    public int maxNumberOfBalloons2(String text) {
        int[] dict = new int[26];


        for(char c : text.toCharArray()){
            dict[c - 'a']++;
        }

        int countmin =Integer.MAX_VALUE;
       
        for(int i = 0; i< dict.length; i++){
            
            if(i == ('b' - 'a') || i == ('a' - 'a')|| i == ('n'-'a')|| i == ('l'-'a') || i ==('o'-'a')){
                if(i == ('l'-'a')|| i ==('o'-'a')){
                    dict[i] = dict[i]/2;
                }
                countmin = Math.min(countmin, dict[i]);
            }
        }

        return countmin;
    }
}