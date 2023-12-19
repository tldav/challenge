from typing import List
from collections import defaultdict

# class Solution:
#     def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

#         hashMap = {}

#         for s in strs:

#         return None


# solve = Solution()

# solve.groupAnagrams(["eat","tea","tan","ate","nat","bat"])

# [["bat"],["nat","tan"],["ate","eat","tea"]]


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = defaultdict(list)

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord("a")] += 1
                print(count)
            ans[tuple(count)].append(s)
        print(ans.values())
        return ans.values()


solve = Solution()

solve.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])

print([0] * 26)
