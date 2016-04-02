#include<iostream>
using namespace std;

class Solution {
public:
	int digitCounts(int k, int n) {
		// write your code here
		int count = 0;
		for (int i = 0; i <= n; i++)
		{
			count += countTheNumber(k, i);
		}
		return count;
	}
	int countTheNumber(int k, int num) {
		int count = 0;
		while (num >= 10)
		{
			if (num % 10 == k) count++;

			num = num / 10;
		}
		if (num == k) count++;
		return count;
	}
};

int main() {
	Solution s;
	cout << s.digitCounts(0, 19) << "\n";
}

