- First of all check if the two strings have the same length.
- If the strings are not of the same length, we return false because they cannot be anagrams.
- If the strings have the same length, we convert the strings to character arrays and sort them.
- After sorting, if the two strings are anagrams, the sorted character arrays should be the same.
- We then compare the sorted character arrays. If they are the same, return true, else return false.

In the Python solution, we make use of the fact that when two lists are compared in Python, the comparison is done element by element. If the lists have the same elements in the same order, they are considered equal.
