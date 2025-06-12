#include<iostream>
using namespace std;
int main(){
    string str;
    string x;
    cout <<"enter a string: ";
    getline(cin,str);
    for (int i = 0; i < str.length(); i++) {
        if (str[i] == ' ') {
            continue;
        }
        x = x + str[i];
    }
    cout << "String after removing spaces: " << x << endl;
    return 0;

}