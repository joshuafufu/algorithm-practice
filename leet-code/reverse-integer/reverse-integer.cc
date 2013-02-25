#include <iostream>
using namespace std;

class Solution {
public:
    int reverse(int x) {
        int sign = x > 0 ? 1:-1;
        x=abs(x);

        int ret=0;

        while(x)
        {
            int digit = x%10;
            ret = ret*10 + digit;
            x /= 10;
        }

        return ret*sign;
    }
};

int main(int argc, char *argv[])
{
    Solution sol;
    cout << sol.reverse(12) << endl;
    return 0;
}
