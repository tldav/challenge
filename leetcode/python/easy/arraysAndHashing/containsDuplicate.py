from typing import List


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hash = {}
        hasDuplicate = False

        for num in nums:
            if hash.get(num):
                hasDuplicate = True
                break
            else:
                hash[num] = 1

        return hasDuplicate


solve = Solution()

solve.containsDuplicate([1, 2, 3, 1])
solve.containsDuplicate([1, 2, 3, 4])
solve.containsDuplicate([1, 1, 1, 3, 3, 4, 3, 2, 4, 2])
