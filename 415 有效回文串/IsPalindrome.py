def isPalindrome(s):
    s = s.lower()
    i = 0
    j = len(s) - 1
    while i < j:
        while i < len(s) and not s[i].isdigit() and not s[i].isalpha():
            i += 1
        while j >= 0 and not s[j].isdigit() and not s[j].isalpha():
            j -= 1
        if i < len(s) and j >= 0 and s[i] != s[j]:
            return False
        i += 1
        j -= 1
    return True

print isPalindrome('si 232 ,is')