import copy


def permute(nums):
    if nums == None:
        return result
    arrage(nums, len(nums), 0)
    return result


def arrage(nums, n, k):
    if n == k:
        result.append(copy.deepcopy(nums))
    else:
        for i in range(k, n):
            swap(nums, k, i)
            arrage(nums, n, k + 1)
            swap(nums, i, k)


def swap(nums, x, y):
    temp = nums[x]
    nums[x] = nums[y]
    nums[y] = temp


result = []

permute([1, 2, 3])

print result
