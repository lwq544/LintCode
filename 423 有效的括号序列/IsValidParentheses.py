class Solution:
    # @param {string} s A string
    # @return {boolean} whether the string is a valid parentheses
    def isValidParentheses(self, s):
        # Write your code here
        while '()' in s or '{}' in s or '[]' in s:
            s = s.replace('()', '').replace('[]', '').replace('{}', '')
        if s == '':
            return True
        return False
