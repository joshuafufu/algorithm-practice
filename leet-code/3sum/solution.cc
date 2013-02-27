#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    vector<vector<int> > threeSum(vector<int> &num) {
        vector< vector<int> > output;
        int len = num.size();
        if(len < 3) 
        {
            return output;
        }
        
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
                if(a+b+c==0){
                    vector<int> x;
                    x.push_back(a);
                    x.push_back(b);
                    x.push_back(c);
                    
                    vector< vector<int> > ::iterator ret;
                    ret = find(output.begin(), output.end(), x);

                    if (ret == output.end()) {
                        output.push_back(x);
                    }


                    l--;;
                    k++;
                }else if (a + b +c>0){
                    l--;
                }else{
                    k++;
                }
            }
        }
        return output;
    }
};

int main(int argc, char *argv[])
{
    Solution sol;
    int A[] = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
    vector<int> B( A, A+15 );
    vector< vector<int> > C = sol.threeSum(B);
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
