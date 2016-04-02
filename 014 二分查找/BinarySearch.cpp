#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
	int binarySearch(vector<int> &array, int target) {
		// write your code here
		int start = 0;
		int end = array.size();
		int mid = 0;
		int index = -1;
		while (start <= end) 
		{
			mid = (start + end) / 2;
			if (target == array.at(mid)) {
				index = mid;
				while ((mid-1) >= 0 && array.at(mid-1) == target)
				{
					mid = mid - 1;
					index = mid;
				}
				return index;
			}
			else if (target < array.at(mid))
			{
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
		}
		return index;
	}
};

int main() {
	Solution s;
	vector<int> v;
	v.push_back(1);
	v.push_back(2);
	v.push_back(3);
	v.push_back(3);
	v.push_back(4);
	v.push_back(5);
	v.push_back(10);
	cout << s.binarySearch(v, 1) << "\n";
	// cout << v.at(4) << "\n";
}

