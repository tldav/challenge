from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        prefix = strs[0]
        shouldBreak = False
        if not strs:
            return ""
        for str in strs:
            if len(str) <= 0:
                prefix = ""
                break
            if prefix != str:
                for i, char in enumerate(str, 0):
                    if char != prefix[i]:
                        prefix = prefix[0:i]
                        shouldBreak = True
                        break
            if shouldBreak:
                break
        print(prefix)
        return prefix


hi = Solution()
# hi.longestCommonPrefix(["flower","flow","flight"])
# hi.longestCommonPrefix(["dog","racecar","car"])
hi.longestCommonPrefix(["ab", "a"])


# cheater
# class Solution:
#     def longestCommonPrefix(self, strs: List[str]) -> str:
#         ans = ''
#         n = len(min(strs))
#         for i in range(n):
#             if all(x[i]==strs[0][i] for x in strs):
#                 ans = ans + strs[0][i]
#             else:
#                 break
#         return ans
