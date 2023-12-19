from typing import List
from collections import defaultdict


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        frequencyMap = {}
        for num in nums:
            if frequencyMap.get(num):
                frequencyMap[num] += 1
            else:
                frequencyMap[num] = 1

        print(frequencyMap)

        sorted(frequencyMap.items(), key=lambda x: x[1], reverse=True)

        return None


solve = Solution()

solve.topKFrequent(
    [
        1,
        1,
        1,
        3,
        2,
        2,
        2,
        2,
        2,
        2,
    ],
    2,
)
