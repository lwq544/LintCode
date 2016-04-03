#include<iostream>
using namespace std;

class Solution {
public:
	/**
	* @param num an integer
	* @return true if num is an ugly number or false
	*/
	bool isUgly(int num) {
		// Write your code here
		if (num == 0) return false;
		while (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
			if (num % 2 == 0) num = num / 2;
			else if (num % 3 == 0) num = num / 3;
			else num = num / 5;
		}
		if (num == 1) return true;
		return false;
	}
};

int main() {
	Solution s;
	cout << s.isUgly(7)<<"\n";
	
}

