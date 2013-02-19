#include <iostream>
using namespace std;

class Solution {
public:
    double findMedianSortedArrays(int A[], int m, int B[], int n) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        int C[m+n];
        int i,j,k;
        i=j=k=0;
        while (i<m && j<n){
            if(A[i] < B[j]){
                C[k++]=A[i++];
            } else {
                C[k++]=B[j++];
            }
        }

        while (i<m){
            C[k++]=A[i++];
        }

        while (j<n){
            C[k++]=B[j++];
        }

        double median=0;

        if ((m+n)%2==0) {
            int a = (m+n+1)/2;
            int b = (m+n+1)/2 -1;
            median=(C[a] + C[b])/2.0;
        }else {
            median = C[(m+n)/2];
        }
        return median;
    }
};

int main() {
    Solution solution;
    int A[5] = {6,7,8,9,10};
    int B[5] = {1,2,3,4,5};
    
    double result = solution.findMedianSortedArrays(A, 5, B, 5);
    
    cout << result << endl;
    return 0;
}
