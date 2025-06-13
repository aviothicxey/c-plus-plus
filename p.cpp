// #include<iostream>
// using namespace std;
// int main(){
//     cout << "Hello, World!" << endl;
//     return 0;
// }

// #include <iostream>
// using namespace std;
// int main(){
//     int x;
//     cin >> x;
//     cout<<"you enterted:\t"<< x <<"\there";
//     return 0;
// }

// #include <iostream>
// using namespace std;
// int main(){
//     string x;
//     cout<<"enter a string: ";
//     cin>> x;
//     cout<< "length of string: "<<x.length();
// return 0;
// }

#include <iostream>
using namespace std;

int main(){
    int ages[]={20,22,18,35,48,26,87,70};
    float avg,sum=0;
    int i;
    int length= sizeof(ages)/sizeof(ages[0]);
    for(int i  : ages){
        sum = sum + i;
    }
    avg = sum / length;
    cout << "Average age is: " << avg << endl;
   
    return 0;
}