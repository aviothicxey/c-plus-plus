#include<iostream>
using namespace std;
int main(){
    string str,rev = "";
    cout <<"enter a string: ";
    getline(cin,str);
    for (int i = str.length() - 1; i >= 0; i--) {
        rev += str[i]; // Append characters in reverse order
    }
    if(str == rev){
        cout << "The string is a palindrome." << endl;
    } else {
        cout << "The string is not a palindrome." << endl;
    }
    return 0;
}