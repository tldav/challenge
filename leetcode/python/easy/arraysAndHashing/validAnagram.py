class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        sMap = {}
        tMap = {}

        for char in s:
            if sMap.get(char):
                sMap[char] += 1
            else:
                sMap[char] = 1

        for char in t:
            if tMap.get(char):
                tMap[char] += 1
            else:
                tMap[char] = 1

        return sMap == tMap


solve = Solution()

solve.isAnagram("anagram", "nagaram")


# neetcode solution:
# class Solution:
#     def isAnagram(self, s: str, t: str) -> bool:
#         if len(s) != len(t):
#             return False

#         countS, countT = {}, {}

#         for i in range(len(s)):
#             countS[s[i]] = 1 + countS.get(s[i], 0)
#             countT[t[i]] = 1 + countT.get(t[i], 0)
#         return countS == countT
