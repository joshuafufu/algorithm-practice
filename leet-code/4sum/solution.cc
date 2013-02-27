#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    vector<vector<int> > fourSum(vector<int> &num, int target) {
        vector< vector<int> > output;
        int len = num.size();
        if(len < 4) 
        {
            return output;
        }
        
        sort(num.begin(), num.end());
        
        int k=0;
        int l=0;

        int a=0;
        int b=0;
        int c=0;
        int d=0;

        for (int i = 0; i <= len-4; ++i)
        {
            for ( int j = i+1; j <= len-3; ++j)
            {
                a=num[i];   
                k=j+1;
                l=len-1;

                while(k<l) {
                    b=num[j];
                    c=num[k];
                    d=num[l];

                    if(a+b+c+d==target){
                        vector<int> x;
                        x.push_back(a);
                        x.push_back(b);
                        x.push_back(c);
                        x.push_back(d);
                    
                        vector< vector<int> > ::iterator ret;
                        ret = find(output.begin(), output.end(), x);

                        if (ret == output.end()) {
                            output.push_back(x);
                        }
                        
                        l--;
                        k++;

                    } else if ( a+b+c+d > target) {
                        l--;
                    } else {
                        k++;
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
    int A[] = {1,0,-1,0,-2,2};
    vector<int> B( A, A+6 );
    vector< vector<int> > C = sol.fourSum(B,0);
    for(vector< vector<int> >::iterator it=C.begin(); it!=C.end(); ++it)
    {
        for(vector<int> :: iterator itx=(*it).begin(); itx!=(*it).end(); ++itx)
        {
            cout << *itx <<" "  ;
        }
        cout<<endl;

    }
    return 0;
}
