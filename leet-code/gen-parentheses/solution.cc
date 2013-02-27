#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string> ans;
        if(n>0) {
            gen(ans, "", 0, 0, n);
        }

        return ans;
        
    }

    void gen(vector<string> & ans, string s, int l, int r, int n)
    {
        cout << s << endl;
        cout << l << " " << r << endl;
        if (l==n)
        {
            ans.push_back(s.append(n-r, ')'));
            return;
        }
        gen(ans, s+'(', l+1, r, n);
        if (l>r) {
            gen(ans, s+')', l, r+1, n);
        }
    }

    // vector<string> generateParenthesis(int n) {
    //     vector<string> ans;
    //     if (n>0)
    //     {
    //         generator(ans, "", 0, 0, n);
    //     }
    //     return ans;
    // }
    // // l/r: appearance of '(' / ')'
    // void generator(vector<string> & ans, string s, int l, int r, int n) {
    //     if (l == n) {
    //         ans.push_back(s.append(n-r, ')'));
    //         return;
    //     }
    //     cout << l << " "<<r<<endl;
    //     generator(ans, s+'(', l+1, r, n);
    //     if (l>r)
    //     {
    //         generator(ans, s+")", l, r+1, n);
    //     }
    // }

};

int main(int argc, char *argv[])
{
    Solution sol;
    vector<string> v;
    v=sol.generateParenthesis(3);
    for (vector<string>::iterator it=v.begin();it!=v.end() ; ++it)
    {
        cout << *it << endl;
        
    }
    return 0;
}
