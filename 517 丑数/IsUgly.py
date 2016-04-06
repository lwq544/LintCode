def isUgly(num):
    if num == 0:
        return False
    while num % 2 == 0 or num % 3 == 0 or num % 5 == 0:
        if num % 2 == 0:
            num = num / 2
        elif num % 3 == 0:
            num = num / 3
        else:
            num = num / 5
    if num == 1:
        return True
    return False


print isUgly(67)
