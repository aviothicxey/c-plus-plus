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

// palindrome of numbers:
#include <iostream>
using namespace std;
int main() {
    int num, originalNum, reversedNum = 0;
    cout << "Enter a number: ";
    cin >> num;
    
    originalNum = num; 
    while (num > 0) {
        int digit = num % 10; 
        reversedNum = reversedNum * 10 + digit; 
        num /= 10;
    }
    
    if (originalNum == reversedNum) {
        cout << "The number is a palindrome." << endl;
    } else {
        cout << "The number is not a palindrome." << endl;
    }
    
    return 0;
}