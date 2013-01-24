#include <iostream>
#include <math.h>
using namespace std;

int main(int argc, char *argv[])
{
    string st(argv[1]);
    bool isPalidrome = true;
    for (string::size_type ix=0; ix != ceil(st.size()/2.0); ++ix){
        cout << ix << endl;
         if (isalnum(st[ix])){
            char lo = tolower(st[ix]);
            char cmp = st[st.size() - ix -1];
            if (lo == cmp) {
                continue;
            }else {
                isPalidrome = false;
                break;
            }
         }
    }
    
    if (isPalidrome) {
        cout << st << " is a palidrome." << endl;
    }else {
        cout << st << " is not a palidrome." << endl; 
    }

    return 0;
    
}
