#include <iostream>
#include <stack>

using namespace std;


class Solution {
public:
    bool isValid(string s) {
        stack<char> mystack;

        for (size_t i=0; i != s.size(); ++i)
        {
            if(s[i]=='(' || s[i]=='[' || s[i] == '{') 
            {
                mystack.push(s[i]);
            }
            if(  s[i]==')'){
                if (mystack.empty()) {
                    return false;
                }
                if (mystack.top() != '('){
                    return false;
                }else {
                    mystack.pop();
                }
            }
            if( s[i]==']'){
                if (mystack.empty()) {
                    return false;
                }

                if (mystack.top() != '[') {
                    return false;
                } else {
                    mystack.pop();
                }
            }
            if( s[i]=='}'){
                if (mystack.empty()) {
                    return false;
                }
                if (mystack.top() != '{') {
                    return false;
                } else {
                    mystack.pop();
                }
            }  

        }
        
        if (!mystack.empty()) {
            return false;
        }
        return true;
        
    }
};

int main(int argc, char *argv[])
{
    
    Solution sol;
    string s("]");
    cout << sol.isValid(s) << endl;

    return 0;
}
