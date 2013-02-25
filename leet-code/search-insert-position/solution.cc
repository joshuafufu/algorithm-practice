#include <iostream>

using namespace std;

class Solution {
public:
    int searchInsert(int A[], int n, int target) {
        int start = 0;
        int end = n - 1;
        int middle = 0;
 
        if (A[end] < target) {
            return n;
        }
        if (A[start] > target) {
            return 0;
        }


        middle = (n-1)/2;

        while ( end - start > 1)
        {
            if (A[middle] == target) {
                return middle;
            }
            if (A[middle] > target) {
                end = middle;
            }
            if (A[middle] < target) {
                start = middle;
            }

            middle = (start+end) /2;
            
                
        }

        if(A[middle] == target) {

            return middle;
        }
        if (A[middle] < target) {
            return middle + 1;
        }
    }
};

int main(int argc, char *argv[])
{
    
    Solution sol;
    int A[] = {1,3,5,6};
    int output1 = sol.searchInsert(A, 4, 5);
    cout << output1 << endl;

    int output2 = sol.searchInsert(A, 4, 2);
    cout << output2 << endl;

    int output3 = sol.searchInsert(A, 4, 7);
    cout << output3 << endl;

    int output4 = sol.searchInsert(A, 4, 0);
    cout << output4 << endl;

    int B[] = {1,3,5};
    int output5 = sol.searchInsert(B, 3, 4);
    cout << output5 << endl;
    return 0;
}
