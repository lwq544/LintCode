#include<iostream>
using namespace std;

class Solution {
public:
	// param n : description of n
	// return: description of return 
	long long trailingZeros(long long n) {
		long count = 0;
		while (n / 5 > 0)
		{
			n = n / 5;
			count += n;
		}
		return count;
	}
	
};

int main() {
	Solution s;
	printf("%d", s.trailingZeros(11));
}

