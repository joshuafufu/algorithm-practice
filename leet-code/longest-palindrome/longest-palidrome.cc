#include <iostream>
#include <algorithm>
using namespace std;

class Solution {
public:
    string longestPalindrome(string s) {
        string tmp(s);
        reverse(s.begin(),s.end());
        
        int len = s.size();
        
        int maxlen = 0;
        string maxstr;
        int count = 0;

        int m = 0;
        int n = 0;
        
        for (int i = 0; i < len; ++i)
        {
            while(i<len)

            for (int j = 0; j < len; ++j)
            {
                m = i;
                n = j;
                count = 0;
                while (tmp[m++] == s[n++] && n <= len && m <= len){
                    count++;
                }
                if (count > maxlen) {
                    maxstr = tmp.substr(i, count);
                    maxlen = count;
                }
            }
        }
       
        return maxstr;    
    }
};

int main(int argc, char *argv[])
{
    Solution sol;
    string input(argv[1]);
    string result = sol.longestPalindrome(input);
    cout << result << endl;
    return 0;
}
