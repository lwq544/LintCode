#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
	/**
	* @param n: an integer
	* @return an integer f(n)
	*/
	int fibonacci(int n) {
		// write your code here
		int a = 0, b = 1, c = 0;
		if (n == 1) return 0;
		else if (n == 2) return 1;
		else {
			for (int i = 0; i < n - 2; i++)
			{
				c = a + b;
				a = b;
				b = c;
			}
			return c;
		}
	}
};

int main() {
	Solution s;
	cout << s.fibonacci(5) << "\n";
}

