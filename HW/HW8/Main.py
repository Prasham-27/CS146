class Solution:
    def longestPalindrome(self, s: str) -> int:
        from collections import Counter 
        count = Counter(s)
        palindrome_len = 0
        odd_exists = False
        
        for value in count.values():
            if value % 2 == 0:
                palindrome_len += value 
            else: 
                palindrome_len += value - 1 
                odd_exists = True
        if odd_exists:
            palindrome_len += 1
        return palindrome_len
        
scores = Solution()
print(scores.longestPalindrome("abccccdd"))
print(scores.longestPalindrome("speediskey"))