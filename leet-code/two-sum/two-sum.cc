#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int> &numbers, int target) {
        vector<int> v(2);
        int x=1;
        for (vector<int>::iterator iter = numbers.begin(); iter!=--numbers.end(); ++iter)
        {
            vector<int>::iterator iter2 = iter;
            iter2++;
            int y = x+1;
            for(iter2; iter2!=numbers.end(); ++iter2){

                if(*iter2 + *iter == target) {
                    v[0]=x;
                    v[1]=y;
                    return v;
                }
                y++;
            }
            x++;
        }

        return v;
    }
};


int main() {
    Solution solution;
    int arr[3] = {5,75,25};
    vector<int> v(arr, arr+3);
    vector<int> result = solution.twoSum(v, 100);
    
    cout<<result[0]<<endl;
    cout<<result[1]<<endl;
    return 0;
}
