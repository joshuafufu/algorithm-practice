#include <iostream>
using namespace std;

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int maxlen=0;
        
        int n=s.size();
        int i=0,j=0;
        bool exist[128] = {false};
        
        while(j<n)
        {
            if (exist[s[j]]) {
                maxlen = max(maxlen,j-i);
                while (s[i] != s[j]) {
                    exist[s[i]] = false;
                    i++;
                }
                i++;
                j++;
            } else {
                exist[s[j]] = true;
                j++;
            }
           
            
        }
        maxlen = max(maxlen,n-i);
        return maxlen;

    }
};

int main(int argc, char *argv[])
{
    Solution solution;
    string s("abcabcbb");
    cout<<solution.lengthOfLongestSubstring(s)<<endl;
    return 0;
}
