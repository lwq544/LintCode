先扫描一遍数组，把负数放左边，正数放右边。

然后分三种情况从两边遍历数组：

- 正负数个数相等：分别从左右第一个数开始遍历，增量为2；
- 正数个数多于负数：分别从左边第一个，右边第二个开始遍历，增量为2；
- 正数个数小于负数：分别从左边第二个，右边第一个开始遍历，增量为2。

