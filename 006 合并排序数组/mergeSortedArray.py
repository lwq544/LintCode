def mergeSortedArray(A, B):
    # write your code here
    list = []
    i = 0
    j = 0
    while i < len(A) and j < len((B)):
        if A[i] <= B[j]:
            list.append(A[i])
            i += 1
        else:
            list.append(B[j])
            j += 1
    while i < len(A):
        list.append(A[i])
        i += 1
    while j < len(B):
        list.append(B[j])
        j += 1
    return list


result = mergeSortedArray([1, 2, 3, 4], [2, 4, 5, 6])
for x in range(0, len(result)):
    print result[x],
