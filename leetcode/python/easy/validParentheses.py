class Solution:
    def __init__(self) -> None:
        self.__stack = []
        pass

    def isValid(self, brackets: str) -> bool:
        if len(brackets) <= 1:
            return False
        isValid = True
        for bracket in brackets:
            if not self.__stack and not self.__isOpen(bracket):
                isValid = False
                break
            if not self.__isOpen(bracket) and not self.__isMatchingClose(bracket):
                isValid = False
                break
            if self.__isOpen(bracket):
                self.__stack.append(bracket)
            if self.__isMatchingClose(bracket):
                self.__stack.pop()
        if self.__isUnclosedRemaining():
            isValid = False
        self.__stack.clear()
        return isValid

    def __isOpen(self, bracket: str) -> bool:
        if bracket == "(" or bracket == "{" or bracket == "[":
            return True
        else:
            return False

    def __isMatchingClose(self, bracket: str) -> bool:
        if self.__peek() == "(" and bracket == ")":
            return True
        if self.__peek() == "{" and bracket == "}":
            return True
        if self.__peek() == "[" and bracket == "]":
            return True
        return False

    def __isUnclosedRemaining(self) -> bool:
        return self.__isOpen(self.__peek())

    def __peek(self):
        if self.__stack:
            return self.__stack[-1]


solution = Solution()
# ============= Scenarios =============
print(solution.isValid("(("))
print(solution.isValid("["))
print(solution.isValid("(]"))
print(solution.isValid("()[]{}"))
print(solution.isValid("{[]}"))
print(solution.isValid("{}({{[]}})"))
