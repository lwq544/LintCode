class SegmentTreeNode:
    def __init__(self, start, end, max):
        self.start, self.end, self.max = start, end, max
        self.left, self.right = None, None

# @param root, start, end: The root of segment tree and
#                          an segment / interval
# @return: The maximum number in the interval [start, end]
def query(root, start, end):
    # write your code here
    if root.start > end or root.end < start:
        return -0x7fffff

    if start <= root.start and root.end <= end:
        return root.max

    return max(query(root.left, start, end), \
               query(root.right, start, end))


a = SegmentTreeNode(0,3,4)
a.left = SegmentTreeNode(0,1,4)
a.right = SegmentTreeNode(2,3,3)
a.left.left = SegmentTreeNode(0,0,1)
a.left.right = SegmentTreeNode(1,1,4)
a.right.left = SegmentTreeNode(2,2,2)
a.right.right = SegmentTreeNode(3,3,3)

print (query(a, 0, 2))
