若A=[3, 4, 5, 8], m=10,其动态规划过程如下表：

|       | 背包大小0 | 背包大小1 | 背包大小2 | 背包大小3 | 背包大小4 | 背包大小5 | 背包大小6 | 背包大小7 | 背包大小8 | 背包大小9 | 背包大小10 |
| ----- | ----- | ----- | ----- | ----- | ----- | ----- | ----- | ----- | ----- | ----- | ------ |
| 前0个物品 | 0     | 0     | 0     | 0     | 0     | 0     | 0     | 0     | 0     | 0     | 0      |
| 前1个物品 | 0     | 0     | 0     | 3     | 3     | 3     | 3     | 3     | 3     | 3     | 3      |
| 前2个物品 | 0     | 0     | 0     | 3     | 4     | 4     | 4     | 7     | 7     | 7     | 7      |
| 前3个物品 | 0     | 0     | 0     | 3     | 4     | 4     | 4     | 7     | 7     | 7     | 7      |
| 前4个物品 | 0     | 0     | 0     | 3     | 4     | 4     | 4     | 7     | 8     | 9     | **9**  |

