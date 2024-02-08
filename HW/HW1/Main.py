def isPalindrome(s):
    s = ''.join(filter(str.isalnum, s)).lower()
    return s == s[::-1]
    
# Testing
print(isPalindrome("A man, a plan, a canal: Panama"))  # Returns: True