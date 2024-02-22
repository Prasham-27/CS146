1. Sorting the array is the first step.
2. Loop through the array. (exclude the last two)
3. We will then implement two pointers approach.
4. If the number is the same as the number before, we have used it as target already, continue, Otherwise, we set the left pointer lo to i+1, and set the right pointer hi to the end of array.
5. While left pointer lo is smaller than hi:
   - If the sum of nums[i], nums[lo] and nums[hi] is smaller than zero, increment lo.
   - If the sum is bigger than zero, decrement hi.
   - If the sum is zero, we have found one triplet, add it to the result res.
   - Remove the duplication of lo and hi. Move the left pointer lo to the right while the next number is the same as before.
   - Move the right pointer hi to the left, while the next number is the same as before.
