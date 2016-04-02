#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
	/**
	* @param nums: a vector of integers
	* @return: nothing
	*/
	void partitionArray(vector<int> &nums) {
		// write your code here
		int i = 0;
		int j = nums.size() - 1;
		while (i < j)
		{
			while (nums.at(i) % 2 != 0) i++;
			while (nums.at(j) % 2 == 0) j--;
			if (i < j) {
				swap(nums.at(i), nums.at(j));
			}
		}
	}
};

int main() {
	Solution s;
	vector<int> v;
	v.push_back(1);
	v.push_back(3);
	v.push_back(2);
	v.push_back(4);
	s.partitionArray(v);
	
}

