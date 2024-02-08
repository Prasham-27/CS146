from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_to_index = {}
        for i, num in enumerate(nums):
            if target - num in num_to_index:
                return [num_to_index[target - num], i]
            num_to_index[num] = i
        return []
    
if __name__ == "__main__":
    nums = [2,7,11,15]
    target = 9
    solution = Solution()
    print(solution.twoSum(nums, target))