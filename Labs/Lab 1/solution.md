A hash map is used to keep track of the numbers in the array. 
For each number, we compute the complement by subtracting it from target. 
We then check if this complement is already in the hash map. If it isn't, 
we record the current number in the hash map. If it is, it means we found 
two numbers that add up to target and we return their indices.
