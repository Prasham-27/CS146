1. First, we sort the input array nums[].
2. Iterate over the sorted array. 
3. For each element, we apply a two pointers approach.
4. Check if the sum of the three numbers is equal to 0. If it is, we add it to the result.
5. If the sum is less than 0, we move the left pointer to the right, because we need a larger number to get closer to 0.
6. If the sum is more than 0, we move the right pointer to the left, because we need a smaller number to get closer to 0.
7. We skip the duplicates during this process to avoid producing duplicate triplets.
8. Repeat the process for each element of the array.
