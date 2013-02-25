#include <iostream>
#include <cmath>
#include <climits>
using namespace std;


class Solution {
public:
    int divide(int dividend, int divisor) {
        
        int sign;
       
        
        if (divisor==0) {
            throw divisor;
        }
        if (abs(divisor) == 1 ) 
        {
            return divisor * dividend;
        }
        if ( ( divisor >0 && dividend>0 ) || (dividend < 0 && divisor < 0) ){
            sign = 1;
        } else {
            sign = -1;
        }

	if (abs(divisor) ==2 )
	{
		return sign * dividend >> 1;
	}
        
        int tmp = abs(dividend);
        divisor = abs(divisor);
        
        int count = 0;
        
        while (tmp >= divisor) {
            
            tmp = tmp - divisor;
            count ++;
        }
        
        return sign * count;
        
        
         
        
    }
};

int main(int argc, char *argv[])
{
    
    Solution sol;
    int output = sol.divide(INT_MAX,1);
    cout << output << endl;
    return 0;
}
