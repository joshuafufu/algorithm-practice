#include <iostream>
#include <cmath>
#include <climits>
#include <bitset>
using namespace std;


class Solution {
public:
    int divide(int dividend, int divisor) {
               
        if (divisor==0) {
            throw divisor;
        }
        
        int bits = sizeof(int) * 8;

        int count = 0;
        bool sign = false;
        unsigned int big = dividend;
        if(dividend<0){
            sign = true;
            big = ~(big - 1); // get -1 * dividend
        }

        unsigned int small = divisor;
        if(divisor<0)
        {
            sign = !sign;
            small = ~(small -1 );
        }

        int offset = 0;
        int mask = 0x01 << (bits - 1);
        while( ( 0 == (small&mask)) && (small << 1) <= big)
        {
            ++offset;
            small = small << 1;
        }
        
        int result = 0;
        while (offset >=0) {
            if ( big >=small){
                result += (0x01 << offset);
                big -= small;
            }
            --offset;
            small = small >> 1;
        }

        if(sign){
            return 0-result;
        }
        return result;
    }
};

int main(int argc, char *argv[])
{
    
    Solution sol;
    int output = sol.divide(20,3);
    cout << output << endl;


    return 0;
}
