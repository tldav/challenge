from typing import Optional

from struct.ListNode import ListNode


class LinkedList:
    def __init__(self) -> None:
        self.head = None
        self.tail = None


class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        print("hi Nicole <3")
        joinedList = list1 + list2
        joinedList.sort()
        print(joinedList)
        return joinedList


hi = Solution()

hi.mergeTwoLists([1, 2, 3], [4, 5, 6])
