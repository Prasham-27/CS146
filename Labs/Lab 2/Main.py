def isAnagram(s, t):
    return sorted(s) == sorted(t)

print(isAnagram("anagram", "nagaram"))  # Returns True
print(isAnagram("rat", "car"))  # Returns False