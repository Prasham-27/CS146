- In the Python approach, isalnum() is used to filter the alphanumeric characters from the string s and the lower() function is used for converting the string into lower case.
- The [::-1] function is used to reverse the string. Then, I compared this reversed string with the original string to check whether it is equal or not. If Equal, it is a Palindrome. Else, not a Palindrome.

- In the Java approach, I used the replaceAll() method to replace all the non-word characters from the string s and convert it into lower case. 
- I then compared the characters of the string from the start and the end. If at any point, characters don't match - return false. If the loop completes without any interruption, it means the string is a palindrome. Hence, return true.

The time complexity of both algorithms is O(n), where n is the length of the string.
