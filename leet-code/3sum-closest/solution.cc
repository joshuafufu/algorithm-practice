#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int threeSumClosest(vector<int> &num, int target) {
        int len = num.size();
        int min = INT_MAX;

        int output = 0;

        sort(num.begin(), num.end());

        int k=0;
        int l=0;
        int a=0;
        int b=0;
        int c=0;
        
        for (int i = 0; i <= len-3; ++i)
        {
            a=num[i];
            k=i+1;
            l=len-1;
            while(k<l) {
                b = num[k];
                c=num[l];
                if(a+b+c==target){
                    return a+b+c;
                    
                }else if (a + b +c>target){
                    l--;
                    if (min>a+b+c-target) {
                        min = a+b+c-target;
                        output = a+b+c;
                    }
                }else{
                    k++;
                    if(min>target-a-b-c) {
                        min = target-a-b-c;
                        output = a+b+c;
                    }
                }
            }
        }
        return output;

    }
};

int main(int argc, char *argv[])
{
    Solution sol;
    int A[] = {0,1,2};
    vector<int> B(A, A+3);

    
    cout << sol.threeSumClosest(B, 3) << endl;
    return 0;
}
