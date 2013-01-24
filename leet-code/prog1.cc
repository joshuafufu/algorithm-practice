#include <iostream>
#include <bitset>
using std::cin;
using std::cout;
using std::endl;
using std::string;
using std::bitset;


// int main(int argc, char *argv[])
// {
//   //std::cout << "Enter two numbers:" << std::endl;
//   //int v1,v2;
//   //std::cin >> v1 >> v2;
//   //std::cout << "The sum of " << v1 << "and" << v2 << " is " << v1+v2 << std::endl;
//   //std::cout << /* "*/" */;
//   //int sum = 0, value;
  
//   string line;
//   string s("Hello World!!!");
//   string s2;
//   cout << s2[0] << endl;				\
//   string::size_type punct_cnt = 0;
//   for (string::size_type index = 0; index != s.size(); ++index)
//     {
//       if(ispunct(s[index]))
// 	++punct_cnt;
//     }

//   cout << punct_cnt
//        << "punctuation characters in " << s << endl;

//   //  while(getline(cin, line))
//   //{
//   //  cout << line << endl;
//   //}
//   //std::cout << "Sum is: " << sum << std::endl;
//   return 0;
// }
int test()
{

    return 0;
}

int main(int argc, char *argv[])
{
    //isalpha<32> bitvec2(0xffff);
    //cout << "bitvec2: " << bitvec2 << endl;
  
    char c[] = "C++";
    cout << c[3] << endl;
  
    string s("hello world");
    string *sp = &s;

    char *cp = c;
    char *cp2 = cp + 1;
    cout << &(*cp) << " " <<  &(*cp2) << endl;

  return 0;
}
