#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int> &numbers, int target) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        vector<int>::iterator iter = numbers.begin();
        for (vector<int>::iterator iter = numbers.begin(); iter!=numbers.end(); ++iter)
        {
            cout << *iter << endl;
        }
        vector<int> v;
        return v;
    }
};


int main() {
    Solution solution;
    int arr[4] = {1,2,3,4};
    vector<int> v(arr, arr+4);
    solution.twoSum(v, 3);
    
    return 0;
}
