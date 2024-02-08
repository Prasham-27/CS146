package HW.HW1;
public class Main
{
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\W", "").toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // Returns: True
    }
}
