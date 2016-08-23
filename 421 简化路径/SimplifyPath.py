class Solution:
    # @param {string} path the original path
    # @return {string} the simplified path
    def simplifyPath(self, path):
        # Write your code here
        l = [x for x in path.split('/') if x != '']
        if not l:
            return '/'
        else:
            try:
                stack = []
                for x in l:
                    if x == '..':
                        stack.pop()
                    elif x == '.':
                        pass
                    else:
                        stack.append(x)
                return '/' + '/'.join(stack)
            except IndexError:
                return '/'