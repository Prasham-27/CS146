import java.util.HashMap;
public class Main
{
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> counters = new HashMap<>();
        for(char c : s.toCharArray())
            counters.put(c, counters.getOrDefault(c, 0)+1);
        int palindromeLength = 0;
        boolean couldHaveMidChar = false;
        for(Integer letterCount: counters.values()){
            if(letterCount%2 == 0)
                palindromeLength += letterCount;
            else {
                palindromeLength += letterCount/2*2;
                couldHaveMidChar = true;
            }
        }
        return couldHaveMidChar ? palindromeLength+1 : palindromeLength;
    }
    
    public static void main(String [] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("speediskey"));
    }
}