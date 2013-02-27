#include <iostream>

using namespace std;

class Solution {
public:
    int removeDuplicates(int A[], int n) {
        int i=0;
        int j;

        if (n<=1){
            return n;
        }

        for (j=1; j < n; ++j)
        {
            if(A[j] != A[i])
            {
                A[++i] = A[j];
            }
        }

        return i+1;
    }



    
};

int main(int argc, char *argv[])
{
    Solution sol;
    int A[] = {1,2,2};
    
    cout << sol.removeDuplicates(A, 3) << endl;
    return 0;
}
