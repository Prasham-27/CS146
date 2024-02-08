package Labs.Lab 2;
import java.util.Arrays;

public class Main {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
            }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));  // Returns true
        System.out.println(isAnagram("rat", "car"));  // Returns false
    }
}